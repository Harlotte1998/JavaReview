package HeiMa.a144_StudentManage;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/1 14:05
 * @Version 1.0
 */

public class Student {
    //
    private String sid;
    //
    private String name;
    //
    private String age;
    //
    private String address;

    public Student(String sid, String name, String age, String address) {
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public String getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

