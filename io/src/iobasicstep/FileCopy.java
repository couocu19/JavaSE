package iobasicstep;

//使用文件字节输入流和输出流实现文件的copy
//将前两个练习合二为一
//四个步骤不变
import java.io.*;
public class FileCopy {
    public static void main(String[] args) {
        File initf = new File("coucouio");  //待copy的文件 //源头

        File copyf = new File("test");    //目标文件  //目的地

        InputStream in = null;
        OutputStream os = null;

        try{
            in = new FileInputStream(initf);
            os = new FileOutputStream(copyf,true);
            //操作仍然是分段读取
            byte[] flush = new byte[30];  //缓冲容器
            int len = -1;   //接收长度

            while((len=in.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            //释放资源 分别关闭 先打开的后关闭
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(in!=null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
