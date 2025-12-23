package ch05_condition;

import java.util.Scanner;

/*
    else if - else
 */
public class Condition04ElseIfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //condition
        int point;
        final int VIP_POINT = 100;
        final int GOLD_POINT = 80;
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
            userGrade = "NONE";//아니면 선언할때 초기화를 None으로 해도 되긴한다.
        }

        System.out.println("회원등급 : "+userGrade);
    }
}
