package ch07_methods;

import java.util.Scanner;

public class Method01 {
//method 정의 영역
    //1. [X|X] [입력값 / 출력값]
    public static void call1(){
        System.out.println("[X|X]");
    }

    //2. [o|x]
    public static void call2(String e){//e는 파라미터, 정의할땐 파라미터
        System.out.println("[o|X]");
        System.out.println("오늘 기분은 : "+e);
        System.out.println();
    }

    //3. [x|o] 매개변수 없고 리턴값 있음
    public static String call3(){//e는 파라미터, 정의할땐 파라미터
        String e = "안녕하쇼";
        System.out.println("[x|o]");
        return e;
    }

    //4. [o|o] 매개변수 리턴 둘다 있음
    public static double call4(double e){//e는 파라미터, 정의할땐 파라미터
        System.out.println("[o|o]");
        return e*2;
    }

    //번외 -> 매개변수의 개수가 여러 개 일 수 있다.
    public static String intro(String name, int age){
        return name + age;
    }

    public static void main(String[] args) {
        //method 호출 영역
        call1();
        call2("발표언제나와!!!");//e에 들어가는 값, 즉 호출할땐 인수, 아규먼트
        System.out.printf(call3());

        Scanner in = new Scanner(System.in);
        System.out.println("입력해!!! -> ");
        int num = in.nextInt();

        System.out.println(call4(num));
        //return 0;
        /*
        return이 있는 이유는 기본적으로 데이터의 조작을 위해서
        특정 메소드의 결과값이 다른 메소드의 argument로 사용될 수도 있습니다.

        함수형 프로그래밍 :
            메소드 1의 return값이 메소드2의 argument가 되고 ~~

            첫번째 메소드로부터 마지막 메소드까지의 흐름을 통해 프로그램이 이어지는 방식
         */


    }
}

/*
    while 반복문
    for
    method
 */
/*
    return이라는 것은 콘솔에 출력하라는 으ㅢ미가 아니고 특정데이터가 뽑혀져 나온다는것
    그것을 저장한 다음에 개발자들은 알아서한다
 */