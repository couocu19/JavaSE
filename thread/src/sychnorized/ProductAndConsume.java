package sychnorized;

import java.sql.PreparedStatement;

public class ProductAndConsume {
    public static void main(String[] args) {
        Synchcontainer s = new Synchcontainer();
        new Productor(s).start();
        new Consumer(s).start();
    }
}

class Productor extends Thread{
    Synchcontainer synchcontainer;
    public Productor(Synchcontainer synchcontainer) {
        this.synchcontainer = synchcontainer;
    }
    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("生产者生产了"+i+"个馒头");
            synchcontainer.push(new Food(i));
        }

    }

}

class Consumer extends Thread{
    Synchcontainer synchcontainer;
    public Consumer(Synchcontainer synchcontainer) {
        this.synchcontainer = synchcontainer;
    }

    public void run(){
        for(int i =1;i<=100;i++){
            System.out.println("消费了第"+synchcontainer.pop().id+"个馒头");
        }


    }
}

class Synchcontainer{
    Food[] foods = new Food[10];
    int count = 0;
    public synchronized void push(Food food){
        if(count == foods.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //先存后取
        foods[count] = food;
        count++;
        this.notifyAll();
    }

    public synchronized Food pop(){
        if(count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //先取后返回
        count--;
        Food food = foods[count];
        this.notifyAll();
        return food;
    }
}

class Food{
    int id;
    public Food(int id) {
        this.id = id;
    }
}



