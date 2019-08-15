package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {
    public static void main(String[] args) {

        Map<Integer,Person> m1 = new HashMap<>();

        Person p1 = new Person(1,"coucou",999999);

        Person p2 = new Person(2,"lala",10000);

        m1.put(001,p1);
        m1.put(002,p2);

        Person p5 = m1.get(002);

        System.out.println(p5.getName());

    }

}

class Person{
    int id;
    String name;
    int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
