// This class is a weapon factory
public class Blacksmith {
  Weapon forge(String name) {
    return switch (name) {
      case "sword" -> new Sword();
      case "mace" -> new Mace();
      default -> new Sword();
    };
  }
}
