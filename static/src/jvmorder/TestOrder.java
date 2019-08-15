package jvmorder;


public class TestOrder{
    public static void main(String[] args) {
        new TestOrder();
    }
    static int num = 4;
    {
        num += 3;
        System.out.println("b");
    }
    int a = 5;
    {
        System.out.println("c");
    }
    TestOrder() {
        System.out.println("d");
    }
    static {
        System.out.println("a");
    }
    static void run()
    {
        System.out.println("e");
    }
}