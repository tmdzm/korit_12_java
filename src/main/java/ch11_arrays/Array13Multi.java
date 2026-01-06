package ch11_arrays;

import java.util.Arrays;

/*
    다차원 배열중
    이차원 배열
    int[][] num = new int[5][5];
    int[][] num = new int[5][];
    int[][] num = {{1,2},{3,4},{5,6};
    2차원 배열 선언시 열의 크기는 지정하지 않아도 되지만 행은 지정해야함
    세로열, 가로행, column과 row, 행렬을 합쳐서 matrix라고 부른다
 */
public class Array13Multi {
    public static void main(String[] args) {
        int[][] num = {{1,2},{3,4},{5,6}};

        System.out.println(num[2][0]);
        System.out.println(num[2]);
        System.out.println(num);
        //2차 배열의 추출 = 중첩 for문을 사용하는것

        for(int i = 0;i<num.length;i++){
            for(int j = 0; j<num[i].length;j++){
                System.out.print(num[i][j] + " / ");
            }
            System.out.println();
        }

//        int j = 0;
//        for(int i : num) System.out.println(Arrays.toString(num[j++]));

        //배운거 복습
        int index = 0;
        for(int[] i : num){
            //System.out.println(i);
            for(int j : num[index++]) System.out.print(j+" - ");
            System.out.println();
        }
    }
}
