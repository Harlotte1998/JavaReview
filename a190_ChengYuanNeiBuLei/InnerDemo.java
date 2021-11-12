package HeiMa.a190_ChengYuanNeiBuLei;


/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:11
 * @Version 1.0


1.2成员内部类
    按照内部类在类中定义的位置不同，可以分为如下两种形式
        ●在类的成员位置: 成员内部类
        ●在类的局部位置:局部内部类
    成员内部类，外界如何创建对象使用呢?
        ●格式:外部类名.内部类名  对象名=new.外部类对象.new 内部类对象;
        ●范例: Outer.Inner oi = new Outer0.new Inner0;




 测试类
 */

public class InnerDemo {
    public static void main(String[] args) {
        //创建内部类对象  并调用方法

        //Outer.Inner oi=new Outer().new Inner();
        //oi.show();


        Outer o=new Outer();
        o.method();


    }
}
