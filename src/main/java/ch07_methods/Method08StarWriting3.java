package ch07_methods;

import java.util.Scanner;

public class Method08StarWriting3 {
    public static String getStar(){

        Scanner in = new Scanner(System.in);

        int row = 0;
        int opt = 0; //증가하는 별인지 줄어드는 별인지

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까??? >>>");
        row = in.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 줄어드는 별");
        System.out.println("4. 오른쪽으로 치우친 줄어드는 별");
        System.out.println("어떤 유형의 별을 선택하시겠습니까? >>>");
        opt = in.nextInt();
        System.out.println(row+" "+opt);


        String result = "";

        switch (opt){
            case 1 :
                for (int i = 0;i<row;i++){
                    for(int j = 0;j<i+1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2 :
                for(int i=0;i<row;i++){//1->5
                    for(int j=row;j>0;j--){
                        if(j<=i+1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            case 3 :
                for (int i = row;i>0;i--){
                    for(int j = 0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4 :
                int blank;//이것도 없이 할 수 있지 않을까

                for(int i = 0;i<row;i++){//1->5
                    blank = i;
                    for(int j=row;j>0;j--){
                        System.out.print(blank > 0 ? " " :"*");
                        blank--;
                    }
                    System.out.println();
                }
                break;
            default:
                result = "1~4사이의 숫자만 가능합니다.";
        }


        return result;
    }



    public static void main(String[] args) {
        //System.out.println(getStar());
        //for문으로 하나
        //while문으로 하나
        //getStar가 2번 실행될 수 있도록
        Scanner in = new Scanner(System.in);
        int i;
        boolean repeat = true;
        for (i = 0;i<2;i++) System.out.println(getStar());

        while(repeat){
            System.out.println(getStar());
            System.out.println("반복할래? y|n");
            String how = in.next();
            switch (how){
                case "y":
                    break;
                case "n":
                    repeat = false;
                    break;
                default:
                    System.out.println("y나 n만 입력하시오");
            }
        }
    }
}
