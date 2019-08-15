package udp;

import java.util.Scanner;
import java.net.*;

/**
 * 发送端
 *  1.使用DataSocket指定端口，创建发送端
 * 2.猪呢比数据一定转成字节数组
 * 3.封装成DatagramPacket包裹，需要指定目的地
 * 4.发送包裹send（Datagrampacket）
 * 5.释放资源
 *
 *
 * */
public class UdpClient {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("发送方启动中……");

        DatagramSocket client = new DatagramSocket(8888);
        System.out.println("输入要发送的信息");
        //String data = "cocuou";
        while(true) {
            String msg = s.nextLine();
            byte[] datas = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, InetAddress.getByName("localhost"), 10000);
            client.send(packet);
            System.out.printf("%s sent!",msg);
            if("quit".equalsIgnoreCase(msg));
               break;
          }
       // System.out.println("%s sent!",msg);
        //client.send(packet);
        client.close();




    }
}
