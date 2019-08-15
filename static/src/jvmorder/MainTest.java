package jvmorder;

public class MainTest {
    static int value = 33;
    public static void main(String[] args) throws Exception{
        new MainTest().printValue();
    }
    private void printValue(){
        int value = 3;
        System.out.println(this.value);
    }
}
