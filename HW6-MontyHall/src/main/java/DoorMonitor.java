import java.rmi.*;

public class DoorMonitor {

    DoorMonitorRemote door;
    Prize prize;
    private boolean bOpen;

    public DoorMonitor (DoorMonitorRemote door){
        this.door = door;
    }

    //peek() on a door will just behave exactly like look().
    public Prize peek() {

        if (isOpen())
            return prize;
        else
            return Prize.UNKNOWN;
    }

    private boolean isOpen() {

        return this.bOpen;

    }

}
