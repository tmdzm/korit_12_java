package ch07_methods;

import java.util.Scanner;

public class Method04ScoreCalc2 {

    public static double calSum(){
        Scanner in = new Scanner(System.in);
        int Gwa , i , max;
        double sum =0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        max = in.nextInt();
        if(max < 0 ){
            pError();
            return 1;
        }

        for(i=0;i<max;i++){
            System.out.print((i+1)+" 과목의 점수를 입력하세요 >>> ");
            Gwa = in.nextInt();
            if(Gwa>100 || Gwa<0) {
                pError();
                continue;
            }
            sum += Gwa;
        }
        System.out.println("총합은 "+sum+"이며, 평균은 "+div(sum,i)+"입니다.");;
        return sum;
    }

    public static void pError(){
        System.out.println("error, 올바르지 않은 값입니다.");
    }

    public static double div(double sum, int i){
        return sum/i;
    }

    public static void main(String[] args) {
        //합을 구하는 메서드와 평균구하는거작성
        //평균구하는거 내에서 합을 구하는 메서드를 호출한다
        calSum();
    }
}
