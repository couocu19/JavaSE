package jdbcday1;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * 测试CLOB文本大对象的使用
 * 包含：将字符串，文件内容插入数据库中的CLOB字段，将CLOB字段取出来的操作
 */

public class Demo09 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");

        PreparedStatement ps = conn.prepareStatement("UPDATE t_fruit SET info=? WHERE NAME='刘昊然'");

        //将文本文件内容直接输入到数据库中
        //ps.setClob(1,new FileReader(new File("info.txt")));
        //将输入流转为一个字符流
        //将程序中的字符串输入到数据库的clob字段中
        ps.setClob(1,new BufferedReader(new InputStreamReader(new ByteArrayInputStream("这里是刘昊然".getBytes()))));

        ps.execute();






    }
}
