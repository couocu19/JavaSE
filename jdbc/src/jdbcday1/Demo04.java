package jdbcday1;

import java.lang.reflect.ParameterizedType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo04 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");

        String sql = "select * from t_fruit where id>?";// ?是占位符
        PreparedStatement ps = conn.prepareStatement(sql);
        ((PreparedStatement) ps).setObject(1,2); //把id大于2的记录都取出来

        //返回一个结果集
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getObject(1)+"----"+rs.getObject(2));
        }
        if(rs!=null){
            rs.close();
        }
        if(ps!=null){
            ps.close();
        }
        if(conn!=null){
            conn.close();
        }






    }


}
