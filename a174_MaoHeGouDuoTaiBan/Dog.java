package HeiMa.a174_MaoHeGouDuoTaiBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 17:02
 * @Version 1.0


③定义狗类(Dog),继承动物类
构造方法:无参,带参
成员方法:重写吃饭()
 */

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("狗吃骨头");
    }


}
