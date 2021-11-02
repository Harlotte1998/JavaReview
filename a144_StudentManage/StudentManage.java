package HeiMa.a144_StudentManage;

import HeiMa.a140_StudentManage.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/1 14:05
 * @Version 1.0
 */

public class StudentManage {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<HeiMa.a140_StudentManage.Student> array = new ArrayList<>();

        //④用循环完成再次回到主界面

        while (true) {


            //①用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理相同---------");
            System.out.println("|   1.添加学生                     |");
            System.out.println("|   2.删除学生                     |");
            System.out.println("|   3.修改学生                     |");
            System.out.println("|   4.查看所有学生                 |");
            System.out.println("|   5.退出                        |");
            System.out.println("请输入你的选择: ");

            //②用Scanner实现键盘录入数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //③用switch语句完成操作的选择
            switch (line) {
                case "1":
//                    System.out.println("1.添加学生");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("2.删除学生");
                    break;
                case "3":
                    System.out.println("3.修改学生");
                    break;
                case "4":
                    showStudent(array);
                    break;
                case "5":
                    System.out.println("你已退出系统 谢谢使用");
                    //break;
                    // break  只是 结束 swith 循环  并不能退出系统
                    System.exit(0);  //JVM  java虚拟机退出
                    //结束 while 循环


            }
        }
    }

    /*定义一个方法，用于添加学生信息
    两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  arr
 */
    public static void addStudent(ArrayList<Student> array) {
        //②键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();


        //③创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        HeiMa.a140_StudentManage.Student stu = new Student();
        stu.setAddress(address);
        stu.setAge(age);
        stu.setName(name);
        stu.setSid(sid);


        //④将学生对象添加到集合中(保存)
        array.add(stu);

        //⑤给出添加成功提示
        System.out.println("添加学生成功");


    }


    /*定义一个方法，用于添加学生信息
     两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  array                  */
    public static void showStudent(ArrayList<Student> array) {
        System.out.println("学号\t 姓名\t 年龄 \t 居住地");

        for (int i = 0; i < array.size(); i++) {
            //遍历集合   集合里面装了很多学生类
            //
            //创建一个  学生类对象  来承接  由集合 取出的学生类
            Student stu = array.get(i);
            //使用get方法 取出每个学生对象里面的 数据
            String sid = stu.getSid();
            String name = stu.getName();
            String age = stu.getAge();
            String address = stu.getAddress();


            System.out.println(sid + " \t " + name + " \t " + age + " \t " + address);

        }


    }

/*
    思路
①用键盘录入选择查看所有学生信息
②定义-一个方法，用于查看学生信息
①显示表头信息
②将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁"
③调用方法
*/


}























