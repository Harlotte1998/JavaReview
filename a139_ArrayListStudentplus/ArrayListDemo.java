package HeiMa.a139_ArrayListStudentplus;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 17:28
 * @Version 1.0
 *
 * 0案例: 存储学生对象并遍历
 * 需求:创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 * 学生的姓名和年龄来自于键盘录入
 * 思路:
 * ①定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为String类型
 * ②创建集合对象
 * ③键盘录入学生对象所需要的数据
 * ④创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
 * ⑤往集合中添加学生对象
 * ⑥遍历集合，采用通用遍历格式实现
 */

public class ArrayListDemo {
    public static void main(String[] args) {
        //②创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();


        //添加三个对象
        addStudent(array);
        addStudent(array);
        addStudent(array);


        //⑥遍历集合，采用通用遍历格式实现
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());

        }

/*

            //③键盘录入学生对象所需要的数据
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入学生姓名");
            String name=sc.nextLine();

            System.out.println("请输入学生年龄");
            String age=sc.nextLine();


            //④创建学生对象，把键盘录入的数据赋值给学生对象的成员变量


            Student s=new Student();
            s.setAge(name);
            s.setName(name);
            //⑤往集合中添加学生对象
            array.add(s);

           //这只是往集合中 添加了一个学生对象

           //如果想添加三个对象  就需要重复三次这个程序
           //或者 做一个 for 循环
           //⑥遍历集合，采用通用遍历格式实现


*/

    }


    //为了提高代码的复用性
    //用方法来改进程序
    /*
     * 两个明确
     *   返回值    无   void
     *   参数      ArrayList<Student> array
     *   这个方法的 参数值 是一个 集合   为引用类型  引用类型改变后
     *   原来的值也会改变
     *
     * */

    public static void addStudent(ArrayList<Student> array) {
        //③键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();


        //④创建学生对象，把键盘录入的数据赋值给学生对象的成员变量


        Student s = new Student();
        s.setAge(age);
        s.setName(name);
        //⑤往集合中添加学生对象
        array.add(s);

        //这只是往集合中 添加了一个学生对象

        //如果想添加三个对象  就需要重复三次这个程序
        //或者 做一个 for 循环
        //⑥遍历集合，采用通用遍历格式实现
    }

}
