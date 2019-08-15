package udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//实现多次交流
public class UdpTalkClient {
    public static void main(String[] args) throws Exception{
        System.out.println("发送方启动中……");
        DatagramSocket cocuou = new DatagramSocket(8888);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
                    new InetSocketAddress("localhost", 10000));

            //发送信息
            cocuou.send(packet);
            if(data.equals("bye")){
                break;
            }
        }
        cocuou.close();

    }
}
