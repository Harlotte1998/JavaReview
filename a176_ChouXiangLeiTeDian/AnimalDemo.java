package HeiMa.a176_ChouXiangLeiTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 19:11
 * @Version 1.0



1.2抽象类的特点
    ●抽象类和抽象方法必须使用 abstract关键字修饰
        public abstract class类名{}
        public abstract void eat0;
    ●抽象类中不一定有抽象方法，有抽象方法的类-定是抽象类
    ●抽象类不能实例化
        抽象类如何实例化呢?参照多态的方式，通过子类对象实例化,这叫抽象类多态
    ●抽象类的子类
        要么重写抽象类中的所有抽象方法
        要么是抽象类




 */



public  class AnimalDemo {
    public static void main(String[] args) {
        //把Animal变为抽象类 后 new Animal();  开始报错
        //既然是抽象类 就不能创建具体的对象
        //Animal a=new Animal();
        //下面开始  开始访问 抽象类内部普通方法的
        //解决 抽象类如何创建对象
        //抽象类参照多态 的方式   创建对象   需要一个子类
        Animal a=new Cat();
        a.eat();
        /*
        eat 方法 在animal 中虽然是 抽象方法  但是在Cat中 被重写
        编译看左边  执行看右边
        左边在 Animal中有方法
        右边在 Cat中 方法被重写  有具体的意义
        所以能在控制台输出  吃东西

        sleep 方法
        编译看左边  执行看右边
        左边在Animal 有  右边虽然没有被重写   但是左边是有带有方法体
        会被继承过去


        抽象类的特点   虽然不能被直接实例化  但是  他可以参照多态的方式
        通过子类对象来实例化
        * */
        a.sleep();
    }
}
