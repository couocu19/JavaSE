package commons;

import org.apache.commons.io.FileUtils;
import java.io.*;

//统计文件或者文件夹的大小

public class CIOTest01 {
    public static void main(String[] args) {

        //文件大小
        long len = FileUtils.sizeOf(new File("C:\\Users\\11310\\io-commons\\.idea"));
        System.out.println(len);

        //目录大小

    }
}
