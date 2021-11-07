package HeiMa.a161_MaoHeGou;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 19:20
 * @Version 1.0
 */

public class Cat extends Animal{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catMouth(){
        System.out.println("猫会捉老鼠");
    }


}
