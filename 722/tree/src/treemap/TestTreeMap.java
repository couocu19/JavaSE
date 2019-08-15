package treemap;

import java.util.*;

//treemap的基本用法
public class TestTreeMap {
    public static void main(String[] args) {

        Map<Integer,String> treemap1 = new TreeMap<>();

        treemap1.put(199,"aa");

        treemap1.put(99,"bb");

        treemap1.put(255,"cc");


        //按照key的递增方式排序
        for(Integer key:treemap1.keySet()){

            System.out.println(key+"----"+treemap1.get(key));
        }

        Map<Emp,String> treemap2 = new TreeMap<>();

        treemap2.put(new Emp(10,"张三",50000),"张三很棒！");
        treemap2.put(new Emp(11,"张四",50000),"张四很棒！");
        treemap2.put(new Emp(11,"张五",60000),"张五很棒很棒！");
        treemap2.put(new Emp(500,"张六",80000),"张六很棒很棒很棒！");

        for(Emp key:treemap2.keySet()){
            System.out.println(key+"----"+treemap2.get(key));
        }



    }
}

class Emp implements Comparable<Emp>{

    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Emp o) {  //负数：小于 ，0：等于 ，正数：大于

        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else{

            if(this.id>o.id){
                return 1;
            }else if(this.id<o.id){
                return -1;
            }else{
                return 0;
            }
        }

    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}



