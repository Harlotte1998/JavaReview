package HeiMa.a108_privateDeShiYong;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 16:12
 * @Version 1.0

4.2 private关键字的使用
-个标准类的编写:
●把成员变量用private修饰
●提供对应的getXxx0/setXxx(方法






 学生类

 */

public class Student {

    //成员变量
    private String name;
    private int age;

    //get   set   方法

    public void setName(String n) {
        name = n;
    }


    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }


    public void setAge(int a) {
        age = a;
    }

    public void show(){
        System.out.println("name="+name+"  age="+age);
    }


}
