package HeiMa.a178_MaoHeGouChouXiangBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 20:05
 * @Version 1.0


案例:猫和狗
需求:请采用抽象类的思想实现猫和狗的案例，并在测试类中进行测试
    思路:
        ①定义动物类(Animal)
            成员变量:姓名,年龄
            构造方法:无参，带参
            成员方法: get/set方法， 吃饭);
        ②定义猫类(Cat), 继承动物类
            构造方法:无参，带参
            成员方法:重写吃饭0...
        ③定义狗类(Dog), 继承动物类
            构造方法:无参，带参
            成员方法:重写吃饭0..
        ④定义测试类(AnimalDemo),写代码测试



 */

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象  按照多态的方式   无参的构造方法
        Animal a=new Cat();
        a.setAge(89);
        a.setName("AAAAA");
        System.out.println("age  "+a.getAge()+" , "+" name  "+a.getName());
        a.eat();


    }
}
