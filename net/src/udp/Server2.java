package udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10000);
        byte[] buf = new byte[1024];

        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        String data = null;
        while(!"quit".equalsIgnoreCase(data)){
            ds.receive(dp);

            String ip = dp.getAddress().getHostAddress();
            data = new String(dp.getData(), 0, dp.getLength());

            System.out.println(ip+"::"+data);
        }
        System.out.println("byebye");
        ds.close();
    }
}
