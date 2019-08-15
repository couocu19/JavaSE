package reflection;

import reflectionbean.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射API多态的操作
 *
 * */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        String path = "reflectionbean.User";

        Class<User> clz =(Class<User>) Class.forName(path);
        //通过反射API构造方法，构造对象
        //获得User的无参构造器
        User u = clz.newInstance();
        System.out.println(u);

        Constructor<User>  c = clz.getDeclaredConstructor(int.class,int.class,String.class);
        //传递实参
        User u2 = c.newInstance(01,19,"cocuou");
        System.out.println(u2.getName());

        //通过反射API调用普通方法
        User u3 = clz.newInstance();
        //动态调用方法
        Method method = clz.getDeclaredMethod("setName", String.class);
        method.invoke(u3,"李现");
        //上面两行代码相当于：：u3.setName("李现");
        System.out.println(u3.getName());

        //通过反射API操作属性
        Field f = clz.getDeclaredField("id");
        //设置属性的值
        // System.out.println(u3.getId()); -->非法的语句，此处不能访问私有的属性
        f.setAccessible(true);  //这个属性不用再做安全检查，可以直接访问
        f.set(u3,29);
        System.out.println(u3.getId());



    }
}
