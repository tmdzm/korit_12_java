package ch03_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //변수 선언
//        String name;
//        name = "안근수";
//        System.out.println(name);
//
          Scanner sc = new Scanner(System.in);
//        //변수에 재대입
//        System.out.print("이름을 입력하세요--> ");
//        name = sc.nextLine();
//        System.out.println(name);
//
//        name = sc.next();
//        System.out.println(name);

        /*
            1. println vs print
                ln : line의 의미로 실행하면 출력문이 나온뒤 개행한다.
            
            현재까지의 상황에서
            Scanner scanner = new Scanner(System.in);
            이란 것을 쓰니까 콘솔에 데이터를 입력해서 변수에 저장 할 수 있고 그 변수(name)를 println하는 것이 가능하다 정도로 아는것으로 충분하다
            
            하지만 혹시 예습하고 싶으면
            new가 객체생성이고
            sc.nextLine();은 메서드 호출과 관련있는 개념

            2. next(Int/Double/Bollean,...etc) vs nextLine
                - nextLine()은 띄어쓰기를 허용합니다. enter를 기준으로 데이터가 변수에 저장됩니다., 즉\n을 만날때까지
                - 나머지는 허용 안합니다.그래서 next에서 kim 2라 적으면 kim만 출력이 되었습니다.
         */
        //scanner에 사용할 안내문(프롬프트) 출력문
//        System.out.println("올해는 몇 년도 인가요? >>>");
//        int year = sc.nextInt();//변수의 자료형이 int로 선언되었기에 자동완성에 int와 연관된게 먼저나온다
//        System.out.println("니 이름이 뭔데.");
//        String name2 = sc.nextLine();//사용이 사실상 불가
//        System.out.println("연도 : " + year);
//        System.out.println("이름 : " + name2);
        //왜 nextInt입력하고 엔터를 누르면 Line을 못읽을까 -> 엔터 즉 개행문자를 읽기때문이다. 오류조차 안되는 보편적인 문제이다.

        /*
            해결법은 많다.
            굳이 생각하자면 year와 name2의 위치를 바꾸기만 해도 될것이다.
            그런데 그러기 힘들다면 어떻게 해야할까
            꼼수로, nextLine을 하나 더 적어주는것이다.
         */

        System.out.println("올해는 몇 년도 인가요? >>>");
        int year = sc.nextInt();//변수의 자료형이 int로 선언되었기에 자동완성에 int와 연관된게 먼저나온다
        sc.nextLine();//enter를 받아주는 쿠션, 사용하지 않을 값이니까 변수에 대입할 필요가 없다.
        System.out.println("니 이름이 뭔데.");
        String name2 = sc.nextLine();//사용이 사실상 불가
        System.out.println("연도 : " + year);
        System.out.println("이름 : " + name2);

    }
}
