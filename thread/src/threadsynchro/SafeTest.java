package threadsynchro;
/**
 * 线程安全：在并发时保证数据的正确性，效率尽可能高
 * synchronized
 * 1.同步方法 *
 * 2.同步块
 * */
public class SafeTest {
    public static void main(String[] args) {
        //一份资源
        SafeWeb12306 safe = new SafeWeb12306();
        System.out.println(Thread.currentThread().getName());

        //多个代理
        new Thread(safe,"coucou").start();
        new Thread(safe,"现现").start();
        new Thread(safe,"然然").start();

    }
}


class SafeWeb12306 implements Runnable {

    private int ticketNums = 200;
    private boolean flag = true;

    //run方法不能对外抛出异常！
    public void run(){
        while(true){
            try {
                //模拟网络延时
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            test();
            }

        }
        //线程安全，同步
       //锁的是对象的资源
    public synchronized  void test(){
        if(ticketNums<=0){
            flag = false;
            return;
        }
        try {
            //模拟网络延时
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->"+ticketNums--);
    }


}


