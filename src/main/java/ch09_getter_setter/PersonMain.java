package ch09_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "김일";
        person1.age = -10;
        person1.address = "부산광역시 부산진구";

        //setter 경유하여 필드에 값을 대입하는 방법
        //setter는 컨스트럭터(생성자)가 아니라 메서드다. 물론 컨스트럭터도 메서드이긴 하다.

        person1.setName("김일일");
        person1.setAge(20);

        //getter를 적용하여 필드호출
        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        person1.setAge(0);
        person1.setAddress("서울특별시 종로구");

        //여기서 getter를 사용
        //김일일 학생의 나이는 0살이고 주소는 서울특별시 종로구입니다.

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getAddress());

        int lengthOfName = person1.getName().length();//체이닝 메서드

        person1.setName("김일이");
        person1.setName("이리오세날");

    }
}

/*
    setName() 메소드에 비지니스 로직을 추가하시오
    인자에 들어온 스트링 데이터의 글자수를 파아하여
    4글자 초과라면 변경 할 숴 없습니다를 출력
    4글자 이하라면 변경가능
 */
