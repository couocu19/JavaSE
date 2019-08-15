package iostudy;

//创建目录：经常使用mkdirs ，因为不用考虑上级目录是否存在
//列出下一级：list() 只返回一层！
//列出下一级的文件或者对象  ：  listFiles()
//利用递归打印子孙级目录和文件夹名称
import java.io.*;

public class DirDemo01 {
    public static void main(String[] args) throws NullPointerException {
        File dir = new  File("C:/Users/11310/io");
//        String[] list = dir.list();
//        //输出文件夹的下一级文件 ，注意：只输出下一级。
//        for(String s:list){
//            System.out.println(s);
//        }
//        //下级对象
//        File[] subFiles = dir.listFiles();
//        for(File s:subFiles){
//            System.out.println(s.getAbsolutePath());
//        }
        printFile(dir,0);

    }
    public static void printFile(File file,int deep)throws NullPointerException {
        //控制前面的层次
        for(int i = 0;i<deep;i++) {
            System.out.print("-");
        }
        //打印文件名称
        System.out.println(file.getName());
        //递归头和递归体
        if(file == null ||!file.exists()){
            return ;
        }else if(file.isDirectory()){
            File[] f = file.listFiles();
            for(File s:f){
                printFile(s,deep+1);
            }
        }


    }

}
