package HeiMa.a187_02_ChouXiangLeiMingZuoWeiXingCanHeFanHuiZhi;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/10 19:28
 * @Version 1.0

1.2抽象类名作为形参和返回值
    ●方法的形参是抽象类名, 其实需要的是该抽象类的子类对象
    ●方法的返回值是抽象类名， 其实返回的是该抽象类的子类对象


 */
public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象 并调用对象
        AnimalOperator ao=new AnimalOperator();
        Animal a=new Cat();
        ao.useAnimal(a);


        //抽象类名作为返回值
        Animal a2=ao.getAnimal();// 相当于 new Cat()
        a2.eat();
    }
}
