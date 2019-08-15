package sychnorized;

import java.time.LocalDate;

public class LockTest02 {
    public static void main(String[] args) {
        Lock02 l1 = new Lock02();
        for(int i =0;i<100;i++) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {

                    l1.test1();
                }
            }, "a");
            t1.start();
        }

//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
////                try {
////                    Thread.sleep(500);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                }
//                l1.test1();
//            }
//        },"b");

//        t1.start();
//        t2.start();

    }
}

class Lock02{
    public void test1() {
        //对象锁1::锁定代码块
        synchronized (this) {
            int i = 5;
            while (i-- > 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }

    //对象锁2:锁定方法
    public synchronized void test2(){
        int i =10;
        while(i-- >0){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
