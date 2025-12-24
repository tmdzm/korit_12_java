package ch06_loops;

import java.util.Scanner;

/*
    중첩 반복문
    시간, 공간복잡도때문에 2중첩 초과는 권장되지 않는다.

 */
public class Loop06Nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j ;
        for(j=1;j<6;j++) for(i=1;i<4;i++) System.out.println(j+"일차 "+i+"교시입니다.");
        //한줄로 줄일수도 있다.
        //물론 코드읽기에 매우 안좋다.
        for(j=2;j<10;j++) for(i=1;i<10;i++) System.out.println(j+" x "+i+" = "+(i*j));

        for(i=1;i<101;i++){
            System.out.print(i+" ");
            if(i%10 == 0) System.out.println();
        }


        int oddSum = 0, evenSum = 0, max;

        System.out.print("1부터 몇까지 더해볼래 >>> ");
        max = in.nextInt();

        for(i=1;i<max+1;i++){
            if(i%2 == 0) evenSum += i;
            else oddSum += i;
        }

        System.out.printf("1부터 %d까지중 홀수의 합은 %d입니다.\n",max,oddSum);
        System.out.printf("1부터 %d까지중 짝수의 합은 %d입니다.\n",max,evenSum);
        System.out.printf("1부터 %d까지의 합은 %d입니다.\n",max,oddSum+evenSum);

    }
}





//        for(j=1;j<6;j++){
//            for(i=1;i<4;i++){
//                System.out.println(j+"일차 "+i+"교시입니다.");
//            }
//            //i = 0;//초기화, while과 다르게 for문 자체에서 알아서 해줌
//        }