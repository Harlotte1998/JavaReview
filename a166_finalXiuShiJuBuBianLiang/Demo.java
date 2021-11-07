package HeiMa.a166_finalXiuShiJuBuBianLiang;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 11:47
 * @Version 1.0


3.5 final|修饰局部变量
    ●变量是基本类型: final 修饰指的是基本类型的数据值不能发生改变
    ●变量是引用类型: final 修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容是可以发生改变的



 */

public class Demo {
    public static void main(String[] args) {
        //final修饰基本类型变量
        int age=20;
        age=100;
        System.out.println("age");

        final int ages=20;
//        age=100;
        System.out.println("ages");


        //final修饰引用类型变量
        final Student s=new Student();
        s.age=111;
        System.out.println(s.age);
        /*
        * final Student s=new Student();
        * final  修饰Student  新建的 Student 对象 S值不能变
        * age 是S里面的内容
        *
        *
        * */

//        s=new Student();


    }
}
