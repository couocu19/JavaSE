package jdbcday1;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//取出数据库中指定日期区间的内容
public class Demo07 {

    //将字符串代表的日期转为long数字
    public static long strDate(String dateStr){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return format.parse(dateStr).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }

    }
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
        PreparedStatement ps = conn.prepareStatement("select * from t_fruit where gmt_create>?");

        Timestamp start = new java.sql.Timestamp(strDate(" 2019-08-01 01:40:30"));
        System.out.println(strDate(" 2019-08-01 01:40:30"));
        //Timestamp end = new java.sql.Timestamp(strDate(" 2019-08-01 01:40:33"));
        ps.setObject(1,start);
       // ps.setObject(2,end);
        ResultSet rs = ps.executeQuery();
        System.out.println("1");
        while(rs.next()){
            System.out.println(rs.getInt("id")+"-------"+rs.getObject("name")+"---"+rs.getObject("gmt_create"));
        }

        System.out.println("2");

    }
}
