package ch10_access_modifier.bank;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum,String accountHolder) {
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance < 0) return;
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber<0 || pinNumber >100000) {
            System.out.println("불가능한 비밀번호 입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount, int inputPin){
        if(!errorCheck(amount, inputPin)) return;
        balance += amount;
        System.out.printf("%d원이 입금되었습니다. 현재 잔액 : %d원\n",amount,balance);
    }

    public void withdraw(int amount , int inputPin){
        if(!errorCheck(amount, inputPin)) return;
        if(balance < amount){
            System.out.println("출금 불가입니다.");
            return;
        }
        balance -= amount;
        System.out.printf("%d원이 출금되었습니다. 현재 잔액 : %d원\n",amount,balance);
    }

    private boolean errorCheck(int amount, int inputPin){
        if(inputPin != pinNumber){
            System.out.println("비밀번호가 틀렸습니다.");
            return false;
        }
        if(amount<0) {
            System.out.println("불가능한 입력 금액입니다.");
            return false;
        }
        return true;
    }

    public void showAccountInfo(){
        System.out.println("계좌 번호 : "+accountNum);
        System.out.println("계좌 소유자 : "+accountHolder);
        System.out.println("현재 잔액 : "+balance+"원");
        System.out.println();
    }
}

/*
        accountNum(계좌번호, 정수)
        accountHolder(예금주이름, 문자열)
        balance(잔액, 정수)
        pinNumber(비밀번호, 4 자리 정수 0 ~ 9999)

 */