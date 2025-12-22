package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //변수 선언
        String name;
        name = "안근수";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        //변수에 재대입
        System.out.print("이름을 입력하세요-->");
        name = sc.nextLine();
        System.out.println(name);
        /*
            1. println vs print
                ln : line의 의미로 실행하면 출력문이 나온뒤 개행한다.
            2. nextLine vs next 등 다른 차이 존재. -> 12/23일 수업
            
            현재까지의 상황에서
            Scanner scanner = new Scanner(System.in);
            이란 것을 쓰니까 콘솔에 데이터를 입력해서 변수에 저장 할 수 있고 그 변수(name)를 println하는 것이 가능하다 정도로 아는것으로 충분하다
            
            하지만 혹시 예습하고 싶으면
            new가 객체생성이고
            sc.nextLine();은 메서드 호출과 관련있는 개념
            
         */
    }
}
