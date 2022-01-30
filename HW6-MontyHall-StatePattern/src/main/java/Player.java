import java.util.List;
import java.util.Random;

abstract public class Player {
  protected State state;
  protected GameshowHost monty;
  protected int selection;

  public Player(State state) {
      this.state = state;
  }

  public void makeFirstSelection() {
    Random r = new Random();
    selection = r.nextInt(3);
    state.selectDoor(selection);
  }

  public abstract boolean makeSecondSelection();

  // concrete method
  // Template Method Pattern
  public boolean play() {
    makeFirstSelection();
    boolean bDidIWin = makeSecondSelection();
    return bDidIWin;
  }

  //@Override --CHECK HERE
  public void update(Object arg){

    if(state.currentstate  == StateGate.START){
        this.makeFirstSelection();
    }

  }

}
