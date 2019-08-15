package lambda;
/**
 * lambda 推导+ 参数
 * */
public class LambdaTest02 {

    public static void main(String[] args) {
        Lixian lixian = (int x)->{
            System.out.println("coucou likes lixian -->"+x+"年");
        };

        //进一步简化

        //如果只有一行代码 可以省略花括号 ，如果只有一个参数，可以省略括号
        lixian = (a)->{
            System.out.println("coucou likes lixian -->"+a+"年");
        };
        lixian.lambda(100);

        lixian = a -> System.out.println("啊！好帅啊李现");

    }

}

interface Lixian{

    void lambda(int a);

}

class Coucou implements Lixian{
    public void lambda(int x){
        System.out.println("coucou like xianxian"+x+"年");

    }

}