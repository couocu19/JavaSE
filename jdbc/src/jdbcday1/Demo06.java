package jdbcday1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

public class Demo06 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");

        PreparedStatement ps1 = conn.prepareStatement("insert into t_fruit (name,count,gmt_create,gmt_modified) values (?,?,?,?)");
//        ps1.setObject(1,"刘昊然de");
//        ps1.setObject(2,"500000000");
//
//        //Date类只能精确到年月日
//        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
//        Timestamp stamp = new Timestamp(System.currentTimeMillis());
//        ps1.setObject(3,date);
//        ps1.setObject(4,stamp);
//        ps1.execute();
//        System.out.println("刚刚插入了一条数据");
        //插入当前时间
        //Timestamp stamp = new Timestamp(System.currentTimeMillis());
        //如果要插入指定日期，可是使用Calendar类

        







    }





}
