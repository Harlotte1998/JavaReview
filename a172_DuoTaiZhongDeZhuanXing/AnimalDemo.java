package HeiMa.a172_DuoTaiZhongDeZhuanXing;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 15:47
 * @Version 1.0


1.4多态中的转型
    ●向上转型
        从子到父
        父类引用指向子类对象
    ●向下转型
        从父到子
        父类引用转为子类对象

    解决了 多态不能访问子类特有对象的 问题

 */

public class AnimalDemo {
    public static void main(String[] args) {
        //按照多态的方式 创建一个对象
        Animal a=new Cat();
        /*
         Animal a 是父类引用     new Cat();是创建子类对象
         父类引用指向  子类对象
         把子类对象 赋值给 父类引用  这就是
        ●向上转型

        * */

        a.eat();
        /*
        多态中访问成员方法
        编译看左边  运行看右边
        左边 Animal 中 有 cat方法     编译通过
        右边 Cat  中 重写这个方法  所以  输出  猫吃鱼
        * */
//        a.playGame();
        /*调用 Cat中 特有的 方法  会报错
        因为  编译看左边  运行看右边
        左边 Animal 中没有这个方法

        使用特殊方法的办法
        //创建 Cat 类的对象

        Cat c=new Cat();
        c.eat();
        c.playGame();


        现在在内存中  有两个  猫的对象
        为了调用一个 特有方法  没有必要创建两个对象  浪费内存


        ●向下转型
            从父到子
            父类引用转为子类对象

            a  就是 父类引用
            (Cat)a;    将a强制转换为 Cat类型
            Cat c=(Cat)a;   然后再赋值给  Cat  c
        * */

        Cat c=new Cat();

        c.eat();
        c.playGame();





    }
}
