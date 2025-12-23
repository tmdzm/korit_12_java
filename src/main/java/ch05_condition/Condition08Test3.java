package ch05_condition;

import java.util.Scanner;

/*
    과제 :
        윤년계산기 작성
        윤년이 4년주기였던가
        윤년은
        1. 연도가 4로 나누어 떨어지는 해
        2. 그러나 100으로 떨어지면 윤년이 아님
        3. 그런데 400년으로도 나누어 떨어지면 윤년임
 */
public class Condition08Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;

        System.out.println("연도를 입력하세요 >>> ");
        year = in.nextInt();

        if(year<0) System.out.println("404 not found");
        else if((year%400 == 0) || (year%4 == 0 && year%100 != 0)) System.out.println(year+"년은 윤년입니다.");
        else System.out.println(year+"년은 운년이 아닙니다.");
        //이보다 짧을 수 없다.

        System.out.println("수정#1?");

        String leapYear = "유년입니다.";

        if(year<0) System.out.println("404 not found");
        else if((year%400 == 0) || (year%4 == 0 && year%100 != 0)) leapYear = "윤년입니다.";
        else leapYear = "윤년이 아닙니다.";

        System.out.println(year+"년은 "+leapYear);

//else if(year%4 == 0 && year%100 != 0) System.out.println(year+"년은 윤년입니다.");
//        System.out.println(year+"년은 운년입니다.");
//        System.out.println(year+"년은 운년이 아닙니다.");
    }
}
