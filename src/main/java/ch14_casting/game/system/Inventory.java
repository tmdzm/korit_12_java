package ch14_casting.game.system;

import ch14_casting.game.items.*;//* 해당 폴더에 모든걸 가져온다.
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class Inventory{
    Scanner in = new Scanner(System.in);
    private Weapon[] weaponSlots;

    public Inventory(int size) {
        this.weaponSlots = new Weapon[size];
    }

    public void checkInventory(){
        for(int i = 0;i<weaponSlots.length;i++){
            if(weaponSlots[i] == null) System.out.println("["+(i+1)+"] 비어있음");
            else System.out.println("["+(i+1)+"] "+weaponSlots[i].getClass().getSimpleName());
        }
    }

    public void addWeapon(Weapon weapon){
        for(int i = 0;i<weaponSlots.length;i++){
            if(weaponSlots[i] == null) {
                weaponSlots[i] = weapon;
                return;
            }
        }
        System.out.println("인벤토리가 가득 찼습니다.");
        swapWeapon(weapon);//가득 차 있다면 swap을 할지 물어봄
    }

    private void swapWeapon(Weapon weapon){
        String checker;
        checkInventory();
        System.out.println("교체할 무기 "+weapon.getClass().getSimpleName());
        System.out.println("무기을 교체하시겠습니까? y|n");
        checker = in.nextLine();
        if(checker.equals("y")||checker.equals("Y")) {
            System.out.println("몇번 무기와 교체하시겠습니까?");
            dropWeapon(in.nextInt());
            addWeapon(weapon);
        }
    }

    public void dropWeapon(int num){
        System.out.println(num+"번째 슬롯의 "+weaponSlots[num-1].getClass().getSimpleName()+"를 버렸습니다.");
        weaponSlots[num-1] = null;
    }

    public void dropWeapon(Weapon weapon){
        String name = weapon.getClass().getSimpleName();
        for(int i = 0;i<weaponSlots.length;i++){
            if(weaponSlots[i].getClass().getSimpleName().equals(name)) {//Weapon에 들어온 weapon으로 바로 비교가 안되네
                System.out.println((i+1)+"번째 슬롯의 "+name+"를 버렸습니다.");
                weaponSlots[i] = null;
                return;
            }
        }
    }

    public void attackAll(){
        for(int i = 0;i<weaponSlots.length;i++){
            if(weaponSlots[i] != null) {
                weaponSlots[i].attack();
            }
        }
    }

    public void useSpecialAbilities(){
        for(int i = 0;i<weaponSlots.length;i++){
            if(weaponSlots[i] == null) continue;
            else if (weaponSlots[i] instanceof Sword){
                ((Sword) weaponSlots[i]).parry();
            }
            else if (weaponSlots[i] instanceof Bow){
                ((Bow) weaponSlots[i]).snipe();
            }
            else if (weaponSlots[i] instanceof Staff){
                ((Staff) weaponSlots[i]).castSpell();
            }
        }
    }
}
