import java.io.*;

public interface State extends Serializable{

    //All the voids from Door
    public void setPrize(Prize prize);
    public void open();
    public void close();




}
