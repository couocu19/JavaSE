package runnable;

//静态代理设计模式
// 公共接口： 1.真实角色  2.代理角色
public class StaticProxy {
    public static void main(String[] args) {

      new WeddingCompany(new You()).happyMarry();

    }


}

interface Marry{

    void happyMarry();
}

//真实角色
class You implements Marry{
    public void happyMarry(){
        System.out.println("我要和现哥哥结婚了！");
    }
}

class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    public void happyMarry(){

        ready();
        this.target.happyMarry();
        after();
    }

    private void ready(){
        System.out.println("先拍婚纱照！");
    }

    private void after(){
        System.out.println("然后去旅行！");
    }

}




//代理角色
