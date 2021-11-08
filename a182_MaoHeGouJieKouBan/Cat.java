package HeiMa.a182_MaoHeGouJieKouBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 12:51
 * @Version 1.0

继承自 Animal   实现跳高方法
 */
public class Cat extends Animal implements Jumpping{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump(){
        System.out.println("猫可以跳高");
    }
}
