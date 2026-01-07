package ch13_abstraction.interfaces;

public abstract class Button implements Press,Up,Down{


    @Override
    public abstract void onPressed();//추상 메서드로 만들자

    @Override
    public String onUp() {//오버라이딩 하면서 추상 메서드가 일반 메서드가 되었기때문에, 이걸 상속하면 굳이 구현안해도 됨
        return "올립니다.";
    }

    @Override
    public void onDown() {}
}
