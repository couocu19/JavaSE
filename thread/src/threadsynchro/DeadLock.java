package threadsynchro;

/**
 * 死锁：过多的同步容易造成死锁
 * 避免死锁的方法：不要再同一个代码块中，同时持有多个对象的锁
 * */
public class DeadLock {

    public static void main(String[] args) {
        Markup g1 = new Markup(1,"coucou");
        Markup g2 = new Markup(0,"coucous");
        g1.start();
        g2.start();
    }
}

class LipStik{

}

class Mirror{

}

class Markup extends Thread{

    static LipStik stick = new LipStik();
    static Mirror mirror = new Mirror();
    int choice;
    String girl;

    public Markup(int choice, String girl) {
        this.choice = choice;
        this.girl = girl;
    }
    public void run(){
        markup();

    }
    //相互持有对方的对象锁-->可能造成死锁
    //造成死锁原因解释：当第一个人用完口红用镜子时，第一个人部分的线程想要占有mirror的锁，但是此时第二个人正在占有mirror的锁还未用完
    public void markup(){
        if(choice == 0){
            synchronized (stick){
                System.out.println(this.girl+"涂口红");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (mirror){
                    System.out.println(this.girl+"照镜子");
                }
            }
//            synchronized (mirror){
//                System.out.println(this.girl+"照镜子");
//            }
        }else{
            synchronized (mirror){
                System.out.println(this.girl+"照镜子");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (stick){
                    System.out.println(this.girl+"涂口红");
                }
            }
//            synchronized (stick){
//                System.out.println(this.girl+"涂口红");
//            }


        }

    }


}

