package HeiMa.a181_jieKouDeChengYuanTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 10:55
 * @Version 1.0


1.3接口的成员特点
    ●成员变量
        只能是常量
        默认修饰符: public static final
    ●构造方法
        接口没有构造方法，因为接口主要是对行为进行抽象的，是没有具体存在
        -个类如果没有父类,默认继承自Object类
    ●成员方法
        只能是抽象方法
        默认修饰符: public abstract
        关于接口中的方法，JDK8和JDK9中有一些新特性， 后面再讲解


测试类
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i=new InterImpl();
//        i.num=89;    会报错   因为接口中的变量  默认被 final  修饰 变为常量
        System.out.println(i.num);
//        i.num2=40;   是常量   会报错
        System.out.println(i.num2);

        System.out.println(Inter.num);
        //可以通过接口名直接调用

    }
}
