package HeiMa.a192_NiMingNeiBuLei;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:28
 * @Version 1.0



前提:
    存在一个类或者接口
    这里的类可以是具体类也可以是抽象类

格式:
    new  类名或者接口名(){
        重写方法;
    };
本质是什么呢?
    是一个继承了该类或者实现了该接口的子类匿名对象


 */

public class Outer {
    public void method(){

/*
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        //调用两次

        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

*/
        //多次调用   采用多态的方法

        Inter i=new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };


        i.show();
        i.show();
        i.show();
        i.show();
        i.show();
    }
}
