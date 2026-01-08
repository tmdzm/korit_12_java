package ch14_casting.centralcontrol;

public class CentralControl {
    private Power[] deviceArray ;


    public CentralControl(Power[] powers) {
        deviceArray = powers;
    }

    public void addDevice(Power device){
        //1.비어있는지 체크
        int emptyIndex = checkEmpty();//원랜 0이었음
//        for(int i =0;i< deviceArray.length;i++){
//            if(deviceArray[i]==null) emptyIndex = i;
//            else emptyIndex = -1;
//        }
        //비어있다면 넣고 아니면 만다
        if(emptyIndex==-1) {
            System.out.println("더이상 장치를 연결 할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+"추가");//getClass(), 클래스 명을 return하는 메소드
        /*
           .getClass().getSimpleName 클래스명만 리턴, 위는 패키지까지 나타낸다.
           메소드 하나에 기능 하나,이를위해 메소드를 나눠야겠다.
         */
    }

    public int checkEmpty(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) return i;
        }
        return -1;
    }

    public void powerOn(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) continue;
            else deviceArray[i].on();
        }
        /*
            on/off 메소드를 공통적으로 지니고 있는데
            power 자료형으로 업캐스팅도 되어있다.
         */
    }

    public void powerOff(){
        int i = 0;
        for(Power p : deviceArray){
            if(deviceArray[i] == null){
                System.out.println("장치가 없어 전원을 끌 수 없습니다.");
                //continue;
            }
            else deviceArray[i].off();
            i++;
        }
//        for(int i=0;i<deviceArray.length;i++){
//            if(deviceArray[i] == null) continue;
//            else deviceArray[i].off();
//        }
    }


    public void showInfo(){
        int i = 0;
        for(Power p : deviceArray){
            if(deviceArray[i] == null){
                System.out.println("슬롯 ["+(i+1)+"] 번 : Empty");
                i++;
                continue;
            }
            else System.out.println("슬롯 ["+(i+1)+"] 번 : "+deviceArray[i].getClass().getSimpleName());
            i++;
        }
    }

    public void performSpecificMethod(){//다운캐스트
        for(Power device : deviceArray){
            if(device instanceof AirConditioner){
                //근데 이 괄호, getClass().getSimpleName()으로 해도 되나? 안됨
                AirConditioner airConditioner = (AirConditioner) device;
                airConditioner.changeMode();
            }  else if(device instanceof Computer){
                Computer computer = (Computer) device;
                computer.compute();
            }  else if(device instanceof LED){
                LED led = (LED) device;
                led.twinkle();
            }  else if(device instanceof Mouse){
                Mouse mouse = (Mouse) device;
                mouse.miki();
            }  else if(device instanceof Printer){
                Printer printer = (Printer) device;
                printer.print();
            }  else if(device instanceof Speaker){
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            }  else if(device == null){
                System.out.println("해당 슬롯은 연결되어 있지 않습니다.");
            }  else {
                System.out.println("해당기기는 아직 지원하지 않습니다.");
            }
        }
    }

    public void deleteDevice(){
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) continue;
            else deviceArray[i] = null;
        }
    }

    public void deleteDevice(String st){//여러모로 맘에 들지 않는방식
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) continue;
            else if(st.equals(deviceArray[i].getClass().getSimpleName())){//.equals(st)){
                deviceArray[i] = null;//지정된 이름을 전부 지운다.
            }
        }
    }//st.equals(deviceArray[i].getClass().getSimpleName())는 오류남 왜지

    public void deleteDevice(int cnt){
        if(deviceArray.length<=cnt||cnt<0) {
            System.out.println("올바르지 않은 수 입니다.");
            return;
        }
        deviceArray[cnt] = null;
    }
}
/*
    printer 클래스와 Speaker 클래스를 생성하고 Power를 imple하라

 */

 /*
    java의 index 넘버에는 음수값이 없기 때문에 실패를 나타낼때 -1을 쓰는 경우가 많다.
    하지만 0과 너무 가까운 숫자라 -100처럼 더 작은 음수를 쓰기도 한다.
     */


/*
            그래서 여기에 deviceArray에 element를 추가하는 메서드를 작성할건데,
            배열의 특성 상 lastIndex+1 개의 방을 가지게 될겁니다. 그런데 5개의 방을 가지고 있는데
            6개 째의 Power 하위 클래스의 객체를 집어넣게 되면 오류가 발생하게 될거라는 걸 추측할 수 있으므로,
            우리는 추가하기 전에 일단 배열에 비어있는곳이 있는지를 체크하도록 할 예정
            그러면 추가하는 메서드를 정의할 때의 로직은
            1. deviceArray 필드 내에 비어있는 방이 있는지 체크
            2. 비어있다면 추가
            3. 없다면 거절
            해당 단계로 메서드를 작성
        */

/*
    Power 내부에는 .on()이라는 메소드가 있다. 배열내에 있는 element들은 전부 .on() 메서드를 강제로 구현했어야만 한다.
    그러니까 객체면.on을 호출하면 element들 전부 전원이 켜진..다고?
    mouse.on, computer.on을 실행하면 안된다.
 */

//ctrl shift f 는 모든 파일중에서 찾을 수 있다