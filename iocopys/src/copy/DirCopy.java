package copy;

import java.io.*;

public class DirCopy {
//    public static void main(String[] args) {
//
//        File finit = new File("C:/Users/11310/iocopys/text1");
//
//        File fcopy = new File("c6");
//
//        File finit1 = new File("C:\\Users\\11310\\iocopys\\coucoufle");
//
//        File fcopy1 = new File("c5");
//
////        copyDir(finit1,fcopy1);
//
//        copyDir(finit,fcopy);
//
//
//    }
//    //单个文件的copy
//    public static void copyFile(File f1,File f2){
//        InputStream in = null;
//        OutputStream os = null;
//
//        try{
//            in = new FileInputStream(f1);
//            os = new FileOutputStream(f2);
//
//            byte[] flush = new byte[1024];
//            int len = -1;
//
//            while((len = in.read(flush))!=-1){
//                os.write(flush,0,len);
//            }
//            os.flush();
//
//        }catch (FileNotFoundException e){
//            e.printStackTrace();;
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if(os!=null){
//                    os.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            try {
//                if(in!=null){
//                    os.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void copyDir(File f1,File f2){
//       if(f1.isDirectory()){
//            File newFile = new File(f2,f1.getName());
//            newFile.mkdirs();
//
//            for(File temp:f1.listFiles()){
//                copyDir(temp,newFile);
//            }
//         }else{
//
//                File temp = new File(f2,f1.getName());
//                copyFile(f1,temp);
//        }
//
//    }
}
