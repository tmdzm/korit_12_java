package ch12_inheritance;

public class Human extends Animal{

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    public Human(int animalAGe, String animalName) {
        super(animalAGe, animalName);
    }

    public void read(String word){
        System.out.println(getAnimalName()+"이 "+word+"를 읽는 중입니다.");
    }

    @Override
    public int getAnimalAGe() {
        return super.getAnimalAGe();
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
}
