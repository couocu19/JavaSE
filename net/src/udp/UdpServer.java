package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 接收端
 * (同一个协议下端口不允许重复)
 * 1.使用DataSocket指定端口
 * 2.准备容器，封装成包裹
 * 3.阻塞式接收包裹
 * 4.分析数据
 *    byte[] getData（）
 *           getL:ength()
 *
 * */
public class UdpServer {
    public static void main(String[] args)throws Exception {
        System.out.println("接收方启动中……");

        DatagramSocket server = new DatagramSocket(10000);

        //准备容器 并封装成包裹
        byte[] container = new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,container.length);
        String data = null;
        while(!"quit".equalsIgnoreCase(data)) {
            server.receive(packet); //阻塞式

            String ip = packet.getAddress().getHostAddress();
            data = new String(packet.getData(),0,packet.getLength());

            System.out.println(ip+"::"+data);

        }

        System.out.println("byebye");
        server.close();

    }
}
