package ch05_condition;

import java.util.Scanner;

//나눔
public class Condition12Switch2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;

        System.out.println("[메뉴 선택]");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("메뉴를 선택한다.");
        choice = in.nextLine();;

        switch (choice){
            case "a":
                System.out.println("1번 선택");
                break;
            case "b":
                System.out.println("2번 선택");
                break;
            case "c":
                System.out.println("3번 선택");
                break;
            case "d":
                System.out.println("4번 선택");
                break;
            case "e":
                System.out.println("5번 선택");
                break;
            case "f":
                System.out.println("6번 선택");
                break;//가 없으면 바로 해당케이스를 실행한뒤, 다음 케이스를 실행한다
            default:
                System.out.println("메뉴를 선택한다.");
        }
    }
}
