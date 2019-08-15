package collection;
import java.util.HashMap;
import java.util.Map;

//熟悉键值对
//测试HashMap的使用
public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1,"coucou");
        m1.put(3,"haha");
        m1.put(5,"shidx");
        Map<Integer,String> m2 = new HashMap<>();
         m2.put(2,"heng");
         m2.put(4,"好吧");
         m2.putAll(m1);
         //将m1中的元素全部添加到m2中，将自动对key的值进行排序
        System.out.println(m2);
    }
}
