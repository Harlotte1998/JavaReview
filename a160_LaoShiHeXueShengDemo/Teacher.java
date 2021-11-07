package HeiMa.a160_LaoShiHeXueShengDemo;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 18:24
 * @Version 1.0
 */

public class Teacher extends Person{


    //当测试类使用 带参的构造方法时  Teacher 没有 带参的构造方法
    //需要自己创建一个 带参的构造方法   继承可以继承方法  但是不能继承构造方法
    public Teacher(String name,int age){
//        this.name=name;
//        this.age=age;       此时会报错   应该使用 super

        super(name, age);
    }

    //创建了带参的构造方法以后  系统默认的  无参构造方法 就会消失
    //需要自己手动建一个  无参构造方法
    public Teacher(){

    }




    public void teach(){
        System.out.println("老师类的方法");
    }
}
