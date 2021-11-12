package HeiMa.a197_ObjectLeiDeequalsFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 15:36
 * @Version 1.0
 */

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public boolean equals(Object o) {
        /*
            this  --s1
            o     -s2
        * */

        //比较地址值是否相同
        if (this == o) return true;

        //o == null
        // 首先判断 参数为null
        //  getClass() != o.getClass()
        //判断这两个对象 是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        // 一开始 把 s2 赋值给 o
        // 将 o 强制转换为 student
        //  student  代表的是 s2
        Student student = (Student) o;


        //等同于 this.age != student.age  比较的是 s1 和s2  的 age
        if (age != student.age) return false;

        //比较姓名内容是否相同
        /*
        name != null  判断s1的内容不等于 null
        使用的是 String 中的 equals 方法
        name.equals(student.name)
        * */
        return name != null ? name.equals(student.name) : student.name == null;
    }



/*
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
 */


}
