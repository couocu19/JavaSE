package tcp;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class LoginClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("-------client------");
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入用户名：");
        String uname= console.readLine();
        System.out.println("请输入密码：");
         String unpasword= console.readLine();

        Socket client = new Socket("localhost",6666);
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());

        dos.writeUTF("uname="+uname+"&"+"upassword="+unpasword);
        dos.flush();
        dos.close();
        client.close();

    }
}
