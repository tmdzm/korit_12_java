package ch02_operator;
/*
    논리 연산자
    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자ㅣ
    boolean :true/false를 구분하는 자료형

    AND(&&) 곱연산자, 둘다 true일때만 true
    OR(||) 합연산자 , 둘중 하나만 true여도 true
    Not(!) : true, false 값을 반전시킨다.
 */

public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;

        System.out.println("-------&&연산-------");
        boolean result1 = flag1 && flag1;
        boolean result2 = flag1 && flag2;
        boolean result3 = flag2 && flag2;
        System.out.println("T x T = "+result1);
        System.out.println("T x F = "+result2);
        System.out.println("F x F = "+result3);

        System.out.println("------||연산--------");
        boolean result4 = flag1 || flag1;
        boolean result5 = flag1 || flag2;
        boolean result6 = flag2 || flag2;
        System.out.println("T + T = "+result4);
        System.out.println("T + F = "+result5);
        System.out.println("F + F = "+result6);
    }
}
