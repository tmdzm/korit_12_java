package ch06_loops;

/*
    while 반복문
    while(조건식){
        반복실행문
    }
    조건식이 false(0)가 될때까지
    또는 안에서 break로 깨고 나올때까지
    while문은 돈다
 */

public class Loop01 {
    public static void main(String[] args) {
        int i =0;
        while(i<10){
            i++;
        }
        System.out.println(i);
    }
}
