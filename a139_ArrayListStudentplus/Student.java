package HeiMa.a139_ArrayListStudentplus;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 19:33
 * @Version 1.0
 */

public class Student {
    private String name;
    private String age;

    public Student(){

    }

    public Student(String name,String age){
        this.age=age;
        this.name=name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
