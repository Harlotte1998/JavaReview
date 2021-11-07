package HeiMa.a161_MaoHeGou;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 19:21
 * @Version 1.0







 */

public class AnimalDemo {
    public static void main(String[] args) {

        //  创建猫类对象  并进行测试    使用无参的构造方法
        Cat c1=new Cat();
        c1.setName("小花");
        c1.setAge(8);
        System.out.println(c1.getAge()+"---"+c1.getName());
        c1.catMouth();

        //  创建猫类对象  并进行测试    使用带参的构造方法
        Cat c2=new Cat("小白",9);
        System.out.println(c2.getAge()+"---"+c2.getName());
        c2.catMouth();
    }



}
