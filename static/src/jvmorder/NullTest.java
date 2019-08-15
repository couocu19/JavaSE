package jvmorder;

public class NullTest {
    public static void main(String[] args) {
        //NullTest.print();
        ((NullTest)null).print();
    }

    public void print(){
        System.out.println("1");
    }

}
