package ch03_scanner;

import java.util.Scanner;
/*
    1. 다음과 같이 출력될 수 있도록 코드 작성
    나이를 입력하세요 >>> 19
    저는 올해 19살입니다.
    내년에는 20살이 됩니다.

 */
public class Scanner02 {
    public static void main(String[] args) {
        //콘솔에 데이터를 입력하기위해 Scanner import
        Scanner in = new Scanner(System.in);
        int year;

        System.out.println("나이를 입력하세요 >>> ");
        year = in.nextInt();
        System.out.println("저는 올해 "+(year++)+"살입니다.");
        System.out.println("내년에는 "+year+"살이 됩니다.");
    }
}
