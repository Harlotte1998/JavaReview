package HeiMa.a160_LaoShiHeXueShengDemo;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 18:28
 * @Version 1.0
 */

public class Demo {
    public static void main(String[] args) {
        //创建老师类进行测试    无参的构造方法
        Teacher t1=new Teacher();
        t1.setAge(23);
        t1.setName("老师的名字");
        System.out.println(t1.getName()+"++"+t1.getAge());
        t1.teach();

        //创建学生类进行测试   带参的构造方法
        Teacher t2=new Teacher("带参的构造方法--老师的名字",12);
        System.out.println(t1.getName()+"++"+t1.getAge());
        t2.teach();



    }
}
