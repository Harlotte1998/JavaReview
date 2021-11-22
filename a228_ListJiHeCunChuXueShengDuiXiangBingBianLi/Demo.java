package HeiMa.a228_ListJiHeCunChuXueShengDuiXiangBingBianLi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：LC
 * @date ： 2021/11/22 11:48

案例: List集合存储学生对象并遍历
需求:创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合


思路:
    ①定义学生类
    ②创建List集合对象
    ③创建学生对象
    ④把学生添加到集合
    ⑤遍历集合(迭代器方式, for循环方式)



 */
public class Demo {
    public static void main(String[] args) {

        //②创建List集合对象     l 是集合的对象
        List<Student> l=new ArrayList<>();
        //③创建学生对象   采用带参的方式   stu01 stu02  是学生类对象
        Student stu01=new Student("AAAAA",10);
        Student stu02=new Student("BBBBB",11);
        Student stu03=new Student("CCCCC",12);
        Student stu04=new Student("DDDDD",13);
        //④把学生添加到集合   将四个学生类对象  添加到 集合中去
        l.add(stu01);
        l.add(stu02);
        l.add(stu03);
        l.add(stu04);

        //遍历
        //1.0 使用迭代器的方式      it 是迭代器对象方式
        Iterator<Student> it=l.iterator();
        while (it.hasNext()){
            Student ss=it.next();     //ss 是学生类对象  用来接收 迭代器从 集合中 遍历出来的对象
            String name=ss.getName();
            int age=ss.getAge();
            System.out.println("age: "+age+" name: "+name );
        }
    }
}
