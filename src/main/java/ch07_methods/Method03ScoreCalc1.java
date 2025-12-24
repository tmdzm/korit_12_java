package ch07_methods;

import java.util.Scanner;

public class Method03ScoreCalc1 {

    public static void calcSumAndAvg(int max){

        Scanner in = new Scanner(System.in);
        int Gwa , i;
        double sum =0;
        for(i=0;i<max;i++){
            System.out.print((i+1)+" 과목의 점수를 입력하세요 >>> ");
            Gwa = in.nextInt();
            if(Gwa>100 || Gwa<0) {
                System.out.println("error, 값이 저장되지 않습니다.");
                continue;
            }
            sum += Gwa;
        }
        System.out.println("총합은 "+sum+"이며, 평균은 "+div(sum,i)+"입니다.");;
    }

    public static double div(double sum, int i){
        return sum/i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        max = in.nextInt();
        calcSumAndAvg(max);
    }
}
//하나의 메소드에는 하나의 기능만 있을것