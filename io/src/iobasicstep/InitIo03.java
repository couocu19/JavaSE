package iobasicstep;
//四个步骤:  分段读取
//将数据读到“中间容器”---缓冲当中
// int read(byte [])---返回读取字节数的大小，不是实际的数据
import java.io.*;
public class InitIo03 {
    public static void main(String[] args) {
        //创建源
        File src = new File("coucouio");
        InputStream in = null;

        try {
            //选择流
            in = new FileInputStream(src);
            //操作--分段读取
            byte[] flush = new byte[50];  //缓冲容器
            int len = -1; // 接收长度
                while ((len = in.read(flush)) != -1) {

                    //字节到字符--解码
                    String str = new String(flush, 0, len);
                    System.out.print(str);

                }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放
            if (null != in) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}



