package ch21_exception.bank;

import java.util.Scanner;

public class bankMain {
    static int balance = 10000;

    public static void withdraw(int amount) throws InsufficientBalanceException{
        if(amount > balance) {
            String tmp = String.valueOf((amount - balance));
            throw new InsufficientBalanceException(tmp);
        }
    }


    public static void main(String[] args) {
        //int balance = 10000;
        Scanner in = new Scanner(System.in);
        System.out.println("출금할 금액은?");

        try {
            int amount = in.nextInt();
            withdraw(amount);
        }catch (InsufficientBalanceException e){
            System.out.println("(부족한 금액 : "+e.getMessage()+"원)");
        }

    }
}
