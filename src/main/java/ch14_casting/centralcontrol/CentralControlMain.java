package ch14_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        Power airConditioner1 = new AirConditioner();
        Computer computer1 = new Computer();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer print1 = new Printer();
        Speaker speaker1 = new Speaker();
        CentralControl centralControl1 = new CentralControl(new Power[6]);
        Power[] powers = {new AirConditioner(),new Computer(), new Mouse(), new LED()};//전부 power로 업캐스팅이 되어서 배열에 들어갈 수 있다.

        /*
            근데 저희는 여기서 막 전자기기들의 객체를 생성하고 여기서 집어넣는 것까지
            전체 다 실험할 예정이기 때문에
            powers를 직접 쓰지는 않을것
         */

        //deviceArray는 프라이빗, 어떻게 접근할까
        //setter?

        centralControl1.addDevice(airConditioner1);//호출한 시점에 이미 업캐스팅
        centralControl1.addDevice(computer1);
        centralControl1.addDevice(mouse1);
        centralControl1.addDevice(led1);
        centralControl1.addDevice(print1);
        centralControl1.addDevice(speaker1);

        centralControl1.deleteDevice(2);

        System.out.println();
        centralControl1.powerOn();
        System.out.println();
        centralControl1.powerOff();

        centralControl1.deleteDevice("Computer");

        centralControl1.deleteDevice();
        centralControl1.showInfo();
        centralControl1.performSpecificMethod();
    }
}
