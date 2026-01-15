package ch22_lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과","딸기","블루베리");

        System.out.println(fruits);

        for (int i = 0; i<fruits.size();i++) System.out.println("과일명 : "+fruits.get(i));
        for(String str : fruits) System.out.println("과일명 : "+str);
        fruits.forEach(fruit -> System.out.println("과일명 : "+fruit));//forEach는 스트림이 필요없다.

        System.out.println(fruits);
        fruits.stream().map(fruit ->"과일명 : "+fruit).forEach(System.out::println);
        System.out.println(fruits);

        List<Integer> nums = List.of(1,2,3,4,5);
        nums.forEach(num -> System.out.println((num+2)+" "));
        System.out.println(nums);//리스트 자체가 바뀌지 않는다.
    }
}
