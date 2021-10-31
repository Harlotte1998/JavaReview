package HeiMa.a107_private;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 15:50
 * @Version 1.0

4.1 private关键字



是一个权限修饰符

可以修饰成员(成员变量和成员方法)

作用:是保护成员不被别的类使用，被private修饰的成员只在本类中才 能访问

针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
    提供"get变量名()"方法，用于获取成员变量的值，方法用public修饰
    提供 "set变量名(参数)”方法，用于设置成员变量的值,方法用public修饰


 */

public class StudentDemo {

    public static void main(String[] args) {
        //创建对象
        Student a=new Student();

        //给成员变量赋值
        a.name="刘仁宝";
//        a.age=30;
        //通过对象名直接访问成员变量存在数据隐患
//        a.age(-30);

        a.setAge(30);
//        a.setAge(-30);



        //调用show方法
        a.show();










    }



}
