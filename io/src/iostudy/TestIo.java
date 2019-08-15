package iostudy;

import java.io.File;

//关于文件路径的不同写法
public class TestIo {
    public static void main(String[] args) {
        //自动加了转义,无法做到后期的跨平台
        String path = "C:\\Users\\11310\\io\\src\\IMG_study.JPG";
        //名称分隔符  separatorChar

        //建议的文件名称的写法:‘/’
        path = "C:/Users/11310/io/src/IMG_study.JPG";

        //常量拼接,比较麻烦
        path = "D:"+ File.separator+"Users"+File.separator+"io"+"src"+ "iostudy/IMG_study.JPG";


    }
}
