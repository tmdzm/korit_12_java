package ch11_arrays;

import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        int[] arr01 = {1,2,3,4,5};

        int[][] arr03 = new int[5][100];

        System.out.println(arr01);

        for(int i = 0; i<arr01.length;i++) System.out.println(arr01[i]);

        System.out.println(arr03.length);//5
        System.out.println(arr03[0].length);//100
        //length는 필드 length()는 메서드

        /*
            빈 배열 생성
            자료형1[] 배열명 = new 자료형1[개수]
         */

        int[] arr02 = new int[5];//int로 만들어서 0이 이미 들어가있다.
        arr02[0] = 30;

        String[] arr04 = new String[5];//String이라 null이 들어가있다.
        System.out.println(arr04[0]);

        //내부의 값을 통해 이게 무슨 배열인가를 아는게 중요하다.

        int[] arr05 = new int[40];
        //이상의 빈 배열에 41부터 80까지의 값을 순서대로 대입하고,
        //41~/ 80으로 출력
        for(int i = 0; i<arr05.length;i++){
            arr05[i] = i+41;
            if(arr05[i]==80) System.out.println(arr05[i]);
            else System.out.print(arr05[i]+" / ");
        }


        Scanner in = new Scanner(System.in);
        int i = 0;
        while(arr04[arr04.length-1] == null){
            arr04[i++] = in.next();
        }
        for(i = 0; i<arr04.length;i++) System.out.print(arr04[i]);

    }
}
/*
    배열 내부에 다수의 데이터가 있기 때문에 콘솔창에서 전체 확인이 불가능
    주소지를 직접 입력해야 들어가게 된다.

 */