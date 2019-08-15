package endecode;

import java.io.*;
//步骤：创建源--选择流---操作--释放
//第一个程序：理解io的操作步骤---标准形式
//操作（读取数据）的形式：一个一个读取
public class InitIo {
    public static void main(String[] args) throws IOException{
        //创建源
        File src = new File("C:/Users/11310/io/src/couio.txt");
        //C:\Users\11310\io\coucouio
        src = new File("C:\\Users\\11310\\io\\coucouio");
//        File s = new File("coucous");
//        s.createNewFile();
//        System.out.println(src.exists());
//        System.out.println(System.getProperty("user.dir"));
        InputStream in = null;
        try {
            //选择流
            in = new FileInputStream(src);
            //操作：读取
            int temp;
            while((temp=in.read())!= -1){
                System.out.println((char)temp);
            }
            //释放资源
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            //释放资源
            try {
                if(null !=in) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
