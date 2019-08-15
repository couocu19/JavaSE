package copy;

import java.io.*;
public class DirCopy01 {

    public static void main(String[] args) {
        File f1 = new File("coucoufle");

        File f2 = new File("tt.txt");

        File f3 = new File("iocopys/src/t.txt");
        System.out.println(f3.exists());

          copyFile(f3,f2);
//        copyDir(f1,f2);

    }

    public static void copyFile(File f1,File f2){
        InputStream in  = null;
        OutputStream os = null;

        try{
            in = new FileInputStream(f1);
            os = new FileOutputStream(f2);

            byte[] flush = new byte[1024];
            int len = -1;

            while((len=in.read(flush))!=-1){
                os.write(flush,0,len);
            }
            os.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
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

    public static void copyDir(File f1,File f2){
        if(f1.isDirectory()){
            File temp = new File(f2,f1.getName());
            //记得建立多级文件夹！
            temp.mkdirs();

            for(File f:f1.listFiles()){
                copyDir(f,temp);
            }
        }else{
            //与上面if中建立的方式一样哦
            File newfile = new File(f2,f1.getName());
            copyFile(f1,newfile);
        }
    }
}


