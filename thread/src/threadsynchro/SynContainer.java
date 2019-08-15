package threadsynchro;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;


//线程安全：操作并发容器

public class SynContainer {
    public static void main(String[] args) throws  InterruptedException{

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for(int i = 0;i<1000;i++){
            new Thread(()->{
                list.add(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName());
            }).start();
        }
        Thread.sleep(10000);
        System.out.println(list.size());
    }
}

