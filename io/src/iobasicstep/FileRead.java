package iobasicstep;

import java.io.*;
//四个步骤：创建源，选择流，操作，释放
//注意： FileReader和FileWriter只能处理字符文件

public class FileRead {
    public static void main(String[] args) {
        File src = new File("618.txt");
        Reader reader = null;
        try {
            reader = new FileReader(src);
            char[] datas = new char[1024];
            int len = -1;

            while((len=reader.read(datas))!=-1){
                //字符数组-->字符串
                String str = new String(datas,0,len);
                System.out.println(str);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
