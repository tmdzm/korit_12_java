package ch14_casting.centralcontrol;

public class Mouse implements Power{
    @Override
    public void on() {
        System.out.println("마우스가 연결되었습니다.");
    }

    @Override
    public void off() {
        System.out.println("마우스와 연결이 끊어졌습니다.");
    }

    public void miki(){
        System.out.println("디즈니가 찾아옵니다.");
    }
}
