public class CheatingPlayer extends Player {


    public CheatingPlayer(State state) {
        super(state);
    }

    @Override
    public boolean makeSecondSelection() {

        //CHEATING PLAYER WILL PEEK THE DOOR
            //KEEP THE DOOR IF HAS CAR
        //OTHERWISE CHANGE
        return false;
    }
}
