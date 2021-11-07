package HeiMa.a154_JiChengZhongGouZaoFangFaDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:39
 * @Version 1.0


1.5继承中构造方法的访问特点
    子类中所有的构造方法默认都会访问父类中无参的构造方法

    为什么呢?
        ●因为子类会继承父类中的数据，可能还会使用父类的数据。
            所以，子类初始化之前，-定要先完成父类数据的初始化
            访问父类的构造方法，其实就是为了 完成父类数据的初始化
        ●每一个子类构造方法的第一条语句默认都是: super()

    如果父类中没有无参构造方法，只有带参构造方法，该怎么办呢?
        ●通过使用super关键字去显示的调用父类的带参构造方法
        ●在父类中自己提供- 个无参构造方法

        推荐:自己给出无参构造方法


 */

public class Demo {
    public static void main(String[] args) {
        //创建对象  采用无参的构造方法
        Zi z=new Zi();

        //采用带参构造方法 创建对象
        Zi z2=new Zi(20);


    }
}
