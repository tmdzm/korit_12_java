package ch12_inheritance;

public class Tiger extends Animal {
    private  double weight;

    public Tiger() {
    }

    public Tiger(int AnimaAge, String AnimalName,  double weight) {
        super(AnimaAge , AnimalName);
        this.weight = weight;
    }

    public double getWeight() {
        //System.out.println(getAnimalName()+"의 몸무게는 "+weight+"t입니다.");
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void hunt(){
        System.out.println(getAnimalName()+"(이)가 공격합니다.");
    }

    public void hunt(String prey){
        System.out.println(getAnimalName()+"(이)가 "+prey+"를 공격합니다.");
    }

    @Override
    public void move(){
        //super.move(); super키워드 부모ㅓ 클래스의 임의의 인스턴스를 의미함, 부모걸 그대로 가져옴
        System.out.println("발자국 없는 범이");
        super.move();
    }
}
