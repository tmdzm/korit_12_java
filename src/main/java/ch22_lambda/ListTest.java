package ch22_lambda;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> eNums = new ArrayList<>();

        for(Integer i : nums) if(i%2==0) eNums.add(i);
        System.out.println(eNums);

        nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
