package collection;
//测试泛型
import java.util.*;
public class TestGeneric {
    public static void main(String[] args) {
        //String为实参
        MyCollection<String>mc = new MyCollection<>();
        //第二个尖括号中的String可写可不写
        mc.set("coucou",0);
        String b = mc.get(0);
        System.out.println(b);
        List list = new ArrayList() ;
        Map map = new HashMap();
    }
}

class MyCollection<E>{
    Object[] ob = new Object[5];
    public void set(E e,int index){
        ob[index] = e;
    }

    public E get(int index){
        return (E)ob[index];
    }
}