package ch21_exception.signup;

import java.util.Scanner;

public class signUpMain {
    public static void checkLength(String id) throws InvalidIdException{
        if(id.length() < 8) {
            //throw new InvalidIDException(id);//?? 얘는 왜 빨갛지
            throw new InvalidIdException(id);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("아이디를 입력하시오");

        try {
            String id = in.nextLine().replace(" ","");//빈공간 방지, 빈공간을 교체하는 방식으로 해결
            checkLength(id);//여기서 catch가 발생하면 위의 throw로 넘어가서 밑에 줄이 실행되지 않는다.
            System.out.println("아이디 생성 완료");
        } catch (InvalidIdException e){
            //System.out.println(e.getMessage());
        }
    }
}
