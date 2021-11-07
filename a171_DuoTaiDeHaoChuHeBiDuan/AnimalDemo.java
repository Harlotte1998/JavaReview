package HeiMa.a171_DuoTaiDeHaoChuHeBiDuan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/6 21:52
 * @Version 1.0


1.3多态的好处和弊端
    ●多态的好处: 提高了程序的打展性
        具体体现:定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
    ●多态的弊端: 不能使用子类的特有功能






 */

public class AnimalDemo {
    public static void main(String[] args) {


        //创建动物操作类的对象  调用方法
        AnimalOperator ao=new AnimalOperator();
        //创建猫类型的变量
        Cat c=new Cat();         //C就相当于 new Cat();
        ao.useAnimal(c);


        Dog d=new Dog();
        ao.useAnimal(d);

        Pig p=new Pig();
        ao.useAnimal(p);



    }
}
