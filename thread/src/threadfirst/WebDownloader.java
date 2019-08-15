package threadfirst;


import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.*;
import java.lang.String;

public class WebDownloader {

    //下载网络图片
    public void download(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载失败");
        }


    }

}
