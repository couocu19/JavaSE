package orm;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 使用一个map封装一条记录
 *
 * 使用List<Map>存储多条记录
 * */
public class MapOrm {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coucou?serverTimezone=UTC","root","123456");
        String sql = "select * from orm where id>=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setObject(1,1);
        List<Map<String,Object>> list = new ArrayList<>() ;
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Map<String,Object> m = new HashMap<String,Object>();
            m.put("name",rs.getObject(2));
            m.put("age",rs.getObject(3));
            list.add(m);
        }

        for(Map<String,Object> m:list){
            for(String key:m.keySet()){
                System.out.print(key+"----"+m.get(key)+"  ");
            }
            System.out.println();

        }


    }
}
