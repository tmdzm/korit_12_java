package ch07_methods;

import java.util.Scanner;

public class Method06StarWriting {

    //call4()유형, 즉 파라미터가 있고 return값이 있는형태로 만들어라
    //어떤 유형의 별찍기를 할건지 main에서 받을 예정
    //method 정의 영역
    public static String getStar(int row, int opt){
        String result = "";

        if(opt < 1 || opt > 4){
            result = "1~4사이의 숫자만 가능합니다.";
        } else {
            if(opt == 1){
                //별찍는 for문
                for (int i = 0;i<row;i++){
                    for(int j = 0;j<i+1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else if(opt == 2){
                for(int i=0;i<row;i++){//1->5
                    for(int j=row;j>0;j--){
                        if(j<=i+1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    System.out.println();
                }

            } else if(opt == 3){
                for (int i = row;i>0;i--){
                    for(int j = 0;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            } else {
                int blank;//이것도 없이 할 수 있지 않을까

                for(int i = 0;i<row;i++){//1->5
                    blank = i;
                    for(int j=row;j>0;j--){
                        System.out.print(blank > 0 ? " " :"*");
                        blank--;
                    }
                    System.out.println();
                }

            }
        }

        return result;
    }

    //switch 문
    public static String getStar2(int row, int opt){
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



    //method 호출영역

    public static void main(String[] args) {
        //사용할 객체 생성
        Scanner in = new Scanner(System.in);

        int rowOfStars = 0;
        int choice = 0; //증가하는 별인지 줄어드는 별인지
        String starResult = "";

        System.out.println("몇 줄 짜리 별을 생성하시겠습니까??? >>>");
        rowOfStars = in.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는 별");
        System.out.println("2. 오른쪽으로 치우친 증가하는 별");
        System.out.println("3. 왼쪽으로 치우친 줄어드는 별");
        System.out.println("4. 오른쪽으로 치우친 줄어드는 별");
        System.out.println("어떤 유형의 별을 선택하시겠습니까? >>>");
        choice = in.nextInt();
        System.out.println(rowOfStars+" "+choice);

        starResult = getStar(rowOfStars,choice);//string으로 return을 받아 별을 찍어낼거다
        //메서드 호출
        System.out.println(starResult);

        //switch case문으로 만들어진것
        starResult = getStar2(rowOfStars,choice);
        System.out.println(starResult);
    }
}
