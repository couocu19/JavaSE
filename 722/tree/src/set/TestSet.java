package set;

import java.util.HashSet;
import java.util.Set;


// Set:没有顺序不可重复；//List：有顺序可重复
public class TestSet {

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<>();

        s1.add("11");
        s1.add("22");
        System.out.println(s1);
        s1.remove("11");
        System.out.println(s1);

        Set<String> s2 = new HashSet<>();
       // s2.add("coucou");
        s2.addAll(s1);
        s2.add("coucou");

        System.out.println(s2);


    }


}
