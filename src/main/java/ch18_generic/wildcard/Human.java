package ch18_generic.wildcard;

public class Human extends Animal{

    @Override
    public void move() {
        System.out.println("뚜벅뚜벅");
    }

    public void read() {
        System.out.println("사람이 책을 읽는다.");
    }
}
/*
    Tiger 클래스에 가서 Animal을 상속받고
    hunt
 */
