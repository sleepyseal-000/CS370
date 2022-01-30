import java.util.List;

public class SwitchingBehavior implements SecondSelectionBehavior {
  @Override
  public int makeSecondSelection(Player player) {
    List<Door> doors = player.doors;
    for (int i = 0; i < doors.size(); i++) {
      Door d = doors.get(i);
      if (!d.isOpen() && i != player.selection) {
        player.selection = i;
        return player.selection;
      }
    }

    return 0;
  }
}
