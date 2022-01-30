import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameshowHost {
  List<Door> doorList;

  State state;


  public GameshowHost(State state) {
    state.reset();
  }

  public void hearFirstChoice(int selection) {
    Random r = new Random();
    int reveal;
    do {
      reveal = r.nextInt(3);
    } while (state.get(reveal).peek() != Prize.GOAT || reveal == selection);

    state.openDoor(reveal);
  }

  public boolean hearSecondChoice(int selection) {
    if (selection >= 3)
      throw new IllegalArgumentException("Player choice must be between 0 and 2");

    Door theDoor = doorList.get(selection);
    theDoor.open();

    return theDoor.look() == Prize.CAR;
  }

}
