package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 14:40
 * @Version 1.0



0案例:学生
需求:首先定义一个学生类,然后定义一一个学生测试类,
在学生测试类中通过对象完成成员变量和成员方法的使用
思路:

①定义-个学生类
    类名: Student
        成员变量: name, age
    成员方法:
        study()，doHomework ()
    ②定义学生测试类
        类名: StudentDemo
            因为要做测试，所以有一个主方法: main方法
    ③在学生测试类中通过对象完成成员变量和成员方法的使用
        给成员变量赋值，输出成员变量的值
        调用成员方法

 学生测试类

 */

public class a102_XueShengDemo {
    public static void main(String[] args) {

        //创建对象
        a102_XueSheng  s=new a102_XueSheng();

        //使用对象
        System.out.println("name="+s.name+"   age="+s.age);

        s.name="刘仁宝";
        s.age=18;

        System.out.println("name="+s.name+"   age="+s.age);

        s.study();
        s.doHomework();
    }
}
