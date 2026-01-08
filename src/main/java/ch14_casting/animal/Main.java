package ch14_casting.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1. fetch();

        Animal animal = dog1;//다운 캐스팅
        animal.makeSound();//개가 짖는다.

        Animal animal2 = new Dog();
        animal2.makeSound();//개가 짖는다.,오버라이드
        //하지만 fetch는 쓸 수 없다. Animal이니까

        /*
            클래스A 객체명 = new 클래스B();
            1. 오버라이드가 적용된 메서드, 즉 자식
         */

        Animal  animal1 = new Cat();
        animal1.makeSound();
        animal2.makeSound();

        // : 업캐스팅
        boolean result = animal instanceof Animal;
        System.out.println(result);//true
        boolean result2 = animal instanceof Dog;
        System.out.println(result2);//true

        boolean result3 = dog1 instanceof  Animal;
        System.out.println(result3);
        boolean result4 = animal2 instanceof  Animal;
        System.out.println(result4);

        Animal animal3 = new Animal();
        boolean result5 = animal3 instanceof  Animal;
        System.out.println(result5);
        boolean result6 = animal3 instanceof  Dog;
        System.out.println(result6);

        System.out.println(" 업캐스팅 파트 : ");
        System.out.println(" 다운캐스팅 파트");

        //다운캐스팅 방법
        Dog dog2 = (Dog)animal2;
        //animal2.fetch() 실행 안됨
        dog2.fetch();//실행됨
        /*
            dog2로 새로운 객체명을 선언하고 걱기에 명시적 참조자료형 캐스팅을 적용하여 animal 클래스의 인스턴스인
            animal2를 Dog 자료형으로 downcasting함
            근데 여기서 중요한 점은 다운캐스팅을 했다고 해서 animal2가 사라지는것은 아니다.

         */

        //Dog dog3 = (Dog) animal3;//애니멀로 선언하고 애니멀로 만들어짐, 다운캐스팅시 오류
        //dog3.makeSound();//오류

        /*
            이상의 경우를 확인했을 때 dog3.makeSound로 가기 전에 이미 오류가 발생
            즉 애초에 animal3를 생성했을때 animal 클래스의 생성자를 호출했기때문에
            하위 클래스로 다운 캐스팅이 불가능하다.
            즉, 선언에 쓰인 클래스와 클래스의 생성자가 다를경우에만 다운 캐스팅이 가능하다.
         */
        Animal animal4 = new Dog();

        System.out.println("animal4 검증");

        if(animal4 instanceof Dog){
            animal4.makeSound();
            //근데 fetch도 호출하고 싶다면
            Dog dog4 = (Dog) animal4;
            dog4.fetch();
        } else if(animal4 instanceof Cat){
            Cat cat0 = (Cat) animal4;
            cat0.makeSound();
            cat0.udada();
        }
    }
}
