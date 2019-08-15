package collection;

import java.util.*;

public class TestList1 {
    public static void main(String[] args) {

    }
    public static void test(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        //重载的add方法
        list.add(2,"coucou");
        System.out.println(list);
        list.remove(1);
        list.set(3,"coucou1");
        //返回所存在的元素的索引位置(首次出现)，如果不包含这个元素，则返回-1。
        list.indexOf("coucou");
        list.lastIndexOf("coucous");



    }
}
