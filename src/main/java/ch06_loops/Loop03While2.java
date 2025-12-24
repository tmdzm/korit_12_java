package ch06_loops;
/*
    중첩 while문
    while안에 while
    참고로 삼중첩 반복문은 쓰레기다.
 */
public class Loop03While2 {
    public static void main(String[] args) {
        int i = 0,j = 0;

        while(j<5){
            j++;
            while(i<3){
                System.out.println(j+"일차 "+(++i)+"교시입니다.");
            }
            i = 0;//초기화
        }

        //전역변수와 지역변수
        //

        j = 1;
        while(j<9){
            j++;
            while(i<9){
                System.out.println(j+"x"+(++i)+" = " + (j*i));
            }
            i = 0;//초기화
        }

    }
}
