package lambda;

public class LambdaTest03 {

    public static void main(String[] args) {
        new Thread(()-> System.out.println("嘻嘻嘻")).start();
        new Thread(()-> System.out.println("嘻嘻")).start();
        new Thread(()-> System.out.println("嘻")).start();

    }
}
