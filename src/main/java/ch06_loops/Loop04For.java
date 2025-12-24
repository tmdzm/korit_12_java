package ch06_loops;
/*
    for 반복문
    for(시작값 ; 조건문 ; 증감값)
    for문은 정해진 반복
    while은 계속된 반복하는게 장점이 있다.
 */

public class Loop04For {
    public static void main(String[] args) {
        int i,sum = 0;
        for(i = 0;i<10;i++){
            System.out.println(i+1);
            //알아 두어야 할것은, i가 0일때, 조건문을 본뒤 실행문이 실행되고, 마지막으로 증감값이 실행된다.
            //그래서 증갑값의 경우 ++i나 i++나 같다.
        }

        for(i = 1;i<101;i++) sum += i;//아 i = 1부터 시작하는거 불편해
        System.out.println(sum);
    }
}
