package HeiMa.a178_MaoHeGouChouXiangBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 20:04
 * @Version 1.0
 */

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }



}
