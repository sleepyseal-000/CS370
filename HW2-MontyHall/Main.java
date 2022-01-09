public class Main {
    public static void main(String[] args) {
        int Win_With_Change_counter = 0;
        int Win_Without_Change_Counter = 0;
        int trial = 1000;

        Door d = new Door(0, 1, 2);
	    Player player = new Player();
        int choose = player.choose();
        for(int i = 0; i < 1000; i++){
            if(d.openDoor(choose)){
                Win_Without_Change_Counter++;
            }

            int wrong = Door.chooseDoor(choose);
            int newChoose = player.change(wrong, choose);

            if(d.openDoor(newChoose)){
                Win_With_Change_counter++;
            }
        }

        System.out.println("with switch: " + (double)Win_With_Change_counter / trial * 100 + "%");
        System.out.println("without switch: " + (double)Win_Without_Change_Counter / trial * 100 + "%");
    }
}
