package threadstatus;

public class YieldTest1 {
    public static void main(String[] args) {

        new Thread(()->{
            for(int i = 0;i<100;i++){
                System.out.println("现现！"+"-->"+i);
            }
        }).start();


        //在哪个线程中用yield就是哪个线程礼让
        for(int i = 0;i<100;i++){
            if(i%20==0){
                Thread.yield();
            }
            System.out.println("coucou");
        }
    }
}
