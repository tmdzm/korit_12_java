package ch06_loops;
/*
    중첩 while문
    while안에 while
    참고로 삼중첩 반복문은 쓰레기다.

    1일차 1교시 ~ 1일차 5교시
    7일차로 가볼
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int i = 0,j = 0;

        while(j<5){
            ++j;
            while(i<3){
                System.out.println(j+"일차 "+(++i)+"교시입니다.");
            }
            i = 0;
        }

    }
}
