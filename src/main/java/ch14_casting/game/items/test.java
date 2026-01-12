package ch14_casting.game.items;

import ch14_casting.game.system.Inventory;

public class test {
    public static void main(String[] args) {
        Inventory inv = new Inventory(3);
        Sword s = new Sword();
        Bow b = new Bow();
        Staff f = new Staff();

        inv.addWeapon(s);
        inv.addWeapon(b);
        inv.addWeapon(f);
        inv.addWeapon(f);
        inv.dropWeapon(s);

        inv.checkInventory();

        inv.attackAll();

        inv.useSpecialAbilities();
    }
}
