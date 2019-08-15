package threadblock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

//模拟倒计时
public class BlockedSleep2 {
    public static void main(String[] args) throws InterruptedException {
        //倒计时
        Date endTime = new Date(System.currentTimeMillis()+1000*10);
        long end = endTime.getTime();
        while(true){
            //获得一个当前的分钟数
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            //每停1秒倒计时一次
            Thread.sleep(1000);
            endTime = new Date(endTime.getTime()-1000);
            if(end-10000>endTime.getTime()){
                break;
            }
        }



    }

    public static void test() throws InterruptedException{
        //倒数10个数，1秒一个
        int nun = 10;
        while(true){
            Thread.sleep(1000);
            System.out.println(nun--);

        }
    }
}
