package HeiMa.a113_GouZaoFangFaZhuYiShiXiang;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 19:07
 * @Version 1.0

5.2构造方法的注意事项
    ①构造方法的创建
        ●如果没有定义构造方法， 系统将给出一个默认的无参数构造方法
        ●如果定义了构造方法，系统将不再提供默认的构造方法
    ②构造方法的重载
        ●如果自定义了 带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
    ③推荐的使用方式
        无论是否使用，都手工书写无参数构造方法




 */


public class Student {

    private String name;
    private int age;

    //无参的构造方法
/*
    public Student (){
        System.out.println("无参构造方法");
    }

    // 如果在一个类中  不设置构造方法的话   系统会自动设置一个构造方法
*/

    public Student(){
        //无参的构造方法
    }


    //有参的构造方法
    public Student(String name){
        this.name=name;

    }

    //设置了有参的构造方法  如果想在测试类中使用无参的构造方法
    //就需要在类中在设置一个  无参的构造方法
    //一旦设置了有参的构造方法  系统不在默认设置  无参的构造方法



    //有参的构造方法
    public Student(int age){
        this.age=age;
    }

    //完整的构造方法
    public Student(String name , int age){
        this.name=name;
        this.age=age;
    }


    public  void show(){
        System.out.println("name:"+name+" age: "+age);
    }

}