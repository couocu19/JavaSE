package copyfile;

import java.io.*;

public class FileCopyMethod {
    public static void main(String[] args) {
        copy("C:\\Users\\11310\\io\\File.java","Fas");
    }

    public static void copy(String srcPath,String destPath){
        File initf = new File(srcPath);  //待copy的文件 //源头

        File copyf = new File(destPath);    //目标文件  //目的地

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

