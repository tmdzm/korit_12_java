package ch05_condition;

import java.util.Scanner;

/*
    Test에서 12220를 입력해도 A가 나올것이다.
    그럼 100초과 0미만 정수가 입력되는 경우 결과값을 어떻게 할것이며 불가능한 정수입력이라고 할수 있을까
    100초과 -미만의 정수에대해 grade x라고 가정
 */
public class Condition06Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score;
        String name;
        char grade;

        System.out.println("점수를 입력하세요 >>> ");
        score = in.nextInt();
        System.out.println("이름을 입력하세요 >>> ");
        name = in.next();

        if (score > 100 || score < 0) grade ='x';
        else if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';

        if(grade == 'x') System.out.println("불가능한 점수 입니다."); //grade.equals('x'),char는 equals가 안된다.
        else             System.out.println(name + " 학생의 점수는 " + score + "점이고, 학점은 " + grade + "입니다.");
    }
}
