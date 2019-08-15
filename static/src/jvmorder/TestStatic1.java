package jvmorder;

public class TestStatic1 {
    public Print obj2 = new Print("6");
    public static Print obj3 = new Print("1");
    static{
        new Print("2");
    }
    public static Print obj4 = new Print("3");
    public Print obj5 = new Print("7");
    public TestStatic1(){
        new Print("8");
    }
}
class Print {

    public Print(String s){
        System.out.print(s + " ");
    }
}


class Child extends TestStatic1{

    static{
        new Print("4");
    }

    public static Print obj1 = new Print("5");

    public Print obj2 = new Print("9");

    public Child (){
        new Print("11");
    }

    public Print obj4 = new Print("10");

    public static void main(String [] args){
        TestStatic1 obj1 = new Child ();
        TestStatic1 obj2 = new Child ();
    }
}

