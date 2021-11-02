package HeiMa.a141_StudentManage;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/31 13:37
 * @Version 1.0


    1.2学生管理系统实现思路
        ①定义学生类
        ②主界面的代码编写
        ③添加学生的代码编写
        ④查看学生的代码编写
        ⑤删除学生的代码编写
        ⑥修改学生的代码编写



    1.3定义学生类
        学生类:
            Student
        成员变量:
            学号: sid
            姓名: name
            年龄: age
            居住地: address
        构造方法:
            无参构造
            带四个参数的构造
        成员方法:
            每个成员变量对应给出get/set方法

    快捷键
        alt + insert
            显示 Generate   菜单
                Constructor   构造方法
                Getter        get方法
                Setter        set方法



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



