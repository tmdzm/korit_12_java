package ch13_abstraction.interfaces;

public class VolumeUpButton extends Button{
    public void onPressed() {
        System.out.println("볼륨을 한 칸 올립니다.");
    }

    public String onUp() {
        return "볼륨을 계속 "+super.onUp();
    }
}
