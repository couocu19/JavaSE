package reflection;

import reflectionbean.User;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.List;
//反射只在运行期有效：RUNTIME
public class Demo04 {

    public void test01(Map<String,User>map,List<User>list){

        System.out.println("Demo04.test01");

    }

    public Map<Integer,User> test03(){
        System.out.println("Demo04.test02");
        return null;
    }

    public static void main(String[] args) {

        try {
            //获得指定方法参数泛型信息
            Method m = Demo04.class.getMethod("test01", Map.class, List.class);
            Type[] t = m.getGenericParameterTypes();

            for (Type param:t){

                System.out.println("#"+param);
                if(param instanceof ParameterizedType){
                    Type[] gene = ((ParameterizedType) param).getActualTypeArguments();
                    for(Type gene1:gene){
                        System.out.println("泛型类型："+gene1);
                    }
                }

            }


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }



}
