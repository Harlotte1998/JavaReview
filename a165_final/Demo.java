package HeiMa.a165_final;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 11:33
 * @Version 1.0

3.3状态修饰符
    ●final(最终态)
    ●static(静态)

3.4final
    final关键字是最终的意思，可以修饰成员方法，成员变量，类


    final修饰的特点
        ●修饰方法: 表明该方法是最终方法，不能被重写
        ●修饰变量: 表明该变量是常量，不能再次被赋值
        ●修饰类:表明该类是最终类，不能被继承



 */

public class Demo {
    public static void main(String[] args) {
        Zi z=new Zi();
//        z.mether();          // Zi  method
        //  当 Fu 中 添加状态修饰符 final  时 子类已经不能重写 Fu类的mether
        //方法了  被注释掉了  在这里再次调用mether方法  会显示  Fu mether
//        z.mether();          // Fu method

        z.show();

    }
}
