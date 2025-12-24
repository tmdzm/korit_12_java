package ch06_loops;

import java.util.Scanner;
/*
    scanner를 이용한 별찍기
 */

public class Loop08Star2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("몇 줄의 별을 생성할래? >>> ");
        int n = in.nextInt();

        for(int i=0;i<n;i++){//1->5
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------");

        for(int i=n;i>0;i--) {//5->1
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
