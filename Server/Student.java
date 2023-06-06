import java.rmi.*;

public interface Student extends Remote{
    public String getName() throws RemoteException;
}