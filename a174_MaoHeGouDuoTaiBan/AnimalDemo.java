package HeiMa.a174_MaoHeGouDuoTaiBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 17:02
 * @Version 1.0


案例:猫和狗
需求:请采用多态的思想实现猫和狗的案例，并在测试类中进行测试
思路:
①定义动物类(Animal)
    成员变量:姓名,年龄
    构造方法:无参，带参
    成员方法: get/set方法, 吃饭()
②定义猫类(Cat), 继承动物类
    构造方法:无参，带参
    成员方法:重写吃饭()
③定义狗类(Dog),继承动物类
    构造方法:无参,带参
    成员方法:重写吃饭()
④定义测试类(AnimalDemo), 写代码测试


 */

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象 进行测试        使用多态的方式   无参的构造方法
        Animal a=new Cat();
        a.setAge(2);
        a.setName("花猫01");
        System.out.println(a.getAge()+" , "+a.getName());
        a.eat();

        //使用带参的构造方法
        a=new Cat("花猫02" , 5);

        System.out.println(a.getAge()+" , "+a.getName());
        a.eat();


        //创建狗类对象 进行测试        使用多态的方式   无参的构造方法
        Animal d=new Dog();
        d.setName("小花狗01");
        d.setAge(9);
        System.out.println();
        System.out.println(d.getAge()+" , "+d.getName());
        d.eat();





    }
}

