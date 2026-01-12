package ch14_casting.game;

import ch14_casting.game.items.*;//에스터레스크
import ch14_casting.game.system.Inventory;

public class Game {
    public static void main(String[] args) {
        //Inventory tory = new Inventory(new Weapon[5]);
        Inventory inv = new Inventory(5);
        Sword s = new Sword();
        Bow b = new Bow();
        Staff f = new Staff();

        inv.addWeapon(new Sword());
        inv.addWeapon(b);
        inv.addWeapon(f);
        inv.addWeapon(f);
        inv.dropWeapon(s);

        inv.checkInventory();

        inv.attackAll();

        inv.useSpecialAbilities();
    }
}
