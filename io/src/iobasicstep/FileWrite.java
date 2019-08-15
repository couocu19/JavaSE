package iobasicstep;

import java.io.*;
public class FileWrite  {
    public static void main(String[] args) {

        File f = new File("618s.txt");

        Writer writer = null;

        try {
            writer = new FileWriter(f);
            //操作(写出)
            //写法一：
//            String msg = "我现在非常！极其！不开心！！！";
//            //字符串-->字符数组
//            char[] datas = msg.toCharArray();
//            writer.write(datas,0,msg.length());

            //写法二-----用write直接写入
           /* String msg = "吃完冰激凌感觉还不错。。";
            writer.write(msg);*/

            //写法三---用append追加，类似于之前的StringBuilder
            String msg = "今天真的很困很困很困很困！！！";
            writer.append(msg).append("\n我是追加过来的语句。。");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //在调试中发现，如果不进行close操作，指定文件中无法写入指定的字符。

            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
