public abstract class GameCharacter {
  protected String name;

  public GameCharacter(String name, int intelligence, int hitPoints, int strength) {
    this.name = name;
    this.intelligence = intelligence;
    this.hitPoints = hitPoints;
    this.strength = strength;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getIntelligence() {
    return intelligence;
  }

  public void setIntelligence(int intelligence) {
    this.intelligence = intelligence;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public int getStrength() {
    return strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  protected int intelligence;
  protected int hitPoints;
  protected int strength;
  protected Weapon weapon;

  public void attack(GameCharacter opponent) {
    if (weapon == null) {
      opponent.ouch(this.getStrength());
    }
    else {
      opponent.ouch(this.getStrength() * weapon.getDamage());
    }
  }

  private void ouch(int strength) {
    this.hitPoints -= strength;
    if (this.hitPoints < 0)
      this.hitPoints = 0;
  }

  public void equip(Weapon weapon) {
    this.weapon = weapon;
  }
}
