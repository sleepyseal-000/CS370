public class Curse extends Weapon {

    private Weapon weapon;
    public Curse(Weapon weapon) {

        this.weapon =weapon;
    }

    @Override
    public int getDamage(){
        return damage - 10;
    }

}
