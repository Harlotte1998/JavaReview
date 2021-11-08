package HeiMa.a181_jieKouDeChengYuanTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 10:55
 * @Version 1.0
 */

public interface Inter {
    public int num=10;
    public final int num2=20;

//  int num3=999;  等同于下面的写法
    public static final int num3=30;

    /*
    接口中的变量 是一个常量  并且被 static修饰  可以通过接口名直接访问
    * */

//    public Inter(){ }    接口没有构造方法
    /*
    接口主要是对行为进行抽象   所有没有具体存在


    * */

    public abstract void method();

    void show();
    //  默认前面有 public abstract



}
