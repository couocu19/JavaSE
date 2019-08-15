package runnable;

public class StartRun implements Runnable{
    public void run(){


    }

    public static void main(String[] args) {
        //创建实现类对象
       // StartRun sr = new StartRun();
        //创建代理类对象
        //Thread t = new Thread(sr);
        //启动
        //t.start();
        //如果某个对象只使用一次，则可以使用以下命名方法
        new Thread(new StartRun()).start();
    }

}
