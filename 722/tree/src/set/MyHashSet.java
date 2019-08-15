package set;


import java.util.HashMap;

//手动实现一个HashSet
//理解HashSet的底层原理
public class MyHashSet {

    HashMap map;

    //常量对象
    private static final Object PRESENT = new Object();

    public MyHashSet(){
        map = new HashMap();
    }

    public int size(){
        return map.size();
    }

    public void add(Object o){
        map.put(o,PRESENT);
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();

       sb.append("{");

       for(Object key:map.keySet()){
           sb.append(key+",");

       }

       sb.setCharAt(sb.length()-1,'}');
       return sb.toString();

    }

    public static void main(String[] args) {

        MyHashSet set = new MyHashSet();

        set.add("aa");
        set.add("bb");
        set.add("cc");

        System.out.println(set);
    }
}
