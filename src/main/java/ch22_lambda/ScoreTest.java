package ch22_lambda;

import java.util.List;

public class ScoreTest {
    public static void main(String[] args) {
        List<Integer> scores = List.of(23,54,61,2,190);
        scores.stream()                             //1.Stream API 사용선언
                .filter(s->s>=60)            //2.60점 미만 거르기
                .map(s->s+5)                 //3.그 숫자에 5씩 더하기
                .sorted()                           //4.오름차순 정렬
                .forEach(System.out::println);
    }
}
