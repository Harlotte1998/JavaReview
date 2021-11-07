package HeiMa.a167_static;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 12:03
 * @Version 1.0


3.6 static
    static关键字是静态的意思，可以修饰成员方法，成员变量


    static修饰的特点
    ●被类的所有对象共享
        这也是我们判断是否使用静态关键字的条件
    ●可以通过类名调用
        当然，也可以通过对象名调用
        推荐使用类名调用



 */

public class staticDemo {
    public static void main(String[] args) {


        Student.university="北大";

        Student s1=new Student();
        s1.name="仁宝";
        s1.age=20;
//        s1.university="北大";
        s1.show();


        Student s2=new Student();
        s2.name="鸿运";
        s2.age=89;
//        s2.university="北大";
        s2.show();


        //他们都是  来自同一个大学
        // 能不能给其中一个university赋值  其他人就不用了再赋值了
        //  public static String university;







    }
}
