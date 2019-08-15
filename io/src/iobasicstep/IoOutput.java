package iobasicstep;

// FileOutputStream : 通过字节的方式写出或追加数据到文件，适合所有类型的文件（图像，视频）
//  全字符考虑 FileWriter
//文件字节输出流
//四个步骤不变
import java.io.*;
public class IoOutput {
    public static void main(String[] args) {
        File ff = new File("test.txt");

        OutputStream oss = null;

        try{
            oss = new FileOutputStream(ff,false);
            String msg = "Coucou is so tired";
            byte[] datas = msg.getBytes();
            oss.write(datas,0,datas.length);
            oss.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(null!=oss){
                    oss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
