import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            ServerInterface obj = (ServerInterface) Naming.lookup("rmi://localhost/MyService");

            int result = obj.add(5, 3);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
