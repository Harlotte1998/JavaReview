package HeiMa.a191_JubuNeiBuLei;


/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:23
 * @Version 1.0


1.3局部内部类
    局部内部类是在方法中定义的类，
    所以外界是无法直接使用，
    需要在方法内部创建对象并使用
    该类可以直接访问外部类的成员，
    也可以访问方法内的局部变量





 */

public class OuterDemo {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();
    }
}
