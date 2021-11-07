package HeiMa.a160_LaoShiHeXueSheng;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 17:43
 * @Version 1.0



0案例:老师和学生
    需求:定义老师类和学生类，然后写代码测试;最后找到老师类和学生类当中的共性内容,
        抽取出一个父类，用继承的方式改写代码，并进行测试
        思路:
            ①定义老师类(姓名,年龄，教书0)
            ②定义学生类(姓名，年龄，学习0)
            ③定义测试类，写代码测试
            ④共性抽取父类，定义人类(姓名,年龄)
            ⑤定义老师类，继承人类,并给出自2特有方法:教书0
            ⑥定义学生类,继承人类，并给出自己特有方法:学习0
            ⑦定义测试类，写代码测试







 */

public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        //无参的构造方法  创建对象
        Teacher t1=new Teacher();
        t1.setAge(45);
        t1.setName("老师名字01");

        System.out.println(t1.getName()+"  ++  "+t1.getAge());

        t1.teach();

        //采用带参的构造方法创建对象
        Teacher t2=new Teacher("老师姓名02" , 13);
        System.out.println(t1.getName()+"  ++  "+t1.getAge());
        t2.teach();


    }
}
