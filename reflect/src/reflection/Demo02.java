package reflection;

import java.lang.reflect.*;
/**
 * 应用反射的API，获取类的信息（类的名字，属性，方法，构造器等）
 * */


public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException{
        String path = "reflectionbean.User";
        Class clz = Class.forName(path);

        System.out.println(clz.getName()); //获得包名和类名
        System.out.println(clz.getSimpleName()); //获得类名

        //获得属性
        Field[] f = clz.getFields();  //只能获得public的field属性
        Field[] f1 = clz.getDeclaredFields(); //获得所有属性
        System.out.println(f1.length);
        for(Field temp:f1){

            System.out.println(temp);
        }

        //获得方法
        Method[] methods = clz.getDeclaredMethods();
        //第二个代表参数类型，如果没有方法的参数类型则写为null
        Method m = clz.getDeclaredMethod("getId",null);
        Method m1 = clz.getDeclaredMethod("setId",int.class);
        System.out.println(m1);

        //获得构造器信息
        //利用数组获得所有的构造器
        Constructor[] constructors = clz.getDeclaredConstructors();
        for(Constructor temp:constructors){
            System.out.println("构造器"+temp);
        }
        //获得指定参数类型的构造器
        Constructor c1 = clz.getDeclaredConstructor(int.class,int.class,String.class);
        System.out.println("获得构造器"+c1);




    }
}
