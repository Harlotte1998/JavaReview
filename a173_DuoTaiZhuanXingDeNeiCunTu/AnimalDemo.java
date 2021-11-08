package HeiMa.a173_DuoTaiZhuanXingDeNeiCunTu;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/7 16:13
 * @Version 1.0



 */

public class AnimalDemo {
    public static void main(String[] args) {
    /*
    程序从 main 方法 执行 main方法加载到 栈内存
    * */

        //向上转型
        Animal a=new Cat();
        /*堆内存开辟出一个空间   地址是  001
        Animal a  从main 方法中出现
        Cat 继承了  Animal  所以堆内存地址值  animal a
        * */
        a.eat();
        /*编译看左边  运行看右边
        在执行中 看 Cat 中的方法   Cat 中的eat 方法被执行
        Cat  中的eat 方法 被加载至栈内存
        然后开始执行 eat方法  输出   猫咪吃食物
        这个方法调用完毕 从 栈内存 消失
        * */
        //向下转型
        Cat c=(Cat)a;
        /*
        原来在main 中 存在的  Animal 创建的 a
        这个a通过地址 001  指向 堆内存 中的   New Cat
        这个转换是可以进行的  把这个地址 001  也给了 Cat  c
        接下来通过 c 来调用  cat   和 playGame方法
        此时的c还是 Cat   中的地址 所以调用的还是 Cat中的方法
        输出  猫吃食物
              猫捉迷藏
        * */
        c.eat();
        c.playGame();
        //向上转型
        a=new Dog();
        /*
        new Dog();   Dog也继承了 Animal    animal里面有一个 eat
        Dog里面也重写了 eat   此时在堆内存会出现一个 new Dog()
        地址是 002   因为他继承了 Animal   所以他也是可以赋值给 a的
        也是多态的形式  可以向上转型   这时 将a的地址 改为了 002

        * */

        a.eat();
        /*编译看左边  运行看右边
        这时 右边是 Dog()
        在执行中 看 Dog 中的方法   Dog 中的eat 方法被执行
        Dog  中的eat 方法 被加载至栈内存
        执行  在控制台输出  小狗吃食物
        这个方法调用完毕 从 栈内存 消失
        * */
        //向下转型
        //ClassCastException  类型转换异常
        Cat cc=(Cat)a;
        /* 这个地方会报错

        Cat cc  出现在 栈内存中
        这里的a 通过002  指向 堆内存中的 newDog
        虽然 猫 和 狗 都继承自  动物  但是 猫和狗 是不等价的
        是不能相互转换的    Cat cc=(Cat)a;  会报错
        强制执行 会在控制台输出    ClassCastException  类型转换异常
        * */
        cc.eat();
        cc.playGame();
    }
}
