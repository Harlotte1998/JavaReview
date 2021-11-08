package HeiMa.a177_ChouXiangLeiDeChengYuanTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 19:38
 * @Version 1.0
 */

//测试 抽象类里面可以包含哪些成员
public abstract class Animal {
    private int age=20;
    private final String city="北京";


    //抽象类可以有构造方法
    /*
    抽象类不能实例化
    指的是 抽象类 不能直接实例化
    但是可以通过多态的方式来实例化
    构造方法的作用是  用于子类 访问父类数据的初始化
    在子类构造方法中来访问父类的构造方法   用于对数据的初始化
    * */
    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }




    //在抽象类中  可以有非抽象方法     作用是提高代码的复用性  由继承来保证
    public void show(){
        age=40;
//        city="上海";      这是一个常量不能赋值
        System.out.println(age);
        System.out.println(city);
    }


    public abstract void eat();
    /*
    限定子类 必须去重写这个方法
    否则子类会报错
    * */


}
