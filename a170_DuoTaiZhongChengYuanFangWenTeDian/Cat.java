package HeiMa.a170_DuoTaiZhongChengYuanFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 16:50
 * @Version 1.0
 */

public class Cat extends Animal{     //●有继承/实现关系

    public int age=99;
    public int weight=98;

    @Override            //重写了动物类中的 eat方法
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }

}
