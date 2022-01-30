import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum StateGate {START, FIRST_DOOR_SELECTED, FIRST_DOOR_OPEN, SECOND_DOOR_SELECTED,  SECOND_DOOR_OPEN }

public class State extends ArrayList<Door> {

    StateGate currentstate;

    public State(){
        this.add(new Door(Prize.GOAT));
        this.add(new Door(Prize.GOAT));
        this.add(new Door(Prize.CAR));
    }

    public void reset(){

        for (Door d: this){
            d.unselect();
            d.close();
        }
        Collections.shuffle(this);
        this.currentstate = StateGate.START;
    }

    // need this to select the door
    public void selectDoor(int i){
        Door d = this.get(i);
        d.select();

        if(this.currentstate == StateGate.START){
            this.currentstate = StateGate.FIRST_DOOR_SELECTED;
        }

    }

    public void openDoor(int i){
        Door d = this.get(i);
        d.open();

    if (this.currentstate == StateGate.FIRST_DOOR_SELECTED){

        this.currentstate = StateGate.FIRST_DOOR_OPEN;

    }


    }





}
