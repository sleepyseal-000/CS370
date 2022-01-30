import java.util.List;
import java.util.Random;

abstract public class Player {
  protected List<Door> doors;
  protected GameshowHost monty;
  protected int selection;
  protected SecondSelectionBehavior secondSelectionBehavior;

  public Player(List<Door> doors, GameshowHost monty) {
    this.doors = doors;
    this.monty = monty;
  }

  public void makeFirstSelection() {
    Random r = new Random();
    selection = r.nextInt(3);
    monty.hearFirstChoice(selection);
  }

  public boolean makeSecondSelection() {
    selection = secondSelectionBehavior.makeSecondSelection(this);
    return monty.hearSecondChoice(selection);
  }

  // concrete method
  // Template Method Pattern
  public boolean play() {
    makeFirstSelection();
    boolean bDidIWin = makeSecondSelection();
    return bDidIWin;
  }

}

// take this code, change it to Strategy Pattern
// Keeping Strategy
// Switching Strategy
