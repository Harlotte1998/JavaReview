package HeiMa.a113_GouZaoFangFaZhuYiShiXiang;


/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 19:07
 * @Version 1.0
 */

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s=new Student();
        s.show();


        // public Student(String name)
        Student s2=new Student("使用有参的构造方法");
        s2.show();

        Student s3=new Student(18);
        s3.show();

        Student s4=new Student("完整的构造方法" , 89 );
        s4.show();
    }
}
