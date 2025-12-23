package ch05_condition;

/*
    조건문
    1. if문 : if다음에 있는 ()내의 조건식이 true일때 실행

    형식 :
    if(조건식){
        실행문
    }

 */

import java.util.Scanner;

public class Condition01 {
    public static void main(String[] args) {
        int num1 = 10;

        if(num1 > 0){
            System.out.println("num1은 양수입니다.");
        }

        if(num1 > 15){
            System.out.println("num1은 15 초과입니다.");
        }

        //이상을 했을때 변수에 값이 대입되는 순간 이미 조건식이 결정
        //즉 이 상태에선 조건문이 의미가 없다.

        System.out.println("숫자를 입력해라 >>> ");
        Scanner in = new Scanner(System.in);

        int num2 = in.nextInt();

        if(num2 > 0){
            System.out.println("num2는 양수입니다.");
        }

        if(num2 > 15){
            System.out.println("num2는 15 초과입니다.");
        }

        //condtion02
    }
}
