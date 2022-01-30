import java.rmi.*;
public interface DoorMonitorRemote extends Remote {


    public void setPrize(Prize prize) throws RemoteException;




    /*

    Modify the Monty Hall Game code so that a player gets a DoorProxy instead of the actual Door.
    It should have the same interface as Door (so you might want to introduce an IDoor interface)
     and should delegate all its methods to the underlying Door.
     However, peek() on a door will just behave exactly like look().


     */
}
