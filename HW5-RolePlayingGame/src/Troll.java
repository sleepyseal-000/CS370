public class Troll extends GameCharacter {
  @Override
  public String toString() {
    return "Troll{" +
            "name='" + name + '\'' +
            ", hitPoints=" + hitPoints +
            '}';
  }

  public Troll(String name, int intelligence, int hitPoints, int strength) {
    super(name, intelligence, hitPoints, strength);
  }
}



