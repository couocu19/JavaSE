package threadsynchro;

/**
 * 同步块：目标更明确
 * */
public class SafeTest1 {
    public static void main(String[] args) {
        SafeAccount account = new SafeAccount(100,"礼金");
        SafeDrawing Lixian = new SafeDrawing("现哥哥",account,80);
        SafeDrawing cou = new SafeDrawing("coucou",account,90);
        Lixian.start();
        cou.start();

    }
}


class SafeAccount{

    int money;
    String name;

    public SafeAccount(int money, String name) {
        this.money = money;
        this.name = name;
    }

}


class SafeDrawing extends Thread {

    SafeAccount account;
    int drawingMoney;
    int packetTotal;


    public SafeDrawing(String name, SafeAccount account, int drawingMoney) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //需要锁定的对象：account账户，使用静态块达到线程安全
    public void run() {
        test();

    }

    public void test() {

        //为了提高性能
        if (account.money < 0) {
            return;
        }
        //同步块，目标更加明确
        synchronized (account) {
        if (account.money - drawingMoney < 0) {
//        }
            return;
        }
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//       }
            account.money -= drawingMoney;
            packetTotal += drawingMoney;
            System.out.println(this.getName() + "-->账户余额为：" + account.money);
            System.out.println(this.packetTotal + "-->口袋里有：" + packetTotal);

        }

   }
}


