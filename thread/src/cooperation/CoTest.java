package cooperation;


//协作模型--生产者消费者实现方式--管程法
public class CoTest {

    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();

    }
}

//生产者
class Productor extends Thread{
    SynContainer container;

    public Productor(SynContainer container) {
        this.container = container;
    }

    public void run(){
        for(int i =0;i<100;i++){
            //i对应之后的面包对应的id
            System.out.println("生产-->"+i+"个馒头");
            container.push(new Steamedbun(i));
        }
    }
}

//消费者

class Consumer extends Thread{
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    public void run(){
        for(int i = 0;i<100;i++){
            System.out.println("消费-->"+container.pop().id+"个馒头");
        }
    }
}
//缓冲区

class SynContainer{
    Steamedbun[] buns = new Steamedbun[10];

    int count = 0;
    //存储生产
    public synchronized void push(Steamedbun bun){
        //容器中存在空间时可以生产
        //空间已满，停止生产
        if(count==buns.length){
            try {
                this.wait();  //线程阻塞 消费者通知生产解除
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buns[count] = bun;
        count ++;
        //存在数据 可以通知消费
        this.notifyAll();
    }

    //获取 消费
    public synchronized Steamedbun pop(){
        //何时消费 容器中是否存在数据
        //没有数据，只有等待
        if(count==0){
            try {
                this.wait();  //线程阻塞 生产者通知消费 解除阻塞
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //存在数据时可以消费
        count--;
        Steamedbun bun = buns[count];
        this.notifyAll();//存在空间了可以唤醒对方生产了
        return bun;
    }

}


//数据区--->假定是馒头

class Steamedbun{
    int id;

    public Steamedbun(int id) {
        this.id = id;
    }
}









