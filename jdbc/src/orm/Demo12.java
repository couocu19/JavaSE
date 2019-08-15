package orm;

import java.security.DrbgParameters;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试使用Object[]封装一条记录
 * 使用List<Object[]>存储多条记录
 *
 * */
public class Demo12 {
    public static void main(String[] args) throws Exception {
       test01();

    }

    public static void test01() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
        PreparedStatement ps = con.prepareStatement("select * from orm");
        ResultSet rs = ps.executeQuery();
        List<Orm> list = new ArrayList<>();

        while(rs.next()){
            Orm o = new Orm(rs.getInt(1),rs.getString(2),rs.getInt(3));
            list.add(o);
        }

        for(Orm o:list){

            System.out.println(o.getId()+"---"+o.getName()+"---"+o.getSalary());
        }



    }
}
