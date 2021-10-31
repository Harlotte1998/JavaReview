package HeiMa.a109_this;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 16:40
 * @Version 1.0


4.3 this关键字
①this修饰的变量用于指代成员变量
    ●方法的形参如果 与成员变量同名，不带this修饰的变量
    指的是形参，而不是成员变量

    ●方法的形参没有与成员变量同名，不带this修饰的变量
    指的是成员变量


    ②什么时候使用this呢?解决局部变量隐藏成员变量

    ③this: 代表所在类的对象引用
    ●记住:方法被哪个对象调用，this就代表哪个对象






学生类

 */

public class Student {

    //成员变量
    private String name;
    private int age;

    //get   set   方法
/*

    public void setName(String n) {
        name = n;
    }
这里的这个 n 是代表姓名的意思
这里的这个字母  n  不能充分体现出本来的意思


    public void setName(String name) {
        name = name;
    }

setName中的name是局部变量  private String name; 是成员变量
name=name;     都是setName中的name

this  修饰的是成员变量

没有被修饰的是 成员变量

*/

    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }




    public void show(){
        System.out.println("name="+name+"  age="+age);
    }


}
