package ch14_casting.centralcontrol;

public class AirConditioner implements Power{
    boolean mod = false;

    @Override
    public void on() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨을 끕니다.");
    }

    public void changeMode(){
        if(!mod)System.out.println("냉방을 시작합니다.");
        else System.out.println("난방을 시작합니다.");
        mod = !mod;
    }
}
