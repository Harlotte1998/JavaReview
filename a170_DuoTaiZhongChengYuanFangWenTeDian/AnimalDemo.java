package HeiMa.a170_DuoTaiZhongChengYuanFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 16:50
 * @Version 1.0



1.2多态中成员访问特点
    成员变量:编译看左边，执行看左边
    成员方法:编译看左边，执行看右边

    为什么成员变量和成员方法的访问不一样呢?
    ●因为成员方法有重写， 而成员变量没有






 */

public class AnimalDemo {
    public static void main(String[] args) {
        //●有父类引用指向子类对象
        Animal a=new Cat();

        //成员变量
        System.out.println(a.age);
//        System.out.println(a.weight);
        /*
        * 此时会报错

        * */


        //成员方法
        a.eat();
//        a.playGame();


    }
}
