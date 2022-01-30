public class Main {

    public static void main(String[] args) {
        Blacksmith toby = new Blacksmith();
	      Troll smasher = new Troll("Smasher", 12, 30000, 100);
	      smasher.equip(toby.forge("mace"));
        Elf aiden = new Elf("Aiden", 50, 10000, 75);
        aiden.equip(toby.forge("sword"));

        System.out.println("Before Attack");
        System.out.println("---------------");
        System.out.println(smasher);
        System.out.println(aiden);

        smasher.attack(aiden);
        aiden.attack(smasher);

        System.out.println();
        System.out.println("After Attack");
        System.out.println("---------------");
        System.out.println(smasher);
        System.out.println(aiden);

        Weapon w = new Blessing(new Sword());
        Weapon c = new Curse(new Mace());
        smasher.equip(w);
        aiden.equip(c);
        smasher.attack(aiden);
        aiden.attack(smasher);

        System.out.println();
        System.out.println("After After Attack");
        System.out.println("---------------");
        System.out.println(smasher);
        System.out.println(aiden);
    }


}

// HW: todos
// TODO Implement Null Object Pattern - so can attack with fists
// TODO Implement Decorator pattern on Weapons
//      make a Blessing on a sword.
//      wrap a sword in a blessing
//      Blessing is-a Weapon (or WeaponDecorator). have-a weapon
//      Weapon w = new Blessing(new Sword());
//      Weapon w2 = new Blessing(new Blessing(new Sword()));
//      Weapon w3 = new Curse(new Blessing(new Mace()));
//      Blessing and Curse will Decorate the underlying weapons
//      Blessing's getDamage will be *2 of the underlying weapon
//      Curse's getDamage will be -10 of the underlying weapon

// in class, for myself
// DONE! apply the Simple Factory.

