import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.*;

public class PlayerTest {

    List<Door> doorList = new ArrayList<>();
    Player player;
    GameshowHost monty;

    @org.junit.Test
    public void CheckName(){

        player = new SwitchingPlayer(doorList, monty);
        player.setName("Paul");
        assertEquals(true,player.even_or_odd());

        player = new KeepingPlayer(doorList, monty);
        player.setName("Mailo");
        assertEquals(false, player.even_or_odd());

    }
}
