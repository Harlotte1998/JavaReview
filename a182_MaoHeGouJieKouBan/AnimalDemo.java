package HeiMa.a182_MaoHeGouJieKouBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 12:51
 * @Version 1.0

案例: 猫和狗
    需求:对猫和狗进行训练，他们就可以跳高了,这里加入了跳高功能。请采用抽象类和接口来实现猫狗案例，
    并在测试类中进行测试


思路:
    ①定义接口(umpping)
        成员方法:跳高0);
    ②定义抽象动物类(Animal)
        成员变量:姓名，年龄;构造方法:无参,带参;成员方法: get/set方法， 吃饭0;
    ③定义具体猫类(Cat), 继承动物类,实现跳高接口
        构造方法:无参,带参;成员方法:重写吃饭...重写跳高方法0(..}
    ④定义狗类(Dog)，继承动物类，实现跳高接口
        构造方法:无参，带参;成员方法:重写吃饭....重写跳高方法0(..}
    ⑤定义测试类(AnimalDemo), 写代码测试




 */

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象  调用方法
        Jumpping j=new Cat();
        j.jump();
        /*
        借口只能调用接口里面的方法
        * */


        //采用无参的构造方法
        Animal a=new Cat();
        a.setAge(23);
        a.setName("小花");
        System.out.println(a.getAge()+"  "+a.getName());
        a.eat();
//        a.jump();          会报错  因为 编译看左边  执行看右边
//        a 是 Animal  对象  抽象多态只能调用 本身所有的

        ((Cat) a).jump();

        System.out.println("-----------------------");
        //采用带参构造
        a=new Cat("小白",89);
        System.out.println(a.getAge()+"  "+a.getName());
        a.eat();

        System.out.println("-----------------------");
        //以后再实际工作站 还是使用具体的类 来实现
        Cat c=new Cat();
        c.setAge(44);
        c.setName("小CC");
        System.out.println(c.getAge()+"  "+c.getName());
        c.eat();
        c.jump();



    }
}
