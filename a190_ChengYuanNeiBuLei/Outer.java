package HeiMa.a190_ChengYuanNeiBuLei;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:08
 * @Version 1.0

1.2成员内部类
    按照内部类在类中定义的位置不同，可以分为如下两种形式
        ●在类的成员位置: 成员内部类
        ●在类的局部位置: 局部内部类


 */

public class Outer {

    //定义一个成员变量
    private int num=10;


/*
    //定义一个成员内部类
    public class Inner{

        //定义一个成员方法  用来访问成员变量
        public void show(){
            System.out.println(num);
        }
    }
 */


    //定义一个成员内部类
    private class Inner{

        //定义一个成员方法  用来访问成员变量
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i=new Inner();
        i.show();
    }

}
