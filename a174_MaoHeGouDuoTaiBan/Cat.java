package HeiMa.a174_MaoHeGouDuoTaiBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 17:02
 * @Version 1.0


②定义猫类(Cat), 继承动物类
构造方法:无参，带参
成员方法:重写吃饭()


 */

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

}
