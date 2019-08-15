package iostudy;
import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) throws  Exception{
        //文件操作的标准代码
        File src = new File("IMG_study.JPG");
        if(!src.exists()){
            System.out.println("文件不存在");
            src.createNewFile();
        }else{
            if(src.isFile()){
                System.out.println("文件操作");
            }else{
                System.out.println("文件夹操作");
            }
        }



    }
}
