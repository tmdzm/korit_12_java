package ch13_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    //인터페이스는 기본적으로 public static final이라 접근제어자 명시할 필요가 없다.
    //int age; 또한 변수 선언이 안되서 상수만 됨
    //public Press(){} 생성자 정의 불가 -> 객체생성 불가
    //전부 추상 메서드여야 해서 메서드 내에 본문을 적을 수 없다.

    void onPressed();
}
