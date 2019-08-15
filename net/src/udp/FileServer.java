package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//文件的存储
public class FileServer {
    public static void main(String[] args) throws Exception {
        System.out.println("接收方启动中……");
        DatagramSocket server = new DatagramSocket(6666);
        //准备容器 并封装成包裹
        byte[] container = new byte[1024*60];

        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        server.receive(packet);
        byte[] datas = packet.getData();
        int len = packet.getLength();
        PictureChanges a = new PictureChanges();
        a.byte2image(datas,"src/copy.jpg");
        server.close();

        System.out.println(new String(datas,0,len));
    }


}
