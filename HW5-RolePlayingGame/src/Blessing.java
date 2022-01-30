public class Blessing extends Weapon{

    // Any weapon will have blessing effect (let's say that blessing
            // from divine intervention will double your attack of your sword, mace, etc (CURRENT WEAPON)


            // Called the object
          private Weapon weapon;

    //IT SHOULD BLESS THE CURRENT WEAPON
    public Blessing(Weapon weapon) {
       // Called the damage of the weapon?;
        this.weapon =weapon;


    }

    @Override
    public int getDamage(){
        return damage * 2;
    }



}
