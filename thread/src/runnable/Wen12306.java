package runnable;

//模拟火车抢票
public class Wen12306 implements Runnable {
    private int ticketNums = 99;

    //run方法不能对外抛出异常！
    public void run(){
        while(true){
            if(ticketNums<0){
                break;
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

    public static void main(String[] args) {
        //一份资源
        Wen12306 web = new Wen12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理

        new Thread(web,"coucou").start();
        new Thread(web,"现现").start();
        new Thread(web,"然然").start();

    }

}
