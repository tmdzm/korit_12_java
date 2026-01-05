package ch11_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Array10PrintArray {
    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("숫자를 입력해 >>> ");
//        int num1 = random.nextInt();
//        int num2 = in.nextInt();
//
//        System.out.println(num1);
//        System.out.println(num2);
//
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(Arrays.toString(numbers));//toString앞의 자료형에 상관없이 String으로 바꾸는걸 통칭
//        System.out.println(Arrays.asList(numbers).toString());
//        //change 메소드로 toString이 있음을 확인

        //int[] nums = {3,1,4,5,6,2,10,9,8};
        Integer[] nums = {3,1,4,5,6,2,10,9,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums, Comparator.reverseOrder());//내림차순 정렬, 왜 안되나
        //int 배열은 안된다. 제네릭 T..
        //Integer 배열은 된다. 이게 뭐야
    }
    //배열의 출력 toString
    //배열의 정렬 sort : 오름차순

    /*
        sort()메소드에 오름차순에서는 인수가 하나 있는데, 내림차순은 2개이다.
        이상의 과정에서 오버로딩이 이루어졌다는것을 알 수 있다.

        두번째 인수 Comparator.recerseOrder()의 경우 int형이 안되는데
        지금 수준으론 char - > String 마냥 int -> Integer라고 생각하면 된다.
     */
}
