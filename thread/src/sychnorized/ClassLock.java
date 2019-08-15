package sychnorized;

import java.time.LocalDate;

public class ClassLock {
    public static void main(String[] args) {
        Lock l1 = new Lock();

        Thread t1 = new Thread(l1,"1");
        Thread t2 = new Thread(l1,"2");
        t1.start();
        t2.start();

    }
}

class Lock implements Runnable{
   // String name;
    //变量i的设置应该放在方法外部
    private int i = 0;
    public void run(){
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test();

        }
    }

    public synchronized void test(){
        //int i = 0;
        if(i>=20)
            return;
//        try {
//            //模拟网络延时
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName()+"-->"+(++i));

    }

}