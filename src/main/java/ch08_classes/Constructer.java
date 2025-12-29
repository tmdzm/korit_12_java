package ch08_classes;

/*
    생성자
        생성자는 객체가 생성될때 호출되는 특별한 메서드
        메서드라는것을 알 수 있는것은 ()소괄호 때문
        예시 Car myCar = new Car();

     특징
        1. 클래스의 이름과 생성자의 이름은 동일하다.
        2. return값 없음
        3. 객체 초기화 : 생성자는 객체의 필드'초기화'를 담당한다


     생성자 정의 방식:
        1. 기본 생성자 : 매개변수가 없는 생성자, int, String같은 것들
        2. 매개변수(파라미터) 생성자
 */

public class Constructer {
    int num;
    String name;

    public Constructer(){
        System.out.println("기본생성자");
    }

    public Constructer(int number){
        System.out.println("매개변수를 필수로 요구하는 생성자");
        this.num = number;
    }


}
