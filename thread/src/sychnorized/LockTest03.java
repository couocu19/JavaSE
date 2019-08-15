package sychnorized;


public class LockTest03 {
    public static void main(String[] args) {
        Eating eating = new Eating(1,"A");

        Eating eating1 = new Eating(0,"B");
        eating.start();
        eating1.start();

    }
}


class Bread{

}

class Milk{

}

class Eating extends Thread{
    //此处只有是静态变量才可能造成死锁
     Milk milk = new Milk();
     Bread bread = new Bread();

    private int choice;
    String name;

    public Eating(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    public void run(){
        test();
    }

    public void test(){
        if(choice == 0){
            synchronized (milk){
                System.out.println(this.name +"milk");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (bread){
                    System.out.println(this.name+"bread");
                }
            }


        }else{
            synchronized (bread){
                System.out.println(this.name+"bread");
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                synchronized (milk){
                    System.out.println(this.name+"milk");
                }
            }

        }

    }
}