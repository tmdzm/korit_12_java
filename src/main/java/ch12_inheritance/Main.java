package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal an = new Animal();
        Tiger tig = new Tiger();
        Animal Liger = new Tiger();//선언을 부모클래스로하고 생성은 자식클래스로


        an.move();
        tig.move();
        Liger.move();

        an.setAnimalName("토깽이");
        tig.setAnimalName("랑이");

        tig.hunt();
        tig.hunt(an.getAnimalName());

        tig.setWeight(1.4);
        //tig.getWeight();
        System.out.println(tig.getAnimalName()+"의 몸무게는 "+tig.getWeight()+"t입니다.");

        Human human1 = new Human();
        human1.move();
        human1.setAnimalName("김승일");
        human1.setAnimalAGe(25);
        System.out.println("안녕하세요, 제 이름은 "+human1.getAnimalName()+"이고 나이는 "+human1.getAnimalAGe()+"살 입니다.");
        System.out.println("내년에는 "+(human1.getAnimalAGe()+1)+"살이 됩니다.");
        human1.read("자바의 기초");
    }
}
