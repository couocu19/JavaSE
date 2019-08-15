package threadstatus;

/**
 * 终止线程
 *   1.线程正常执行完毕-->线程有次数的限制
 *   2.外部干涉-->加入标识
 *   注意：不要使用 stop destroy
 * */
public class TerminateThread implements Runnable{
    //加入标识，标记线程体是否可以运行
    private boolean flag = true;

    private String name;
    public static void main(String[] args) {
        TerminateThread tt = new TerminateThread("coucou");
        new Thread(tt).start();

        for(int i = 0;i<=99;i++){
            if(i==88){
                tt.terminate();//线程的终止
                System.out.println("tt is over");
            }

            System.out.println("main-->"+i);
        }

    }

    public TerminateThread(String name) {
        this.name = name;
    }

    public void run(){
        //关联，true:线程运行
        int i = 0;

        while(flag){
            System.out.println(name+"-->"+i++);
        }
    }
    //对外提供方法改变标识
    public void terminate(){
        this.flag = false;
    }
}
