package HeiMa.a187_01_LeiMingZuoWeiXingCanHeFanHuiZhi;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/10 18:57
 * @Version 1.0



1.1类名作为形参和返回值
    ●方法的形参是类名，其实需要的是该类的对象
    ●方法的返回值是类名， 其实返回的是该类的对象


 */

public class CatDemo {
    public static void main(String[] args) {
        //类名作为形参
        //创建操作类方法 并调用方法
        CatOperator  co=new CatOperator();
        Cat c=new Cat();

        //co调用这个方法  需要一个形参  传递
        co.useCat(c);

        //类型作为 返回值
        Cat c2=co.getCat();
        //等同于   Cat c2=new Cat();
        c2.eat();



    }




}
