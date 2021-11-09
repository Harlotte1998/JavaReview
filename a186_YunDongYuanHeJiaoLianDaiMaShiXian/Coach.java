package HeiMa.a186_YunDongYuanHeJiaoLianDaiMaShiXian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 15:27
 * @Version 1.0

抽象教练类  继承自 人类
 */
public class Coach extends Person{
    //无参构造
    public Coach() {
    }

    //带参构造
    public Coach(String name, int age) {
        super(name, age);
    }


    //抽象的  教学  方法
    public abstract void teach();
}
