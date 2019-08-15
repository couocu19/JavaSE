package threadfirst;

//创建线程方式1：
// 1.创建：继承Thread+重写run

public class StartThread extends Thread{
    //线程的入口点

    public void run(){
        for(int i=0;i<40;i++){
            System.out.println("一边听歌");
        }

    }

    public static void main(String[] args) {
        //创建子类对象
        StartThread st = new StartThread();

        //启动线程
        st.start(); //不保证立即运行，由cpu调用
        // st.run();--->只是如同方法的调用

        for(int i = 0;i<20;i++){
            System.out.println("一边coding");
        }


    }
}
