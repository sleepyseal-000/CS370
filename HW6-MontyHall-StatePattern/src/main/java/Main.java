import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    // make doors
    State state = new State();

    int switchWins = 0;
    int keepWins = 0;
    final int trials = 1000;
    Player player;
    GameshowHost monty;
    for (int i = 0; i < trials; i++) {
      // make gameshow host
       monty = new GameshowHost(state);

      // make player
      player = new SwitchingPlayer(state);
      if (player.play())
        switchWins++;

      monty = new GameshowHost(state);

      // make player
      player = new KeepingPlayer(state);
      if (player.play())
        keepWins++;

    }
    System.out.println("switch pct wins =" + (switchWins / 1000.0));
    System.out.println("keep   pct wins =" + (keepWins / 1000.0));
  }
}
// apply State Pattern to Monty Hall

// adapt earlier OOP or Strategy code

// KeepingPlayer
// select door 0
// then keep

// SwitchingPlayer
// select random door
// then switch

// CheatingPlayer
// select door 1
// then cheat

// Concrete Player object
// have a State of Keeping, Switching, Cheating

// start by Keeping
// if lose, switch next time to Switching State

// in Switching State
// if lose, switch to Cheating state

// in Cheating State
// if win, switch to Keeping state
// play 1000 games
// print out pct win rate