package HeiMa.a150_jiCheng;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 16:43
 * @Version 1.0

1.继承
    1.1继承概述
相同的属性
相同特征|
相同的方法

    1.1继承概述
        继承是面向对象三大特征之一。 可以使得子类具有父类的属性和方法，
        还可以在子类中重新定义，追加属性和方法


    继承的格式
        ●格式: public class子类名extends父类名{}
        ●范例: public class Zi extends Fu{}
        ●Fu:是父类,也被称为基类、超类

    继承中子类的特点:
        ●子类可以有父类的内容
        ●子类还可以有自己特有的内容



 */

public class Demo {
    public static void main(String[] args) {

        Fu f=new Fu();
        f.show();

        Zi z=new Zi();
        z.mother();

        //子类调用父类的方法
        z.show();

    }
}
