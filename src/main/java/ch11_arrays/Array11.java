package ch11_arrays;
/*
    아까 random.nextInt()를 사용해서
    Integer[] numbers 배열을 선언하고 10개짜리 index로 만들자
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Array11 {
    public static void main(String[] args) {
        Random rd = new Random();
        Integer[] numbers = new Integer[10];

        for(int i=0;i< numbers.length;i++){
            numbers[i] = rd.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        sortReverse(numbers,0);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Comparator.reverseOrder());//역순
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortReverse(Integer[] arr, int i){//스스로 만들어쓰는 DIY 역순정렬
        Integer tmp = arr[i];//일단 가장 큰 수를 찾은뒤 맨 앞의 값이랑 교체하고, 이후 2번째~반복해서 배열끝이랑 같으면 반복종료
        int index = i;
        for(int j=i;j<arr.length-1;j++) {
            if (tmp < arr[j + 1]) {
                tmp = arr[j + 1];
                index = j+1;
            }
        }
        arr[index] = arr[i];
        arr[i] = tmp;

        if(i==arr.length-1) return;
        else sortReverse(arr,i+1);
    }

}
