package iobasicstep;

import java.io.*;

public class Ioinit021 {
    public static void main(String[] args) {
        File a = new File("coucouio");

        InputStream ins = null;

        try {
            ins = new FileInputStream(a);
            int temp;
            while((temp = ins.read())!=-1){
                System.out.println((char)temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        finally {
            if(null!=ins){
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
