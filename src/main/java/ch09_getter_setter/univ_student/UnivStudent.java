package ch09_getter_setter.univ_student;

public class UnivStudent {
    String name;
    int grade;
    double score;

    public UnivStudent() {
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 4 || grade <0) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.grade = grade;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score > 4.5 || score < 0) {
            System.out.println("불가능한 입력입니다.");
            return;
        }
        this.score = score;
    }

    public void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("학년 : "+grade);
        System.out.println("학점 : "+score);

    }
}
