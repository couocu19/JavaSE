package iomethodpackage;

import java.io.*;
import java.lang.*;
//封装拷贝
//封装释放资源
public class FileUtils {

    public static void main(String[] args) {

        //文件到字节数组//改变new的源头
        byte[] dataa = null;
        try {
            InputStream in = new FileInputStream("coucoufle/IMG_7908.JPG");
            OutputStream os = new ByteArrayOutputStream();
            copy(in,os);
            dataa = ((ByteArrayOutputStream) os).toByteArray();
            System.out.println(dataa.length);
        } catch (IOException e){
            e.printStackTrace();
        }

        //文件到文件
        try {

            InputStream in = new FileInputStream("tt.txt");
            OutputStream os = new FileOutputStream("copy-618s.txt");
            copy(in,os);
        } catch (IOException e){
            e.printStackTrace();
        }

        //字节数组到文件

        try {

            InputStream in = new ByteArrayInputStream(dataa);
            OutputStream os = new FileOutputStream("copy-619s.png");

            copy(in,os);
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    //对接输入输出流，直接将流作为参数
    public static void copy(InputStream in,OutputStream os){

        try{
            byte[] flush = new byte[1024];
            int len = -1;
            while((len=in.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            close(in,os);
        }
    }

    //封装释放资源
    //closeable接口
    //这里用到了可变参数
    public static  void close( Closeable... ios){

        for(Closeable io:ios) {
            try{

                if(ios!=null){
                    io.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}
