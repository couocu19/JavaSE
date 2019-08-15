package copyfile;

//利用递归实现文件夹的拷贝
import java.io.*;
import java.lang.*;
public class DirectoryCopy {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\11310\\io\\coucous";

        File f1 = new File(path);

        String paths = "C:\\Users\\11310\\io\\hahas";

        File f2 = new File(paths);

        copyDir(f1,f2);

    }
    public static void copyDir(File initf,File copyf) {
//        File initf = new File(srcPath);
//        File copyf = new File(destPath);

        if (initf.isDirectory()) {
            File temp = new File(copyf,initf.getName());
            temp.mkdirs();
            for(File file:initf.listFiles()){
                copyDir(file,temp);
            }
        }else{
            File newFile = new File(copyf,initf.getName());
            copy(initf,newFile);
        }
    }
    public static void copy(File initf, File copyf){
//        File initf = new File(srcPath);  //待copy的文件 //源头
//
//        File copyf = new File(destPath);    //目标文件  //目的地

        InputStream in = null;
        OutputStream os = null;

        try{
            in = new FileInputStream(initf);
            os = new FileOutputStream(copyf,true);

            byte[] flush = new byte[30];
            int len = -1;

            while((len=in.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();

        }catch (FileNotFoundException e){
            e.printStackTrace();

        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if(os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(in!=null){
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}

