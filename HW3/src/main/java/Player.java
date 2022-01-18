import java.util.List;
import java.util.Random;
import java.util.Scanner;

abstract public class Player {
  protected List<Door> doors;
  protected GameshowHost monty;
  protected int selection;
  protected String name;

  public Player(List<Door> doors, GameshowHost monty) {
    this.doors = doors;
    this.monty = monty;
  }

  //Create name for the player
  public String getName(){
    return  name;
  }
  public void setName(String name){
      this.name = name;
  }
  public boolean even_or_odd(){

    int count_name = name.length();
    boolean result = false; //ODD
      // EVEN
      if (count_name%2 == 0){
          result = true;
      }

      return result;
  }


  public void makeFirstSelection() {
    Random r = new Random();
    selection = r.nextInt(3);
    monty.hearFirstChoice(selection);
  }

  public abstract boolean makeSecondSelection();

  // concrete method
  // Template Method Pattern
  public boolean play() {
    makeFirstSelection();
    boolean bDidIWin = makeSecondSelection();
    return bDidIWin;
  }

}
