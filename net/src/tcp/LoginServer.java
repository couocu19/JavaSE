package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class LoginServer {
    public static void main(String[] args) throws IOException {
        System.out.println("-----Server------");
        ServerSocket server = new ServerSocket(6666);
        Socket client = server.accept();
        System.out.println("一个客户端建立了连接");
        DataInputStream dis = new DataInputStream(client.getInputStream());
        String data = dis.readUTF();



        String[] dataArray = data.split("&");
        for(String info:dataArray){
            String[] userinfo = info.split("=");
            System.out.println(userinfo[0]+"-->"+userinfo[1]);
            if(userinfo[0].equals("uname")){
                System.out.println("你的用户名为"+userinfo[1]);
            }else if(userinfo[0].equals("upassword")){
                System.out.println("你的密码为"+userinfo[1]);
            }
        }
           // System.out.println(data);
        dis.close();
        client.close();
        server.close();
    }
}
