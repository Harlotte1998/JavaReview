package HeiMa.a178_MaoHeGouChouXiangBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 20:04
 * @Version 1.0
 */

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }



}
