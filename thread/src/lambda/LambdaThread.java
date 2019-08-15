package lambda;

public class LambdaThread {
    //内部类的好处：不会随着程序的加载而加载，而是随着外部类的加载而加载
    //静态内部类
    static class Test implements Runnable{
        public void run(){
            for(int i = 1;i<=20;i++){
                System.out.println("在听歌");
            }
        }
    }

    public static void main(String[] args) {
      //  new Thread(new Test()).start();

        //局部内部类
        class Test2 implements Runnable{
            public void run(){
                for(int i = 0;i<20;i++){
                    System.out.println("在听歌");
                }
            }
        }
        new Thread(new Test2()).start();

        //匿名内部类，必须借助接口或者父类

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<20;i++){
                    System.out.println("在听歌");
                }
            }
        }).start();

        //jdk8 简化 lambda
        //一般只有简单的线程体才使用lambda表示
        //只能有一个方法！
        new Thread(()->{
            for(int i = 0;i<20;i++){
                System.out.println("在听歌");
            }

        }).start();



    }


}
