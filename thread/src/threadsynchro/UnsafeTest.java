package threadsynchro;

//线程不安全：数据有负数，不同的线程有同样的数据

import java.lang.String;
public class UnsafeTest {
    public static void main(String[] args) {
        Account account = new Account(100,"礼金");

        Drawing Lixian = new Drawing("现哥哥",account,80);
        Drawing cou = new Drawing("coucou",account,90);

        Lixian.start();
        cou.start();

    }
}

class Account{

    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

}

class Drawing extends Thread{

    Account account;
    int drawingMoney;
    int packetTotal;


    public Drawing(String name, Account account, int drawingMoney) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
}

    public void run(){
        if(account.money-drawingMoney<0){
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money-=drawingMoney;
        packetTotal += drawingMoney;
        System.out.println(this.getName()+"-->账户余额为："+account.money);
        System.out.println(this.packetTotal+"-->口袋里有："+packetTotal);


    }


}

