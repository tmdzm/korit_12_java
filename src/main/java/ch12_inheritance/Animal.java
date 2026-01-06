package ch12_inheritance;
/*
    상속은 extends

    implements
 */
public class Animal {
    //field 정의
    private String animalName;
    private int animalAGe;

    public Animal() {
    }

    public Animal(int animalAGe, String animalName) {
        this.animalAGe = animalAGe;
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAGe() {
        return animalAGe;
    }

    public void setAnimalAGe(int animalAGe) {
        this.animalAGe = animalAGe;
    }

    public void move(){
        System.out.println("움직입니다.");
    }

}
