package ch21_exception.ageexception;

import java.lang.invoke.WrongMethodTypeException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeMain extends Exception{
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 0||age >200){
            throw new InvalidAgeException("나이는 0~200 사이의 정수만 가능합니다.");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>> ");
        //int age = in.nextInt, 이전에는 이상의 코드에 바로 scanner를 집어넣었는데, 예회가 발생 할 수 있는 부분이 많다.
        try {
            int age = in.nextInt();
            checkAge(age);
        } catch (InvalidAgeException e){
            System.out.println("나이 입력 오류 : "+e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("나이 입력 오류 : "+e.getMessage());
            //throw new InputMismatchException("숫자만 입력가능"); 왜인지 오류가 난다.
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
