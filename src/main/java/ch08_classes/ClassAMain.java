package ch08_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA classA1 = new ClassA();
        ClassA classA2 = new ClassA();
        Scanner in = new Scanner(System.in);

        //(2019575010,김승일,4.5);
        classA1.num = 2019575010;
        classA1.name = "김승일";
        classA1.scene = 4.5;

        classA2.name = "김이";
        classA2.num = 100;
        classA2.scene = 2;

        classA2.introduce();
        classA2.name = "김삼";
        classA2.callName();
    }
}
