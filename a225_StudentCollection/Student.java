package HeiMa.a225_StudentCollection;

/**
 * @author ：LC
 * @date ： 2021/11/21 20:04
 */
public class Student {
    private String name;
    private int age;

    public Student(int age, String name) {
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
/*
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    */

}
