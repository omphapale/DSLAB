import java.rmi.*;
import java.rmi.server.*;

public class ServerImplements extends UnicastRemoteObject implements ServerInterface {

    public ServerImplements() throws RemoteException {
        super();
    }

    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}