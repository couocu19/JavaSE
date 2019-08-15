package collection;

import java.util.Collection;

import java.util.*;
//测试Collection中的接口方法
public class TestList {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        //ArrayList实现了List接口，List接口继承了Collection接口

        c.size(); //返回容器中含有多少个元素
        System.out.println(c.isEmpty());

        ((ArrayList<String>) c).add("coucou");
        ((ArrayList<String>) c).add("直男");
        System.out.println(c);//打印c默认返回其toString方法

//        c.remove("直男");
//        c.clear();//清空所有元素
//
        c.toArray();//将容器中的元素转为一个对象数组

        Object[] objs = c.toArray();





    }

}
