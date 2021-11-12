package HeiMa.a193_NiMingNeiBuLeiZaiKaiFaZhongDeShiYong;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:41
 * @Version 1.0
 */

public class JumppingDemo {
    public static void main(String[] args) {
        //需求 创建接口操作类的对象  调用 method方法
        JumppingOperaton jo=new JumppingOperaton();
        Jumpping j=new Cat();
        jo.method(j);

        Jumpping j2=new Dog();
        jo.method(j2);


        System.out.println("-----------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高");
            }
        });

    }
}
