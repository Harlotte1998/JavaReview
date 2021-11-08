package HeiMa.a174_MaoHeGouDuoTaiBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 17:02
 * @Version 1.0


①定义动物类(Animal)
    成员变量:姓名,年龄
    构造方法:无参，带参
    成员方法: get/set方法, 吃饭()


 */

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void eat(){
        System.out.println("动物吃饭");
    }

}
