package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array12 {
    public static void main(String[] args) {
        //사용할 객체 생성
        Random random = new Random();
        Integer[] numbers = new Integer[10];

        for(int i=0; i<numbers.length ;i++){
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int randNum = random.nextInt(10);//괄호안은 한계값
        System.out.println(randNum);//0~9까지의 범위에서 생성

        Arrays.sort(numbers);//보이드라 print 불가
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        int index = 0;

        for(int i : numbers) numbers[index++] = random.nextInt(1,100);

//        index = 0;
//
//        for(int i : numbers){
//            numbers[index++] = i+100;
//        }

        System.out.println(Arrays.toString(numbers));
    }
}
