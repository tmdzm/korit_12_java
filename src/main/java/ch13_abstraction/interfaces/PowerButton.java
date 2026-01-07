package ch13_abstraction.interfaces;

public class PowerButton extends Button{
    private boolean status;

    @Override
    public void onPressed() {
        if(status){
            status = false;
            System.out.println("전원을 끕니다.");
        } else {
            status = !status;//그냥 무조건 반전, 위의 false도 이걸로 바꿔써도 무방하다. 출력되는 문장이 달라서 이렇게 만들었을 뿐
            System.out.println("전원을 켭니다.");
        }
    }
}
