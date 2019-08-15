package threadstatus;

import java.awt.*;
import java.lang.Thread.State;

/**
 * 观察线程的状态
 * */
public class AllStatus {
    public static void main(String[] args) {

        Thread t = new Thread(()->{
            for(int i = 0;i<5;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        });
        State state = t.getState();
        System.out.println(state);

        t.start();
        state = t.getState();
        System.out.println(state);

        while(state!= State.TERMINATED){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = t.getState();
            System.out.println(state);

        }
        state = t.getState();
        System.out.println(state);



    }
}
