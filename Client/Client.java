

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 9000);
        Student student = (Student)registry.lookup("l");
        System.out.println(student.getName());
    }
}
