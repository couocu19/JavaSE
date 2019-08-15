package jdbcday2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/***
 * 测试使用JDBC工具类来简化操作
 *
 *
 */
public class Demo11 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = JDBCutil.getMysql();
            ps = con.prepareStatement("insert into t_fruit (name,count) values(?,?)");
            ps.setObject(1,"李现哥哥");
            ps.setObject(2,500000);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCutil.close1(rs,ps,con);
        }
    }
}
