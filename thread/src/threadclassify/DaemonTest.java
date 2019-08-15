package threadclassify;

/**
 * 守护线程：为用户线程服务的；jvm停止不用等待守护线程执行完毕
 * 用户线程：虚拟机会等待用户线程执行完毕
 * */
public class DaemonTest {
    public static void main(String[] args) {
        you t = new you();
        god g = new god();

        Thread m = new Thread(g);
        //将用户线程设置为守护线程
        m.setDaemon(true);
        m.start();
        new Thread(t).start();



    }
}

class you extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("you");
        }
    }
}

class god extends Thread{
    public void run(){
        while(true){
            System.out.println("god");
        }
    }
}


