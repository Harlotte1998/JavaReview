package HeiMa.a186_YunDongYuanHeJiaoLianDaiMaShiXian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 15:27
 * @Version 1.0

抽象的运动员类    abstract 用来定义抽象类
 */
public abstract class Player extends Person{
    //无参的构造方法
    public Player() {
    }

    //有参的构造方法
    public Player(String name, int age) {
        super(name, age);
    }

    //抽象的学习类
    public abstract void study();

}
