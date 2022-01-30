import java.util.List;

public class SwitchingPlayer extends Player {

  public SwitchingPlayer(State state) {
    super(state);
  }

  @Override
  public boolean makeSecondSelection() {
    for (int i = 0; i < state.size(); i++) {
      Door d = state.get(i);
      if (!d.isOpen() && i != selection) {
        selection = i;
        return true;
      }
    }
    return false;
  }
}
