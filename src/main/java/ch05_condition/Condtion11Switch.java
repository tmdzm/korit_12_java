package ch05_condition;

import java.util.Scanner;

/*
        switch case문
        switch(변수명)
            case 조건 1:
                실행문;
                break;
             default :
                실행문;
     */
public class Condtion11Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        System.out.println("[메뉴 선택]");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("메뉴를 선택한다.");
        choice = in.nextInt();

        if(choice < 0 || choice > 6) System.out.println("404");
        else if(choice == 1) System.out.println("1번 선택");
        else if(choice == 2) System.out.println("2번 선택");
        else if(choice == 3) System.out.println("3번 선택");
        else if(choice == 4) System.out.println("4번 선택");
        else if(choice == 5) System.out.println("5번 선택");
        else if(choice == 6) System.out.println("6번 선택");//그냥 else로 해도 되나, 그냥 깔맞춤을 위해 else if로 했다.

        //switch

        switch(choice){
            case 1:
                System.out.println("1번 선택");
                break;
            case 2:
                System.out.println("2번 선택");
                break;
            case 3:
                System.out.println("3번 선택");
                break;
            case 4:
                System.out.println("4번 선택");
                break;
            case 5:
                System.out.println("5번 선택");
                break;
            case 6:
                System.out.println("6번 선택");
                break;//가 없으면 바로 해당케이스를 실행한뒤, 다음 케이스를 실행한다
            default:
                System.out.println("메뉴를 선택한다.");
        }


    }
}
