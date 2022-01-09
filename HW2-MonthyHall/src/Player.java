import java.util.Random;

public class Player {
    private Random random;
    private int choose;

    public Player(){
        this.random = new Random();
    }

    public int choose(){
        return random.nextInt(3);
    }

    public int change(int wrong, int previous){
        return 3 - wrong - previous;
    }
}