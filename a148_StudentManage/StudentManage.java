package HeiMa.a148_StudentManage;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 11:50
 * @Version 1.0



 */


public class StudentManage {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<>();

        //④用循环完成再次回到主界面

        while (true) {


            //①用输出语句完成主界面的编写

            System.out.println("\t");
            System.out.println("\t");
            System.out.println("--------欢迎来到学生管理相同---------");
            System.out.println("|   1.添加学生                     |");
            System.out.println("|   2.删除学生                     |");
            System.out.println("|   3.修改学生                     |");
            System.out.println("|   4.查看所有学生                 |");
            System.out.println("|   5.退出                        |");
            System.out.println("------------------------------------");

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
                    deleteStudent(array);
//                    System.out.println("2.删除学生");
                    break;
                case "3":
                    updataStudent(array);
//                    System.out.println("3.修改学生");
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




    public static void addStudent(ArrayList<Student> array) {

            /*定义一个方法，用于添加学生信息
    两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  arr   */



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
        Student stu = new Student();
        stu.setAddress(address);
        stu.setAge(age);
        stu.setName(name);
        stu.setSid(sid);


        //④将学生对象添加到集合中(保存)
        array.add(stu);

        //⑤给出添加成功提示
        System.out.println("添加学生成功");


    }



    public static void showStudent(ArrayList<Student> array) {
    /*定义一个方法，用于查看学生信息
     两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  array                  */


        //判断集合中是否有数据  如果没有则显示  提示信息
        if (array.size()==0){
            System.out.println("无信息 请先添加信息");

            //为了让程序不再往下执行
            return;


        }

        //表头
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



    public static void deleteStudent( ArrayList<Student>array){
        /*定义一个方法，用于删除学生信息
     两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  array                  */

/*

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除学生的学号");
        String del=sc.nextLine();
        Student stu =new Student();

        for (int i = 0; i <array.size() ; i++) {


            String sid=array.get(i);

            if (del==sid){
                array.remove(i);
                System.out.println("删除成功");

                return;
            }
    1.10解决删除/修改学生学号不存在问题

        思路
            ①在删除/修改学生操作前，对学号是否存在进行判断
            ①如果不存在，显示提示信息
            ②如果存在,执行删除/修改操作

*/
/*
    //第一种删除方法 没有解决 学号存不存在的问题
        //键盘录入要删除的学生学号
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入要删除学生的学号");
        String del=sc.nextLine();
        //遍历集合将对应的学生对象从集合中删除
        for (int i = 0; i <array.size() ; i++) {

            //创建一个 学生类对象 sid 接收 从数组中读出的 学生对象 元素
            Student stu=array.get(i);

            //因为 del 和 stu.getSid 获取的都是 String 类型
            // 所以 使用 equals方法  而不是使用 ==
            if (stu.getSid().equals(del)){
                //stu.gatSid()  获取  学生对象  中的sid 属性

                array.remove(i);
                //结束循环
                break;
            }
        }
        //给出删除成功的提示
        System.out.println("删除成功");

       */

    //第二种删除方法  增加了检测学号 存不存在的  功能

        //键盘录入要删除的学生学号 ，显示 提示信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号");
        String sid=sc.nextLine();
        //在删除  修改学生信息前  对学号是否存在 进行判断

        //先定义一个索引   这个索引值不可能是 -1
        int index=-1;

        //遍历数组  找出在集合中 与 输入学号相同的 学生元素
        //  第几个学生元素   就是第几个  集合 索引值
        for (int i = 0; i <array.size() ; i++) {
            Student stu=array.get(i);

            if (stu.getSid().equals(sid)){
                index=i;
                break;
            }
        }

        //如果索引值 为 -1  则 经过遍历 没有找到相同的数据
        if (index==-1){
            System.out.println("该信息不存在 请重新输入");
        }else {
            System.out.println("删除学生成功");
        }

        //如果不存在，显示提示信息
        //如果存在，执行删除  修改操作

        //给出删除成功提示






    }


    public static void updataStudent(ArrayList<Student> array) {
    /*定义一个方法，用于修改学生信息
     两个明确
        返回值    因为是 集合是引用型  没有返回值 void
        参数      ArrayList<Student>  array

    1.9修改学生的代码编写
        思路
        ①用键盘录入选择修改学生信息
        ②定义一个方法，用于修改学生信息
            ①显示提示信息
            ②键盘录入要修改的学生学号
            ③键盘录入要修改的学生信息
            ④遍历集合修改对应的学生信息
            ⑤给出修改成功提示
        ③调用方法
         */

/*

        System.out.println("请输入要修改学生的学号");
        Scanner sc = new Scanner(System.in);

        String upsid=sc.nextLine();


        for (int i = 0; i <array.size() ; i++) {
            //循环取出学生对象
            Student stu=array.get(i);

            if (stu.getSid().equals(upsid)){

                //②键盘录入学生对象所需要的数据
                System.out.println("请输入要修的学生信息");


                System.out.println("请输入学生姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生居住地：");
                String address = sc.nextLine();


                stu.setAddress(address);
                stu.setAge(age);
                stu.setName(name);
            }
            System.out.println("修改学生成功");
        }

        */

        //第二种写法    这是先把新的学生信息存储到一个新的 对象里面  然后再把对象加入到集合里面

        //键盘录入要修改的学生学号  显示提示信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid=sc.nextLine();

        //键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生新地址");
        String address=sc.nextLine();

        //创建一个 新的 学生对象  用来临时存储 数据  最后添加进 数组里面
        Student upstu=new Student();
        upstu.setSid(sid);
        upstu.setName(name);
        upstu.setAge(age);
        upstu.setAddress(address);

        //遍历集合  修改对应的学生信息
        for (int i = 0; i <array.size() ; i++) {
            //获取每一个 学生对象
            Student stu=array.get(i);
            if (stu.getSid().equals(sid)){

                //  i 是位置  upstu 是新的对象
                array.set(i,upstu);
            }
        }

        //给出 修改成功的提示
        System.out.println("修改成功");

    }

}