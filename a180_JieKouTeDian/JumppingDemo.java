package HeiMa.a180_JieKouTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 10:39
 * @Version 1.0


1.2接口的特点
●接口用关键字interface修饰
    public interface接口名{}
●类实现接口用implements表示
    public class类名implements接口名}
●接口不能实例化
    接口如何实例化呢?参照多态的方式，通过实现类对象实例化,这叫接口多态。
    多态的形式:具体类多态，抽象类多态，接口多态。
    多态的前提:有继承或者实现关系;有方法重写;有父类/接口)引用指向(子/实现)类对象
●接口的实现类
    要么重写接口中的所有抽象方法
    要么是抽象类



 */

public class JumppingDemo {
    public static void main(String[] args) {
//        Jumpping j=new Jumpping();
        /*
        此时会报错  接口也是抽象对象  不能被直接实例化
        可以参照多态的方式被实例化
        通过实现类 Cat 来实现接口
        * */

        Jumpping j=new Cat();
        j.Jump();
        /*
        编译看左边   左边有这么一个方法
        执行看右边   右边重写了这么一个方法
        输出  猫可以跳高
        * */


    }
}
