import java.rmi.*;

public interface Student extends Remote{
    public void getName() throws RemoteException;
}