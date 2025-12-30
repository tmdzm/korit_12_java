package ch08_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("alt+ins로 만들어진 생성자입니다.");
    }

    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("alt+ins로 만들어진 생성자입니다.");
    }

    public Student2(String name) {
        this.name = name;
        System.out.println("alt+ins로 만들어진 생성자입니다.");
    }

    public Student2(String name, int studentCode) {//알아서 다중선택을 해주진 않고 ctrl을 눌러야한다.
        this.name = name;
        this.studentCode = studentCode;
        System.out.println("alt+ins로 만들어진 생성자입니다.");
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("alt+ins로 만들어진 생성자입니다.");
    }
}
