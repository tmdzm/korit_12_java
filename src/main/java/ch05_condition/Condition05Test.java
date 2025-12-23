package ch05_condition;

import java.util.Scanner;

public class Condition05Test {
    public static void main(String[] args) {
        /*
            사용자에게 score를 입력받아
            grade를 정하고 출력

            점수를 입력하세요 >>>
            이름을 입력하세요 >>>

         */
        Scanner in = new Scanner(System.in);
        int score;
        String name;
        char grade;

        System.out.println("점수를 입력하세요 >>> ");
        score = in.nextInt();
        System.out.println("이름을 입력하세요 >>> ");
        name = in.next();

        if(score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';

        System.out.println(name+" 학생의 점수는 "+score+"점이고, 학점은 "+grade+"입니다.");
        //System.out.printf("%s 학생의 점수는 %d점이고, 학점은 %c입니다.",name,score,grade); 이게 더 편하지 않나

    }
}
