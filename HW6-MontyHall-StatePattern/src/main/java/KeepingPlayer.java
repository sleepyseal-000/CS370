import java.util.List;

public class KeepingPlayer extends Player {
  public KeepingPlayer(State state) {
    super(state);
  }

  @Override
  public boolean makeSecondSelection() {
      // Keep the same door!
      //return monty.hearSecondChoice(selection);
    // KeepingPlayer
    // select door 0
    // then keep
    return false;
  }
}