package iostudy;

import java.io.*;
//使用面向对象统计文件夹大小
public class DirCount {

    private  long len;

    private String path;

    private File src;

    //创建一个构造器，在主函数里面只需对其统计大小
    public DirCount(String path) {
        this.path = path;
        this.src = new File(path);
        countDir(src);
    }


    public long getLen() {
        return len;
    }

    public static void main(String[] args) {
        DirCount dir = new DirCount("C:/Users/11310/io");
        System.out.println(dir.getLen());


    }

    //递归体
    private void countDir(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                len += file.length();
            } else {
                for (File temp : file.listFiles()) {
                    countDir(temp);
                }
            }
        }


    }
}
