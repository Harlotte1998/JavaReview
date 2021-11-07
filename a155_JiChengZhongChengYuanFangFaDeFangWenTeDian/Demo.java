package HeiMa.a155_JiChengZhongChengYuanFangFaDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:55
 * @Version 1.0



1.6继承中成员方法的访问特点
    通过子类对象访问一个方法
        ●子类成员范围找
        ●父类成员范围找
        如果都没有就报错(不考虑父亲的父亲..)


 */

public class Demo {

    public static void main(String[] args) {
        //创建对象，调用方法
        Zi z=new Zi();

        //子中的方法被调用
        z.ZiMethod();
        //父中的方法被调用
        z.FuMethod();


    }

}
