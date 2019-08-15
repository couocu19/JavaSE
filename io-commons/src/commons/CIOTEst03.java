package commons;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.*;

import java.util.*;

public class CIOTEst03 {


    public static void main(String[] args) throws IOException {
        //读取文件
        String msg = FileUtils.readFileToString(new File("722.txt"),"UTF-8");
        System.out.println(msg);
        //获取字节大小
        byte[] datas = FileUtils.readFileToByteArray(new File("722.txt"));
        System.out.println(datas.length);


        //逐行读取

        List<String>msgs = FileUtils.readLines(new File("722.txt"),"UTF-8");
        for(String string:msgs){
            System.out.println(string);
        }




    }
}
