package HeiMa.a196_ObjectLeiDetoStringFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 15:16
 * @Version 1.0
 */
                    //隐含着一个继承关系
public class Student extends Object{
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
