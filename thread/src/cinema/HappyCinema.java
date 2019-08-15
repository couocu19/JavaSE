package cinema;

import java.util.*;
//模拟电影院购票系统
public class HappyCinema {
    public static void main(String[] args) {
        List<Integer> avaliable = new ArrayList<Integer>();
        avaliable.add(1);
        avaliable.add(2);
        avaliable.add(3);
        avaliable.add(4);
        avaliable.add(5);
        avaliable.add(6);
        //顾客需要的位置
        List<Integer> seats1 = new ArrayList<Integer>();
        seats1.add(1);
        seats1.add(2);
        List<Integer> seats2 = new ArrayList<Integer>();
        seats2.add(4);
        seats2.add(5);
        seats2.add(6);
        CouCinema c = new CouCinema(avaliable,"coucou cinema");

        new Thread(new Customer(c,seats1),"coucou").start();
        new Thread(new Customer(c,seats2),"现现").start();

    }
}

class CouCinema{
    List<Integer> avaliable;
    String name;

    public CouCinema(List<Integer> avaliable, String name) {
        this.avaliable = avaliable;
        this.name = name;
    }

    public boolean bookTickets(List<Integer>seats){

        System.out.println("欢迎光临"+this.name+"当前可用位置为："+avaliable);
        List<Integer> copy = new ArrayList<Integer>();
        copy.addAll(avaliable);
        //相减
        copy.removeAll(seats);
        //判断大小
        if(avaliable.size()-copy.size()!=seats.size()){
            return false;
        }
        //成功
        avaliable = copy;
        return true;
    }
}


class  Customer implements Runnable{
    CouCinema cinema;
    List<Integer>seats;

    public Customer(CouCinema cinema, List<Integer> seats) {
        this.cinema = cinema;
        this.seats = seats;
    }

    public void run(){
        synchronized (cinema){
            boolean flag =cinema.bookTickets(seats);
            if(flag){
                System.out.println("出票成功"+Thread.currentThread().getName()+"位置："+seats);

            }else{
                System.out.println("出票失败"+Thread.currentThread().getName()+"位置不够");
            }
        }
    }


}
