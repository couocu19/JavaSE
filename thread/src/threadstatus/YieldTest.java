package threadstatus;

//yield 礼让线程，暂停线程 直接进入就绪状态不是阻塞状态
public class YieldTest {
    public static void main(String[] args) {
        MyYield my = new MyYield();
        new Thread(my,"a").start();
        new Thread(my,"b").start();

    }
}

class MyYield implements Runnable{

    public void run(){
        System.out.println(Thread.currentThread().getName()+"1");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"2");

    }
}
