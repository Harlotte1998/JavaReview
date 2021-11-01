package HeiMa.a140_StudentManage;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/31 12:59
 * @Version 1.0


 学生类
 */

public class Student {

    //学号
    private String sid;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;



    public  Student(){

    }

    public Student(String sid , String name , String age , String address){
        this.name=name;
        this.sid=sid;
        this.age=age;
        this.address=address;
    }

    //学生类 获得sid
    public String getSid(){
        return sid;
    }

    //学生类 输出sid
    public void setSid(String sid){
        this.sid=sid;
    }

    //学生类 获得name
    public String getName(){
        return name;
    }

    //学生类 输出name
    public void setName(String name){
        this.name=name;
    }


    //学生类 获得age
    public String getAge(){
        return age;
    }

    //学生类 输出age
    public void setAge(String age){
        this.age=age;
    }

    //学生类 获得address
    public String getAddress(){
        return address;
    }

    //学生类 输出address
    public void setAddress(String address){
        this.address=address;
    }

}


