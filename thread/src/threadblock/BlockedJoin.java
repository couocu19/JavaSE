package threadblock;

//合并线程，插队线程
//join写在哪个线程体中，哪个线程就被阻塞

public class BlockedJoin {
    public static void main(String[] args) {
        System.out.println("记录和现现在一起的一天……");
        new Thread(new Lixian()).start();


    }
}

class Lixian extends Thread{
    public void run(){
        System.out.println("现现想喝奶茶");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("coucou问现现：你想喝什么呀~");
        try {
            System.out.println("现现陷入了沉思");
            for(int i =1 ;i<=5;i++){
                System.out.println("过了"+i+"秒");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("现现想来想去说：你买的我都喜欢……");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("coucou听之后立马去买奶茶了~");
        Thread c = new Thread(new Cou());
        c.start();
        try {
            c.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("现现拿到了coucou给买的奶茶");

        System.out.println("愉快的一天结束了……");
    }

}

class Cou extends Thread{
    public void run(){
        System.out.println("coucou跑着出去准备买奶茶啦！");
        System.out.println("结果coucou在路上碰到了然然！两个人打了个招呼用了10秒！");
        //模拟10秒倒计时

        for(int i = 0;i<10;i++){
            System.out.println(i+"秒过去了……");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("和然然打完招呼赶紧急着去买奶茶了~");
        System.out.println("coucou拿着现现爱喝的奶茶回去找现现了！");


    }
}
