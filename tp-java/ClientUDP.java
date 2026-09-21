import java.net.*;

public class ClientUDP {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("adresse=" + addr.getHostName());

        DatagramSocket socket = new DatagramSocket();
        
        // Envoi du message
        String msg = "Hello World";
        byte[] bufOut = msg.getBytes();
        DatagramPacket packetOut = new DatagramPacket(bufOut, bufOut.length, addr, 1234);
        socket.send(packetOut);

        // Réception de la réponse du serveur
        byte[] bufIn = new byte[1024];
        DatagramPacket packetIn = new DatagramPacket(bufIn, bufIn.length);
        socket.receive(packetIn);

        String reponse = new String(packetIn.getData(), 0, packetIn.getLength());
        System.out.println("reponse=" + reponse);

        socket.close();
    }
}
