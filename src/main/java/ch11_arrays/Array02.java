package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("몇 명의 학생을 등록 하시겠소?");
//        int max = in.nextInt();
//        String[] humans = new String[max];
//        double score = 0;
//
//        for(int i = 0;i<max;i++){
//            System.out.println((i+1)+" 번 학생의 이름을 등록하시오 >>>");
//            humans[i] = in.next();
//        }
//
//        for(int i = 0;i<max;i++){
//            System.out.println((i+1)+" 번 학생의 점수를 입력하세요 >>>");
//            score += in.nextDouble();
//        }
//
//        System.out.println("학생들의 점수 총합은 "+score+"점입니다.");
        System.out.println("몇 명의 학생을 등록 하시겠소?");
        Array03Method arr03 = new Array03Method();
        arr03.WriteNameAndScore();
    }
}

//name and score Array03method
