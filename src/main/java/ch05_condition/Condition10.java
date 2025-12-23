package ch05_condition;

import java.util.Scanner;

/*
        삼항연산자
        a < b ? 2 : 3
        조건식 ? 표현식1(true) : 표현식2(false)
     */
public class Condition10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int max;

        max = a > b ? a : b;
        System.out.println(max);

        //이걸 if문으로 표현하면

        if(a>b) max = a;
        else max =b;
        System.out.println(max);

        //삼항연산자로 윤년계산기 만들기
        Scanner in = new Scanner(System.in);

        System.out.println("연도를 입력하세요 >>> ");
        int year = in.nextInt();
//        boolean isLeapYear = (year%400 == 0) || (year%4 == 0 && year%100 != 0);
//        String leapYear = isLeapYear ? "윤년입니다." : "윤년이 아닙니다.";
//        System.out.println(year+"년은 "+leapYear);

        String result2 = "";
        boolean isLeapYear2 = (year%400 == 0) || (year%4 == 0 && year%100 != 0);
        if(year<0) System.out.println("404 not found");
        else result2 = isLeapYear2 ? "윤년입니다." : "윤년이 아닙니다.";
        System.out.println(year+"년은 "+result2);

        //음수 걸러네기2, 중첩 삼항 연산자
        String result3 = year < 0 ? "불가능한 연도 입력입니다." :
                (year%400 == 0) || (year%4 == 0 && year%100 != 0) ? "윤년입니다." : "윤년이 아닙니다.";

        System.out.println(year+"년은 "+result3);
    }
}
