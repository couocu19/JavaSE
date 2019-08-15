package lambda;
/**
 * lambda推导
 * */
public class LambdaTest01 {
    //静态内部类
    static class Like2 implements Ilike{
        public void lambda(){
            System.out.println("I really like 李现");
        }
    }

    public static void main(String[] args) {
        Ilike like  = new Like();
        like.lambda();
        like  = new Like2();
        like.lambda();

        //方法内部类
        class Like3 implements Ilike {
            public void lambda() {
                System.out.println("I really like 李现");
            }
        }
        like  = new Like3();
        like.lambda();

        //匿名内部类
        like = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("I really really really like 李现");

            }
        };
        like.lambda();

        //lambda
        like = ()->{
            System.out.println("I really really really really like 李现");

        };
        like.lambda();

    }


}

//使用lambda时要保证接口只有一个未实现的方法
interface Ilike{
    void lambda();

}

class Like implements Ilike{
    public void lambda(){
        System.out.println("I like 李现");

    }
}


