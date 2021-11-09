package HeiMa.a184_ChouXiangLeiHeJieKouDeQuBie;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/8 13:38
 * @Version 1.0

1.5抽象类和接口的区别
●成员区别
    抽象类     变量;常量;有构造方法;有抽象方法,也有非抽象方法
    接口       常量;抽象方法
●关系区别
    类与类         继承，单继承
    类与接口       实现，可以单实现，也可以多实现
    接口与接口     继承，单继承，多继承


门和警报的例子
    门:都有open0和close0两个动作,这个时候，
       我们可以分别使用抽象类和接口来定义这个抽象概念



//抽象类  的做法   定义两个抽象方法
    public abstract class Door{
        public abstract void open();
        public abstract void close();
    }


//接口类  的做法   定义两个抽象方法
    public interface Door{
        void open();
        void close();
    }

//门 这个对象 继承抽象类 实现接口 都可以实现 开关门功能

//    到后期 需要添加一个  报警器功能
public abstract class Door{
    public abstract void open();
    public abstract void close();
    public abstract void alarm();
}

//第一种方案  将这三种功能都放到抽象类中
//    但是  这样所有继承这个抽象类的子类都具备了，报警功能
//    可是有些门不具备报警功能   不用实现报警功能  不应该被实现报警功能


//第二个方案 将这三种功能都放到接口里面
public interface Door{
    void open();
    void close();
    void alarm();
}

//需要实现报警功能的类 就实现这个接口中的方法  但是这个时候 也必须把 open
// close一起实现    也许这个类 根本就不具备  open  close这两个功能
//比如说   火灾报警器  就会有 开关门的功能

//由此可见  这两种设计都不好


open  close 是门特有的方法   而alarm  报警是额外的附加的功能

将报警单独设计成一个接口 open和cloae 放到一个抽象类中
将来我们的报警门 继承我们抽象类的门  并且来实现我们报警接口



在这里，我们再次强调抽象类是对事物的抽象，而接口是对行为的抽象



//报警接口
public interface Alram{
    void alarm();
}

//抽象门类
public abstract class Door{
    public abstract void open();
    public abstract void close();
}

//报警门
public class AlarmDoor extends Door implements Alram{
    public void open(){

    }

    public void close(){

    }

    public void alarm(){

    }
}






public class Demo {

}
 * */
