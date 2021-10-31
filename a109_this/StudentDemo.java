package HeiMa.a109_this;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 16:41
 * @Version 1.0
 *
 *
学生测试类
 */

public class StudentDemo {
    public static void main(String[] args) {
        //
        Student s=new Student();

        //使用set方法给成员变量
        s.setAge(89);
        s.setName("刘仁宝");

        s.show();
        //使用get方法获取成员变量的值
        System.out.println("name="+s.getName()+"  age="+s.getAge());


        //show方法只能给出固定时间的值
        //  get  set  方法能获取 自己想要的格式

        //
    }
}
