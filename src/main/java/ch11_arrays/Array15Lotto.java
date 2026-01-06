package ch11_arrays;

import java.util.Arrays;
import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ballNum = new int[6];
        int i = 0;


        while(true){
            int gotcha = random.nextInt(1,46);

            if(i==0) ballNum[i++] = gotcha;
            else{
                for(int j=0;j<ballNum.length;j++){
                    if(ballNum[j]==gotcha) break;
                    else if(j== ballNum.length-1) ballNum[i++]=gotcha;
                }
            }
            if(i== ballNum.length) break;
        }

        System.out.println(Arrays.toString(ballNum));


    }
}
