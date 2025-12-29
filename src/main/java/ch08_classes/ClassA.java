package ch08_classes;

/*
    클래스란 , 객체를 생성하기위한 설계도, 청사진
    현실 세계의 개념을 프로그램으로 표현할때,
    "특정 사물이나 개념의 특징(속성)"과 "행위(메서드)"로 정의함

    객체란, 클래스를 설계도라 가정했을때, 실제 사용할 수 있는 자동차(인스턴스)는 객체라고 한다.

    객체와 인스턴스의 관계
        객체는 포괄적인 개념
        인스턴스는 특정 객체가 어떤 클래스의 구현체인지 강조하는 표현
 */

public class ClassA {
    //필드 / 인스턴스 변수/ 멤버 변수/ 속성 정의
    //ClassA(int ber, String owner, double what){
        int num;
        String name;
        double scene ;
        //선언만하고 초기화는 안함
    //}

    //메소드 정의 방법
    public void callName() {
        System.out.println(name+"을 부릅니다.");
    }

    public void introduce(){
        System.out.println(num+" 번 학생 이름은 "+name+"이고, 점수는 "+scene+"입니다.");
        //callName();
    }
}
