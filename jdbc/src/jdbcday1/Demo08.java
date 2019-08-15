package jdbcday1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

//给数据库中表的一些数据中添加时间
public class Demo08 {
    public static void main(String[] args)throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
        PreparedStatement ps1 = null;
       String sql = "UPDATE t_fruit SET gmt_create=? WHERE NAME=?";

        for(int i =0;i<500;i++){
           // String sql = "UPDATE t_fruit SET gmt_create=? WHERE NAME='coucou'+i";
            ps1 = conn.prepareStatement(sql);
            Timestamp stamp = new Timestamp(System.currentTimeMillis());
            ps1.setObject(1,stamp);
            ps1.setObject(2,"coucous"+i);
            ps1.executeUpdate();
        }

    }
}
