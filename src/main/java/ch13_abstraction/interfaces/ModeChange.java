package ch13_abstraction.interfaces;

public class ModeChange extends Button{
    boolean mode = false;
    @Override
    public void onPressed() {
        if(!mode)System.out.println("난방으로 바꿉니다.");
        else System.out.println("냉방으로 바꿉니다.");
        mode = !mode;
    }
}
