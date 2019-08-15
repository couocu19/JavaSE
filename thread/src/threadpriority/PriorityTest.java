package threadpriority;

//多线程优先级的测试
/**
 * 程序的优先级 1-10
 * 1、NORM_PRIORITY  5  默认
 * 2.MIN_……  1
 * 3.MAX_ …… 10
 * */
//优先级设置一定要在启动前
public class PriorityTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
    }
}
