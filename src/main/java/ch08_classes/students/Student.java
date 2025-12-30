package ch08_classes.students;

public class Student {
    int studentCode;
    String name;
    double score;

    public Student(){System.out.println("기본생성자로 생성하셨습니다.");}
    public Student(int code){this.studentCode = code;System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");}
    public Student(String name){this.name = name;System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");}
    public Student(int code,String name){
        this.studentCode = code;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }
    public Student(int code,String name,double score){
        this.studentCode = code;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }

    public void showInfo(){
        System.out.println();
        System.out.printf("%s 학생의 정보입니다.\n",name);
        System.out.printf("학번 : %d\n",studentCode);
        System.out.printf("이름 : %s\n",name);
        System.out.printf("점수 : %.1f\n",score);
    }
}
