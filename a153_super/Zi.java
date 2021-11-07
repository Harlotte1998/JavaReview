package HeiMa.a153_super;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:29
 * @Version 1.0


1.4 super

    super关键字的用法和this关键字的用法相似
    ●this: 代表本类对象的引用
    ●super:代表父类存储空间的标识(可以理解为父类对象引用)

                this关键字指向调用该方法的对象
                -般我们是在当前类中使用this关键字，
                所以我们常说this代表本类对象的引用

关键字
访问成员变量
访问构造方法
访问成员方法
this    this.成员变量       this(..)            this.成员方法(..)
        访问本类成员变量    访问本类构造方法    访问本类成员方法
super   super.成员变量      super(.)         super.成员方法(..).
        访问父类成员变量    访问父类构造方法    访问父类成员方法




 */

public class Zi extends Fu {
    public int age=30;

    public void show(){
        int age=20;

        //这里是 方法内的  成员变量
        System.out.println(age);
        //我需要访问 本类的 成员变量 age  而不是 show这个方法内的 成员变量
        System.out.println(this.age);

        //我需要访问 父类的 成员变量 age
        System.out.println(super.age);
    }


}
