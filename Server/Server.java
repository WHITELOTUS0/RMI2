import java.rmi.server.*;
import java.rmi.registry.*;

public class Server {
    public static void main(String[] args) throws Exception{
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
    }
}
