package ch11_arrays;
/*
    score를 탐색하여 90이상은 A~ 59이하 F
    A몇명 B 몇명
 */

public class Array07 {
    public static void main(String[] args) {
        int[] score = {100,97,88,85,77,75,64,64,58,59,92,100};
        int[] grade = new int[5];
        String[] alpha = {"A","B","C","D","F"};


        for(int i : score){//int i = 0; i<score.length;
            if(i>100||i<0) break;
            if(i>=90) grade[0]++;
            else if(i>=80) grade[1]++;
            else if(i>=70) grade[2]++;
            else if(i>=60) grade[3]++;
            else grade[4]++;
        }

        for(int i =0;i<5;i++){
            System.out.println(alpha[i]+"등급 : "+grade[i]+"명");
        }

    }
}

/*
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        for(int i : score){//int i = 0; i<score.length;
            if(i>=90) a++;
            else if(i>=80) b++;
            else if(i>=70) c++;
            else if(i>=60) d++;
            else f++;
        }

        System.out.println("A 등급 : "+a+"명");
        System.out.println("B 등급 : "+b+"명");
        System.out.println("C 등급 : "+c+"명");
        System.out.println("D 등급 : "+d+"명");
        System.out.println("F 등급 : "+f+"명");
 */