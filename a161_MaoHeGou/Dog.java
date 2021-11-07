package HeiMa.a161_MaoHeGou;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 19:20
 * @Version 1.0
 */

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDoor(){
        System.out.println("狗狗会看门");
    }

}
