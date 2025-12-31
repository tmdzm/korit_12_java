package ch10_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
        Bank hong = new Bank(123456,"홍길동",100000,1234);
        Bank sin  = new Bank(987654,"신사임당",500000,5678);

        hong.deposit(5000,1234);
        hong.withdraw(200000,1234);
        hong.withdraw(100000,1234);

        System.out.println();

        sin.withdraw(100000,5678);
        sin.deposit(200000,5678);

        System.out.println();

        hong.showAccountInfo();
        sin.showAccountInfo();

        //비밀번호 맞는지 체크
    }
}
