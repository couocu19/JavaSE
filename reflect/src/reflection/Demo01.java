package reflection;

//测试各种类型(class,interface,enum,annotation,primitive type(基本数据类型)，void)java.lang.Class对象的获取方式
@SuppressWarnings("all")
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        String path = "reflectionbean.User";
        Class clz = Class.forName(path);
        //对象是表示或封装一些数据。一个类被加载后，jvm会创建一对应该类的Class对象，类的整个结合信息会放到对应的Class对象中。
        //Class对象就像一面镜子。通过这个对象能够获取这个类的全部信息.
        //一个类只对应一个Class对象
        System.out.println(clz.hashCode());


        //相同的数据类型对性的Class对象指向同一个
        Class strClz = String.class;
        Class strClz1 = path.getClass();
        System.out.println(strClz1.hashCode());
        System.out.println(strClz==strClz1);

        int[] a = new int[10];
        int[] b = new int[50];  //Class对象是否指向同一个与数组的大小无关，而是与数组是几维数组有关
        int[][] c = new int[3][];


        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
        System.out.println(c.getClass().hashCode());


    }
}
