package commons;

import java.io.IOException;
import org.apache.commons.io.FileUtils;
import java.io.*;
import java.lang.String;
import java.net.URL;
import java.nio.file.attribute.FileTime;

//重点掌握--文件的拷贝
public class CIOTest05 {

    public static void main(String[] args)throws IOException {

        File f = new File("src/girl.jpg");
        //复制文件
        FileUtils.copyFile(f,new File("c-girl.jpg"));

        //复制文件到目录

        FileUtils.copyFileToDirectory(f,new File("lib"));

        //复制目录到目录


        //复制目录

        //拷贝URL内容(例如网络图片)

        String url = "https://t12.baidu.com/it/u=1548316127,2931685911&fm=76";
        FileUtils.copyURLToFile(new URL(url),new File("c-new-picture.jpg"));


    }
}
