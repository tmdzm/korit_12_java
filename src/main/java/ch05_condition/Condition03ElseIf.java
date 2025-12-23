package ch05_condition;

import java.util.Scanner;

/*
    else if문
 */
public class Condition03ElseIf {
    public static void main(String[] args) {
        // 사용되는 클래스를 먼저쓰는 편
        //사용되는 변수/상수를 선언및 초기화
        Scanner in = new Scanner(System.in);
        int point; //초기화 안한 변수, 보통 가비지값을 갖는다. 언어에 따라 0인 언어가 있기도
        final int VIP_POINT = 100; //final은 제대입이 불가능
        final int GOLD_POINT = 80; //즉 변함없는 상수임을 알아보기 위한 자료형? x -> 자료형이 아니라 키워드
        final int SILVER_POINT = 60;
        final int BRONZE_POINT = 40;

        System.out.println("포인트를 입력하세요 >>> ");
        point = in.nextInt(); // 여기서 초기화가 이뤄짐
        String userGrade;

        if(point > VIP_POINT){
            userGrade = "VIP";
        } else if(point > GOLD_POINT) {
            userGrade = "GOLD";
        } else if(point > SILVER_POINT) {
            userGrade = "SILVER";
        } else if(point > BRONZE_POINT) {
            userGrade = "BRONZE";
        } else {
            userGrade = "NONE";
        }

        System.out.println("회원등급 : "+userGrade);

        /*
            풀이법 #1의 경우 20점 이하의 포인트를 가지게 될경우 실행되는 부분이 없다.

            풀이법 2의 경우 즉 else가 없이 else if만으로 구성된 경우
            userGrade가 초기화 되지 않아서 오류가 날 수 있다.
         */

    }
}
