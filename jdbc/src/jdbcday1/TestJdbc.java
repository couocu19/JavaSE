package jdbcday1;



import java.sql.DriverManager;
import java.sql.Connection;

//测试和数据库建立连接
public class TestJdbc {
    public static void main(String[] args){
        //加载驱动类

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            long start = System.currentTimeMillis();
            //建立连接(连接对象内部其实包含了Socket对象，是一个远程的连接。比较耗时！！！！)
            //在开发中，为了提高效率，都会使用连接池来管理连接对象
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("建立连接，耗时："+(end-start)+"ms毫秒");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
