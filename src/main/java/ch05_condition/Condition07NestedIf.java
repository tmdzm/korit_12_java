package ch05_condition;

import java.util.Scanner;

/*
    중첩if문(nested if)
    if문 안에 if를 넣는것

    if(조건문){
        if(조건문) 실행문
        else if(조건문) 실행문

    } else if(조건문){
        if(조건문) 실행문
        else if(조건문) 실행문
    }

    이런식
 */
public class Condition07NestedIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String grade;
        System.out.println("점수를 입력하세요 >>> ");
        int score = in.nextInt();

        if(score > 100||score < 0 ){
            System.out.printf("불가능한 점수 입력입니다.");
            grade = "X";
        } else {
            if (score >= 90) grade = "A";
            else if (score >= 80) grade = "B";
            else if (score >= 70) grade = "C";
            else if (score >= 60) grade = "D";
            else grade = "E";
        }

        System.out.println(" 학생의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");


    }
}
