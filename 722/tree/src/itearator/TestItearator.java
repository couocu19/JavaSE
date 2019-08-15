package itearator;

import java.lang.*;
import java.util.*;
import java.util.Map.Entry;

//测试迭代器遍历List，Set，Map
public class TestItearator {
    public static void main(String[] args) {
        //testIteratorList();
        testIteratorMap();

    }

  /*  public static void testIteratorList(){
        List<String> list = new ArrayList<>();

        list.add("aa");
        list.add("bb");
        list.add("cc");

        for(Iterator<String> it = list.iterator();((Iterator) it).hasNext();){

            String temp = it.next();
            System.out.println(temp);
        }

    }*/
    public static void testIteratorMap(){
        Map<Integer,String>m1 = new HashMap<>();
        m1.put(1,"aa");
        m1.put(11,"aaa");
        m1.put(111,"aaaa");

        Set<Entry<Integer,String>> ss = m1.entrySet();

        for(Iterator<Map.Entry<Integer,String>> iter = ss.iterator();iter.hasNext();){

            Entry<Integer,String> temp = iter.next();

            System.out.println(temp.getKey()+"---"+temp.getValue());

        }

    }



}
