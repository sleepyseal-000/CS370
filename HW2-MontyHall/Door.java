import java.util.Random;

public class Door<prize> {

    static int prize;
    int door_2;
    int door_3;
    static Random generator = new Random();

    // There should be 3 doors
    // Add 1 if contains car
    public Door(int prize, int door_2, int door_3) {
        this.prize = prize;
        this.door_2 = door_2;
        this.door_3 = door_3;
    }

    boolean openDoor(int c){
        //HERE SHOULD WHICH DOOR U OPENED EQUAL TO TRUE
        if(prize == c){
            return true;
        }
        else{
            return false;
        }
    }

    static int chooseDoor(int c){
        prize = generator.nextInt(3);
        int wrong = 0;
        while(wrong == c || prize == wrong){
            wrong = generator.nextInt(3);
        }
        return wrong;
    }
}