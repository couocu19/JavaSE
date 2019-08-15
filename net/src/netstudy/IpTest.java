package netstudy;

import java.net.*;
import java.net.InetAddress;

//IP:定位一个节点：计算机，路由，通讯设备
public class IpTest {

    public static void main(String[] args) throws UnknownHostException{
        //使用getLocalHost方法创建InetAddress对象
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());
        //根据域名得到netAddress独享

        addr = InetAddress.getByName("www.163.com");
        System.out.println(addr.getHostAddress());

    }


}
