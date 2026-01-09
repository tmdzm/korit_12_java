package ch17_static.builders;

import lombok.ToString;

import java.util.Locale;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;

    }
    public static class Builder{
        private String name;
        private int age;
        private String address;

        /*
            그러면 class 내에 static class라고 하는 것을 정의했는데
            Builder라고 하는 static 클래스 내에 field를 정의
            근데 클래스니까 field와 메소드들로 이루어짐
            이하는 method들을 정의하는 영역, 이하의 부분이 builder pattern의 필수영역이 된다.
         */

        public Builder name(String name){//생성자가 아니다! Builder라는 자료형이다!
            this.name = name;//argument로 들어온 String data를 Builder에 field인 nam에 대입
            return this;
            //
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public  Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

}
