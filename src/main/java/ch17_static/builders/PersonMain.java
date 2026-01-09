package ch17_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        //Person person = new Person();
        /*
            Person person = new Person("김일",20,"서울특별시 종로구");
         */
        //All로 builder객체 생성해보자
        //필드 순서를 다르게해도 빌드가 된것을 알 수 있다.
        Person person1 = new Person.Builder().age(21).address("부산광역시 부산진구").name("김일").build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        Person person3 = new Person.Builder().name("김삼").build();

        Person2 person4 = Person2.builder().name("김사").build();
        System.out.println(person4);

        Person2 person5 = Person2.builder().build();
        System.out.println(person5);

        Person2 person6 = Person2.builder()
                .age(26)
                .name("김육")
                .address("광주광역시 북구")
                .build();
        System.out.println(person6);
    }
}
