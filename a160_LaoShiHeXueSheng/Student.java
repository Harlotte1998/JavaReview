package HeiMa.a160_LaoShiHeXueSheng;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 17:44
 * @Version 1.0
 */

public class Student {
    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    public void study(){
        System.out.println("学生类类 方法");
    }


}
