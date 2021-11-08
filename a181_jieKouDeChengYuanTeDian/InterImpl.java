package HeiMa.a181_jieKouDeChengYuanTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 10:56
 * @Version 1.0

接口的实现类    接口的实现类  一般会在接口名后面加一个 Impl

 */


    /*

public class InterImpl implements Inter{
    public Inter(){
        super();
    }

    接口中没有构造方法，但是接口类中有super super是调用 父类的构造方法
    那super  是调用的哪里的构造方法？？

    类object是类层次结构的根。每个类都有object作为超类。
    所有对象(包括数组)都实现了这个类的方法。
    所有类都直接或者是间接继承 objecj类
    如果一个类 没有父类    object  就是他的父类
    如果一个类 有父类   就会间接继承 object
    object只有一个构造方法  而且是无参的
}
    * */
//  public class InterImpl implements Inter
//上面的等同于  下面的
public class InterImpl extends Object implements Inter{
    public void Inter(){
//        super();

        /*
        调用的是  Object里面的  构造方法
        * */
    }

    @Override
    public void method(){
        System.out.println("method");
    }

    @Override
    public void show(){
        System.out.println("show");
    }



}


