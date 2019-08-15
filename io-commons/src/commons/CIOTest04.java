package commons;

import java.io.IOException;

import java.io.*;
import org.apache.commons.io.FileUtils;
import java.lang.String;
import java.util.*;

public class CIOTest04 {
    public static void main(String[] args) throws IOException {

        //写出文件
        //三种不同的方法
        FileUtils.write(new File("722!.txt"),"第一天我已经很累了\r\n","UTF-8");
        FileUtils.writeStringToFile(new File("722!.txt"),"反正就是特别累\r\n","UTF-8",true);
        FileUtils.writeByteArrayToFile(new File("722!.txt"),"学习其实学习还是很幸福的！\r\n".getBytes("UTF-8"),true);

        //写出列表
        List<String> datas = new ArrayList<String>();
        datas.add("coucou");
        datas.add("coucoucou");

        //第三个参数：列表元素之间的连接符
        FileUtils.writeLines(new File("722!.txt"),datas,"---",true);


    }
}
