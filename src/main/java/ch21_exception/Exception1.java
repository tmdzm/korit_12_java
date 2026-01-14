package ch21_exception;

import java.util.List;
import java.util.Scanner;

/*
    예외처리
        : 개발자가 예측할 수 있고, 그에 대한 대비를 할 수 있는 것들을 예외라고 정의
    오류란
        : 예측할 수 있지만 해결할 수 없거나, 예측 불가능한것들

    그러면 모든 자료형이 클래스 형태로 정의되는 Java의 특성 상 자주 일어나는
    예외 클래스들은 이미 개발자들이 정의를 해놓았습니다.

 */
public class Exception1 {
    public static void main(String[] args) {
        //int[] ints = new int[5];
        //ints[5] = 3;//보통은 그냥 못넘게 막아버리지만

//        int a = 10;
//        int b = 0;
//        double result = a/b;//0으로 나누기

        //if는 고전적 형태의 예외처리 방식

//        Scanner in = new Scanner(System.in);
//        System.out.println("나누어 지는 정수를 입력하세요 >>> ");
//        int a = in.nextInt();
//        System.out.println("나누는 수를 입력하세요 >>> ");
//        int b = in.nextInt();
//        //if(b==0) ~~
//        double result = (double) a/b;
//        System.out.println(result);//원랜 오류가 튀어나오지만 그냥 무한이 나온다.
//        //보통 이걸 if로 예외처리 했지

        /*
            예외처리 적용한 방식의 코딩 try / catch / finally
         */
//        int a = 10;
//        int b = 0;
//        try{
//            int result  = a/b;
//            System.out.println("결과 : "+result);
//        }catch (ArithmeticException e){
//            System.out.println("0으로 나눴다." + e.getMessage());
//        }
        /*
            왜 예외 처리를 하는가?
                : 프로그램이 정상 종료됨을 보증하기 위하여
         */


        try{
            List<Integer> nums = List.of(1,2,3,4,5);
            System.out.println(nums);
            System.out.println(nums.get(5));
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch(Exception e){   // 예외도 서로 상속처리가 되는데 거의
            throw new RuntimeException(e);// 가장 상위의 예외 관련 클래스에 해당
        }
            finally {
            System.out.println("프로그램 정상 종료");
        }

        //try , catch, fianlly를 사용하여 e.getMessage 출력
        //finally 파트에서는 프로그램 정상 종료
    }
}
/*
    이상의 코드 라인에서 중요한 점은 catch문이 복수로 나올 수 있다는 점
    근데 예를 들어 catch()를 사용할 때 순서를 고려할 필요가 있다.
    leapYear 관련할때 가장 촘촘한 조건을 앞에 위치시킨것 처럼
 */
