package HeiMa.a155_JiChengZhongChengYuanFangFaDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:55
 * @Version 1.0

1.6继承中成员方法的访问特点



 */

public class Zi extends Fu{
    public void ZiMethod(){
        //在 Zi类中  使用 super  访问的是 父类的成员方法
        super.FuMethod();
        System.out.println("Zi 中 ZiMethod  方法被调用");
    }

    //把父类中的 成员方法 复制一份 到 子类中   此时 在Demo中
    // 调用 z.ZiMethod();   此时显示的是  子类中的  成员方法
    public void FuMethod(){
        System.out.println("Fu 中 FuMethod  方法被调用");
    }



}
