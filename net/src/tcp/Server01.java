package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;

/***
 * 熟悉流程
 * 创建服务器
 * 1.指定端口 使用ServerSocket创建服务器
 *  * 2.阻塞式等待连接 accept
 *  * 3.操作：输入输出流操作
 *  * 4.释放资源
 *
 */
public class Server01 {
    public static void main(String[] args)throws IOException {
        System.out.println("-----Server------");
        ServerSocket server = new ServerSocket(6666);
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();
        System.out.println(data);
        dis.close();
        client.close();

        server.close();
        ///client.close();




    }
}
