import java.rmi.*;

public class StudentImpl implements Student{

    public void getName() throws RemoteException{
        System.out.println("Student Name");
    }
    public static void main(String[] args) throws Exception{
        
    }
}
