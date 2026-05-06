import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 5000);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Server");

            String msg = dis.readUTF();
            System.out.println("Server says: " + msg);

            dis.close();
            dos.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
