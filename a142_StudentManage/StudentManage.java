package HeiMa.a142_StudentManage;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/31 13:51
 * @Version 1.0


1.4主界面的代码编写
    思路
        ①用输出语句完成主界面的编写
        ②用Scanner实现键盘录入数据
        ③用switch语句完成操作的选择
        ④用循环完成再次回到主界面



 */

public class StudentManage {
    public static void main(String[] args) {
        //④用循环完成再次回到主界面

        while (true){


            //①用输出语句完成主界面的编写
            System.out.println("--------欢迎来到学生管理相同---------");
            System.out.println("|   1.添加学生                     |");
            System.out.println("|   2.删除学生                     |");
            System.out.println("|   3.修改学生                     |");
            System.out.println("|   4.查看所有学生                 |");
            System.out.println("|   5.退出                        |");
            System.out.println("请输入你的选择: ");

            //②用Scanner实现键盘录入数据
            Scanner  sc=new Scanner(System.in);
            String line=sc.nextLine();

            //③用switch语句完成操作的选择
            switch (line){
                case"1":
                    System.out.println("1.添加学生");
                    break;
                case"2":
                    System.out.println("2.删除学生");
                    break;
                case"3":
                    System.out.println("3.修改学生");
                    break;
                case"4":
                    System.out.println("4.查看所有学生");
                    break;
                case"5":
                    System.out.println("你已退出系统 谢谢使用");
                    //break;
                    // break  只是 结束 swith 循环  并不能退出系统
                    System.exit(0);  //JVM  java虚拟机退出
                    //结束 while 循环



            }
        }
    }
}
