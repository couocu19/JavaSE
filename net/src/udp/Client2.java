package udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8888);
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要发送的信息:");
        while(true){
            String msg = scanner.nextLine();
            byte[] buf = msg.getBytes();

            DatagramPacket dp = new DatagramPacket(buf, buf.length,
                    InetAddress.getByName("localhost"), 10000);
            ds.send(dp);
            System.out.printf("%s sent!", msg);
            if("quit".equalsIgnoreCase(msg))
                break;
        }
        ds.close();
    }
}
