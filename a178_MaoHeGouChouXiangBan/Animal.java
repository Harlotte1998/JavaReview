package HeiMa.a178_MaoHeGouChouXiangBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 20:05
 * @Version 1.0
 */

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //抽象方法
    public abstract void eat();
}
