package ch05_condition;

import java.util.Scanner;

public class Condition09Test4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int year;
        String leapYear = "윤년입니다.";
        System.out.println("연도를 입력하세요 >>> ");

        year = in.nextInt();

        if(year<0) System.out.println("404 not found");
        else if((year%400 == 0) || (year%4 == 0 && year%100 != 0)){} //leapYear = "윤년입니다.";위에 넣어놔서
        else leapYear = "윤년이 아닙니다.";

        System.out.println(year+"년은 "+leapYear);
    }
}
