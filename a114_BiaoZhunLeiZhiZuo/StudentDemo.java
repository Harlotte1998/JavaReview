package HeiMa.a114_BiaoZhunLeiZhiZuo;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/29 18:32
 * @Version 1.0
 */

public class StudentDemo {
    public static void main(String[] args) {
    //④创建对象并为其成员变量赋值的两种方式
        //●无参构造方法创建对象后使用setXx<()赋值
        Student s1=new Student();
        s1.setName("无参使用get");
        s1.setAge(56);
        s1.show();

        //●使用带参构造方法直接创建带有 属性值的对象
        Student s2=new Student("小明" , 89);
        s2.show();
    }

}
