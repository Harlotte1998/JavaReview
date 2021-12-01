package HeiMa.a236_ArrayListJiHeCunChuXueShengDuiXIangSanZHongFangShiBianLian;

import java.util.ArrayList;

/**
 * @author ：LC
 * @date ： 2021/11/25 19:57
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();

        Student s1=new Student(1111,"AAAAA");
        Student s2=new Student(2222,"BBBBB");
        Student s3=new Student(3333,"CCCCC");
        Student s4=new Student(4444,"DDDDD");

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        for (Student s:al){
            System.out.println("age: "+s.getAge()+"  name: "+s.getName());
        }

    }
}
