package iobasicstep;

import java.io.*;
public class IoInit02 {
    public static void main(String[] args) {
        //创建源
        File src = new File("C:\\Users\\11310\\io\\coucouio");
        InputStream in = null;

        try {
            //选择流

            in = new FileInputStream(src);
            int temp;
            //操作--读取
            while((temp=in.read())!=-1){
                System.out.print((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

            //释放
            if(null !=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
