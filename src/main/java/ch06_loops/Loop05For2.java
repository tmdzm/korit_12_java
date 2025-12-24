package ch06_loops;

import java.util.Scanner;

public class Loop05For2 {
    public static void main(String[] args) {
        //1부터 100까지중 홀수합구하기
        Scanner in = new Scanner(System.in);
        int i,sum = 0;

        for(i = 1;i<101;i++){
            if(i%2 != 0) sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for(i = 1;i<101;i+=2){
            sum += i;
        }
        System.out.println(sum);


        /*
            i는 index의 축약어, i다음이 j->k식으로 가서 이렇게 쓴다.
            숫자를 입력받아 1부터 n까지 더하는 반복문 작성

         */

        System.out.println("1부터 몇 까지 더하시겠습니까? >>> ");
        int n = in.nextInt();
        sum = 0;

        for(i = 1;i<n+1;i++) sum += i;
        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

        int sum4 = 0;
        sum4 = (n*(n+1))/2;
        System.out.println(sum4);
    }
}
