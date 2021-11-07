package HeiMa.a168_staticFangWenTeDian;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 16:24
 * @Version 1.0


3.7 static访问特点
    非静态的成员方法
        ●能访问静态的成员变量
        ●能访问非静态的成员变量
        ●能访问静态的成员方法
        ●能访问非静态的成员方法
    静态的成员方法
        ●能访问静态的成员变量
        ●能访问静态的成员方法
    总结成一句话就是:静态成员方法只能访问静态成员




 */

public class Student {
    //非静态成员变量
    private String name="非静态成员变量";
    //静态成员变量
    private static String university="静态成员变量";

    //非静态成员方法
    public void show1(){

    }

    //非静态成员方法
    public void show2(){
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();

        //非静态成员方法  可以访问我们所有的静态和非静态成员方法 成员变量

    }

    //静态成员方法
    public static void show3(){

    }

    //静态成员方法
    public static void show4(){
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();

        //静态成员方法  只能访问我们静态的成员方法   成员变量

    }
}
