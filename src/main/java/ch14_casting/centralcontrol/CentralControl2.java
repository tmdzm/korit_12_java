package ch14_casting.centralcontrol;

public class CentralControl2 {
    private Power[] deviceArray ;


    public CentralControl2(Power[] powers) {
        deviceArray = powers;
    }

    public void addDevice(Power device){
        int emptyIndex = checkEmpty();
        if(emptyIndex==-1) {
            System.out.println("더이상 장치를 연결 할 수 없습니다.");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+"추가");
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
            deviceArray[i] = null;
        }
    }

    public void deleteDevice(String st){//여러모로 맘에 들지 않는방식
        for(int i=0;i<deviceArray.length;i++){
            if(deviceArray[i] == null) continue;//비어있는걸 만나면 equals가 동작 안한다, 아니면 getClass던가
            else if(st.equals(deviceArray[i].getClass().getSimpleName())){//.equals(st)){
                deviceArray[i] = null;//지정된 이름을 전부 지운다.
            }
        }
    }

    public void deleteDevice(int cnt){
        if(deviceArray.length<=cnt||cnt<=0) {
            System.out.println("올바르지 않은 수 입니다.");
            return;
        }
        System.out.println(deviceArray[cnt-1]+"는 삭제되었습니다.");
        deviceArray[cnt-1] = null;
    }
}

