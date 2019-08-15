package tcp;

import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

//创建客户端
public class Client01 {
    public static void main(String[] args) throws Exception {

        System.out.println("-------client------");
        Socket client = new Socket("localhost",6666);
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        String data = "hello";
        dos.writeUTF(data);
        dos.flush();
        dos.close();
        client.close();

    }
}
