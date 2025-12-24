package ch06_loops;

import java.util.Scanner;

/*
    예쁘게 별모양으로 그려보기
    중첩 반복문을 이용
 */
public class Loop07Star {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();

        for(int i=0;i<5;i++){//1->5
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5;i>0;i--){//5->1
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
