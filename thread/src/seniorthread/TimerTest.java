package seniorthread;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//高级主题 调度器Scheduler  控制所有调度
public class TimerTest {

    public static void main(String[] args) {

        Timer timer = new Timer();
        Calendar cal = new GregorianCalendar(2069,7,26,21,53,28);

        //timer.schedule(new MyTask(),1000); //每隔一秒执行任务一次
        timer.schedule(new MyTask(),1000,200);//执行多次

        timer.schedule(new MyTask(),cal.getTime(),200);//指定时间




    }
}

//任务类
class MyTask extends TimerTask{

    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("放开大脑休息一会儿");
        }

            System.out.println("--------end-------");


    }


}

