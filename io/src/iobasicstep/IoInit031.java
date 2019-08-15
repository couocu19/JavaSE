package iobasicstep;

import java.io.*;

public class IoInit031 {
    public static void main(String[] args) {
        File f = new File("coucouio");
        InputStream b = null;
        try {
            b = new FileInputStream(f);

            byte[] flush = new byte[1024]; //缓冲容器
            int len = -1;  // 每次读取接收的长度
            while((len = b.read(flush))!=-1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
            finally {
            if(null != b){
                try {
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
