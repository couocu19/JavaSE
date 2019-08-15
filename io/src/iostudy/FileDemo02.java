package iostudy;

import java.io.File;
//相对路径和绝对路径
public class FileDemo02 {
    public static void main(String[] args)throws Exception {
        String path = "IMG_study.JPG";
        File src = new File(path);
//        src.createNewFile();
        System.out.println(src.exists());
        System.out.println(src.isFile());
       //  注意，也可以创建一个不存在的文件，相当于创建了一个不存在的路径
        File src1 = new File("IMG_study.JPG");
        System.out.println(src1.getAbsolutePath());
        System.out.println(src.exists());
        src = new File("iostudy\\IMG_study.JPG");
        System.out.println(src.exists());
        System.out.println(src.isFile());


       // File src2 = new File("con");注意：文件的名称不能是con  con是非法的域名……
        File src2 = new File("nn");
        src2.createNewFile();
    }
}
