package ch18_generic.bmi;

import ch14_casting.animal.Dog;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("김일",168,68);
        Bmi bmi = new Bmi();

        bmi.printResult(person);

        //bmi.check(person);

        //Dog dog1 = new Dog("강아지",69,32); dog를 따로 쓰는게 아니면 에러난다. 이런 상황을 대비해서 제네릭을 쓴다.


    }
}
