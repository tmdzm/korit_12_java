package ch21_exception.conveni;

import java.util.Scanner;

public class conveniMain {
    public static void order(int quantity) throws InvalidOrderQuantityException{
        if(quantity<1||quantity>50){
            throw new InvalidOrderQuantityException("예외 발생");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("몇개?");
        try{
            int quantity = in.nextInt();
            order(quantity);
        }catch (InvalidOrderQuantityException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("주문 프로세스 완료");
        }
    }
}
