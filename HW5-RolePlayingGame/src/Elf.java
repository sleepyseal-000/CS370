public class Elf extends GameCharacter {
  @Override
  public String toString() {
    return "Elf{" +
            "name='" + name + '\'' +
            ", hitPoints=" + hitPoints +
            '}';
  }

  public Elf(String name, int intelligence, int hitPoints, int strength) {
    super(name, intelligence, hitPoints, strength);
  }
}
