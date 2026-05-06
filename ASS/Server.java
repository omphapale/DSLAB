import java.rmi.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerImplements obj = new ServerImplements();

            Naming.rebind("rmi://localhost/MyService", obj);

            System.out.println("Server is ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
