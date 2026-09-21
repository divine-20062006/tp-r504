import java.net.*;

public class ServeurUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1234);
        while (true) {
            System.out.println("-Waiting data");
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println("str=" + str);

            // Renvoi du même paquet au client
            byte[] dataOut = packet.getData();
            DatagramPacket packetOut = new DatagramPacket(
                dataOut, 
                packet.getLength(), 
                packet.getAddress(), 
                packet.getPort()
            );
            socket.send(packetOut);
        }
    }
}
