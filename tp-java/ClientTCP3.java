import java.io.*;
import java.net.*;

public class ClientTCP3 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2016);
            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

            // Envoi du premier argument
            dOut.writeUTF(args[0]);

            // Reception de la reponse inversee
            DataInputStream dIn = new DataInputStream(socket.getInputStream());
            String reponse = dIn.readUTF();
            System.out.println("Reponse inversee : " + reponse);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
