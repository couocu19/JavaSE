package iomethodpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// try...with resource自动释放资源，简化代码格式
public class FileUtils2 {

    public static void main(String[] args) {

    }
    public static void copy(InputStream is, OutputStream os){
        //自动释放资源
        //代码格式：try(将要操作的流的声明)
        try(is;os){

            byte[] flush = new byte[1024];
            int len = -1;

            while((len=is.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
