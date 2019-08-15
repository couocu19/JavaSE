package threadblock;

public class BlockedSleep01 {
    public static void main(String[] args) {
        runnable.Race racer = new runnable.Race();
        new Thread(racer,"tortoise").start();
        new Thread(racer,"rabit").start();
    }

}

class Race implements Runnable {
    private static String winner;
    public void run(){

        for(int steps = 1;steps<=100;steps++){
            //模拟兔子睡觉
            if(Thread.currentThread().getName().equals("rabit") && steps%10==0){
                try {
                    wait(1000);
//                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            //判断比赛是否结束
            boolean flag = gameOver(steps);
            if(flag){
                break;
            }
        }

    }

    private boolean gameOver(int steps){

        if(winner!=null){
            return true;
        }else{
            if(steps == 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+winner);
                return true;
            }
        }
        return false;
    }



}
