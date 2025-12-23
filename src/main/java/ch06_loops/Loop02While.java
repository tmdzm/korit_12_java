package ch06_loops;
/*
    1부터 100까지 출력하시오
 */
public class Loop02While {
    public static void main(String[] args) {

        int i = 0;
//        while(i<100){
//            System.out.println(++i);
//        }
        /*
            2번 문제
                1`10
                11~20
                ...
                91~100
         */
        int j = 0;
        while(j<100){
            ++j;
            if(j%10 == 0 && j!=0) System.out.println(j);
            else System.out.print(j+" ");
        }
        //다른 방식 10회 반복, 리스트를 써야 하지 않나
        System.out.println("2번 풀이");
        i = 0;
        while(i<10){
            System.out.print(10*i+1 + " ");
            System.out.print(10*i+2 + " ");
            System.out.print(10*i+3 + " ");
            System.out.print(10*i+4 + " ");
            System.out.print(10*i+5 + " ");
            System.out.print(10*i+6 + " ");
            System.out.print(10*i+7 + " ");
            System.out.print(10*i+8 + " ");
            System.out.print(10*i+9 + " ");
            System.out.println(10*i+10);
            i++;
        }//진짜 못생긴 코드다

        //강사의 풀이, 내꺼랑 뭐가 달라

//        j = 1;
//        while(j< 101) {
//            System.out.println(j+" "+(j+1)~~~~);
//            j+=10;
//        }

    }
}
