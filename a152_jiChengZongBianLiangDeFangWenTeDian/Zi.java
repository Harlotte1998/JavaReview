package HeiMa.a152_jiChengZongBianLiangDeFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 17:05
 * @Version 1.0
 */

public class Zi extends Fu {
    //身高
    public int height=175;

    //年龄
    public int age=20;

    public void show(){

        int age=90;

        //可以直接访问父类的  age
        System.out.println(age);
        System.out.println(height);
        //报错
//        System.out.println(weight);
    }
}
