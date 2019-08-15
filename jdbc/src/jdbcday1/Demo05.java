package jdbcday1;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Demo05 {
    public static void main(String[] args) {
        Connection conn = null;
        ResultSet rs = null;

        try {
            String sql = "insert into t_fruit (name,count) values(?,?)";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT", "root", "123456");
            //conn.setAutoCommit(false); //设为手动提交
            PreparedStatement st = conn.prepareStatement(sql);
            long start = System.currentTimeMillis();

            for(int i =0;i<500;i++){
               st.setObject(1,"coucous"+i);
               st.setObject(2,6666+i);
               st.executeUpdate();
            }

            long end = System.currentTimeMillis();
            System.out.println("插入500条数据，耗时(毫秒)："+(end-start));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            }catch(Exception e){
                e.printStackTrace();
                }
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }

            }


        }





    }

