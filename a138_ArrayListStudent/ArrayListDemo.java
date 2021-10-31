package HeiMa.a138_ArrayListStudent;

import java.util.ArrayList;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 17:28
 * @Version 1.0

案例: 存储学生对象并遍历
需求:创建一个存储学生对象的集合,存储3个学生对象，
    使用程序实现在控制台遍历该集合

思路:
    ①定义学生类
    ②创建集合对象
    ③创建学生对象
    ④添加学生对象到集合中
    ⑤遍历集合，采用通用遍历格式实现

 */

public class ArrayListDemo {
    public static void main(String[] args) {
        //②创建集合对象
        ArrayList<Student> array=new ArrayList<>();

        //③创建学生对象

        /*
        * 两张方法
        * 1.无参加上 set 方法
        * 2.带参
        *
        * 给学生对象赋值
        * 这里使用 带参的方式
         * */
        Student s1=new Student("刘仁宝",89);
        Student s2=new Student("李鸿运",18);
        Student s3=new Student("阿巴艾",78);

        //④添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);


        //⑤遍历集合，采用通用遍历格式实现
        for (int i = 0; i <array.size() ; i++) {
            Student student = array.get(i);
            System.out.println(student.getName()+","+ student.getAge());

        }

    }
}
