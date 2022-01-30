import java.util.List;

public class SwitchingPlayer extends Player {

  public SwitchingPlayer(List<Door> doors, GameshowHost monty) {
    super(doors, monty);
    //secondSelectionBehavior = new SwitchingBehavior();
  }
}
