import java.util.List;

public class KeepingPlayer extends Player {
  public KeepingPlayer(List<Door> doors, GameshowHost monty) {
    super(doors, monty);
    secondSelectionBehavior = new KeepingBehavior();
  }
}