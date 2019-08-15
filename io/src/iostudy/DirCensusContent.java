package iostudy;

import java.io.*;
//统计文件夹的大小
public class DirCensusContent {
    public static void main(String[] args) {
        File dirs = new File("C:/Users/11310/io");
        countDir(dirs);
        System.out.println(len);
    }
    //注意：len在这里要单独定义出来，不能放在递归体中。
    //如果将len的定义放在递归体中，每进一次递归体len都要变为0.
    public static long len = 0;
    //获取文件的大小
    public static void countDir(File file){
        //首先判断当前文件或者文件夹是否存在，存在才可以计算大小
        if(file!=null && file.exists()) {
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
