package HeiMa.a138_ArrayListStudent;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 18:37
 * @Version 1.0

        学生类
 */

public class Student {
    private String name;
    private int age;


    //无参的构造方法
    public Student(){

    }

    //有参的构造方法
    public  Student(String name , int age){
        this.age=age;
        this.name=name;
    }


    //get   set  方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
