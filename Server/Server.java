import java.rmi.server.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) throws Exception{
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        StudentImpl obj = new StudentImpl();
        Student s = (Student)UnicastRemoteObject.exportObject(obj, 0);
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9000);
    }
}
