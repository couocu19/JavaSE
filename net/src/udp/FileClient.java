package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class FileClient {
    public static void main(String[] args) throws Exception {

        System.out.println("发送方启动中……");
        DatagramSocket client = new DatagramSocket(8888);

        PictureChanges p = new PictureChanges();
        byte[] datas = p.image2byte("src/IMG_9412.JPG");

        DatagramPacket packet = new DatagramPacket(datas,0,datas.length,
                new InetSocketAddress("localhost",6666));

        client.send(packet);
        client.close();


        //DatagramPacket packet = new DatagramPacket()

    }
}
