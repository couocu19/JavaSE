package jdbcday1;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


//测试SQL语句
//测试PreparedStatement 语句
public class Demo02 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
        //很少使用
        //Statement stmt = (Statement) conn.createStatement();
        //String


        //避免sql注入
        String sqi = "insert into t_fruit (name,count) values(?,?)"; //？占位符
        PreparedStatement ps = conn.prepareStatement(sqi);
       // ps.setInt(1,01); //参数索引从1开始计算，而不是0
//        ps.setString(1,"coucou");
////        ps.setInt(2,666);
        //使用setObject可以不用判断类型，比较方便
        ps.setObject(1,".........");
        ps.setObject(2,999);
        System.out.println("插入一行记录");
        ps.execute();
//        int num = ps.executeUpdate();
//        System.out.println(num);

//        if(conn!=null){
//            conn.close();
//        }
    }
}
