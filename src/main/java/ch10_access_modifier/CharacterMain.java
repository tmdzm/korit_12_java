package ch10_access_modifier;

class Character{
    public String name;//전체
    private int health;//읽기전용
    int power;//같은 패키지
    protected String skill;//자식클래스
    private int exp = 0;

    public Character() {
    }

    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;

        this.health = 100;
        this.exp = 30;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {

        return exp;
    }

    public void setExp(int amount) {
        if(exp==0){
            this.exp = amount;
            return;
        }
        this.exp += amount;
        System.out.printf("%s가 경험치 %d(을)를 얻었습니다.\n",name,amount);
    }

    public void attack(){
        System.out.printf("%s(이)가 기본 공격 !\n",name);
//        int exp1 = this.getExp();
//        this.setExp(exp1+10);
        setExp(10);
    }

    public void skillAttack(){
        System.out.printf("%s(이)가 %s로 공격 !\n",name,skill);
        System.out.printf("%d만큼의 피해\n",power*2);
        setExp(10);
    }

    public void heal(){
        health += 10;
        System.out.println("체력이 10 회복되었습니다. 현재체력 :"+health);
    }

}

public class CharacterMain {
    public static void main(String[] args) {
        Character warrior = new Character();
        Character bishop  = new Character("사제",100,"제네시스");//생성자가 퍼블릭이라 프라이빗한 필드도 세팅가능
        //생성자가 프라이빗이라면...

        warrior.setName("전사");
        warrior.setHealth(100);
        warrior.setPower(200);
        warrior.setSkill("세로 베기");
        warrior.setExp(30);

        warrior.skillAttack();
        warrior.heal();

        System.out.println(bishop.getHealth());
        System.out.println(bishop.getExp());
    }
}
