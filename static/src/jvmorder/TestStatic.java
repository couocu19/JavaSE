package jvmorder;

public class TestStatic {

     static String str = "coucou";
    public TestStatic(){

    }

    public static void m1(){

        System.out.println(str);
      //  m2();
    }

    public void m2(){

        System.out.println(str);
        System.out.println(str);
        m1();
    }



}

 class Test{
     public Test() {
     }

     private static void Print(){
            int a;


            System.out.println("Print()");
        }
        public static void main(String[] args) {


            ((Test)null).Print();
            //Print();
        }
    }
