package ch13_abstraction;

public class Student extends Person{
    private String school;

    public Student(String name) {
        super(name);
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    @Override
    public void introduce() {

    }

    //추상 클래스가 ALLArgsConstructor를 가지고 있기 때문에 추상 메서드를 구현 하라는 점에서 빨간줄뜸
    //또한 생성자를 특정 방식으로 만들라고 빨간줄
}
