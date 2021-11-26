package HeiMa.a232_ListJiHeCunChuXueShengDuiXiangSanZHongFangShiBIanLi;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：LC
 * @date ： 2021/11/25 19:03

案例: List集合存储学生对象用3种方式遍历
需求:创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合

思路:
//    ①定义学生类
//    ②创建List集合对象
//    ③创建学生对象
//    ④把学生添加到集合
//    ⑤遍历集合
        迭代器:集合特有的遍历方式
        普通for:带有索引的遍历方式
        增强for:最方便的遍历方式


 */
public class ListDemo {
    public static void main(String[] args) {
//    ②创建List集合对象
        ArrayList<Student>  list=new ArrayList<Student>();
//    ③创建学生对象
        Student s1=new Student(91,"AAAAAAA");
        Student s2=new Student(92,"BBBBBBB");
        Student s3=new Student(93,"CCCCCCC");
        Student s4=new Student(94,"DDDDDDD");
//    ④把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


//    ⑤遍历集合

        //迭代器:集合特有的遍历方式
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println("age: "+s.getAge()+"  name:  "+s.getName());

        }


        System.out.println("----------------------");


        //普通for:带有索引的遍历方式
        for (int i = 0; i <list.size() ; i++) {
            Student stu = list.get(i);
            System.out.println("age: "+stu.getAge()+"  name:  "+stu.getName());

        }

        System.out.println("----------------------");


        //增强for:最方便的遍历方式
        for (Student j: list){
            System.out.println("age: "+j.getAge()+"  name:  "+j.getName());
        }




    }
}
