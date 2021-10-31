package HeiMa.a114_BiaoZhunLeiZhiZuo;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/29 18:32
 * @Version 1.0


5.3标准类制作
    ①成员变量
        ●使用private修饰
    ②构造方法
        ●提供一个无参构造方法
        ●提供一个带多个参数的构造方法
    ③成员方法
        ●提供每一个成员变量对应的setXxx()/getXx()
        ●提供一个显示对象信息的show()
    ④创建对象并为其成员变量赋值的两种方式
        ●无参构造方法创建对象后使用setXx<()赋值
        ●使用带参构造方法直接创建带有 属性值的对象


 */
public class Student {
    private String name;
    private int age;
    //●提供一个无参构造方法
    public Student(){

    }

    //●提供一个带多个参数的构造方法
    public Student(String name, int age){
        this.age=age;
        this.name=name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void  show(){
        System.out.println("name="+name+"  age="+age);
    }


}
