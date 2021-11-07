package HeiMa.a152_jiChengZongBianLiangDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 16:56
 * @Version 1.0


1.3继承中变量的访问特点

在子类方法中访问一个变量
●子类局部范围找   方法的内部寻找
●子类成员范围找
●父类成员范围找
●如果都没有就报错(不考虑父亲的父亲..)



 */

public class Demo {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.show();
    }
}
