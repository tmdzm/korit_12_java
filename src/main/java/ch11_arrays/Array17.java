package ch11_arrays;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] lottoNums = new int[6];
        int round = 5;//5게임
        //round를 이용해 2차 배열 int[][] lottoNumSet = new int[round][6]

        int temp = 0;//템포럴리의 축약어, 임시변수 , 잠시쓰고 버릴때 씀
        boolean duplicate;//중복시 true

        for(int j = 0;j<round;j++) {
            for (int i = 0; i < lottoNums.length; i++) {
                duplicate = false;
                temp = (int) (Math.random() * 45) + 1;
                for (int k = 0; k < i; k++) {
                    if (lottoNums[k] == temp) duplicate = true;
                }
                if (!duplicate) lottoNums[i] = temp;
                else i--;//i를 하나 까는것으로 while가 유사한 형식을 반복가능
                //cnt++;
            }
            Arrays.sort(lottoNums);
            System.out.println(Arrays.toString(lottoNums));
            System.out.println();
        }
    }
}
