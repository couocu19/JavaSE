package commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.*;
import java.util.Collection;

//列出子孙级目录
public class CIOTest02 {
    public static void main(String[] args) {

        //操作一层

        //参数1：被操作文件夹 ； 参数2：需要过滤的文件--空文件（可根据需求设置文件后缀等）  ；
        // 参数3：过滤操作的目录（只操作一层） 如果需要操作多层，则第三个参数改为 INSTANCE
        Collection<File>files = FileUtils.listFiles(new File("C:\\Users\\11310\\Desktop\\熊楚的文件\\12.21"), EmptyFileFilter.NOT_EMPTY,null);

        for(File file:files){

            System.out.println(file.getName());
        }




    }
}
