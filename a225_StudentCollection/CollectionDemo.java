package HeiMa.a225_StudentCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ：LC
 * @date ： 2021/11/21 20:05



    需求:
        创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    思路:
        1:定义学生类
        2:创建Collection集合对象
        3:创建学生对象
        4:把学生添加到集合
        5:遍历集合(迭代器方式)



 
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //2:创建Collection集合对象
        Collection<Student> c=new ArrayList<>();

        //3:创建学生对象
        Student s1=new Student();
        s1.setAge(10);
        s1.setName("刘仁宝");

        Student s2=new Student();
        s2.setAge(20);
        s2.setName("李鸿运");


        //  使用带参的构造方法
        Student s3=new Student(30,"阿巴阿巴阿巴");

        Student s4=new Student(40,"乌拉乌拉");


        //4:把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);


        //5:遍历集合(迭代器方式)
//                    步骤3.1:通过集合对象获取迭代器对象
//                    步骤3.2:通过迭代器对象的hasNext ()方法判断是否还有元素
//                    步骤3.3:通过迭代器对象的next ()方法获取下一个元素
        Iterator<Student> iterator = c.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }



    }
}
