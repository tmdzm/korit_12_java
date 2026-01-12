package ch14_casting.game.items;

public class Staff implements Weapon{

    @Override
    public void attack() {
        System.out.println("빛으로 강타해요!");
    }
    public void castSpell(){
        System.out.println("데!마!시!아!");
    }

}
