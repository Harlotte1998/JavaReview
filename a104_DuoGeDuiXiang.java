package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 15:06
 * @Version 1.0
 */

public class a104_DuoGeDuiXiang {
    public static void main(String[] args) {



        //创建第1个对象
        a102_XueSheng  s1=new a102_XueSheng();

        //使用对象
        System.out.println("name="+s1.name+"   age="+s1.age);

        s1.name="刘仁宝";
        s1.age=18;

        System.out.println("name="+s1.name+"   age="+s1.age);

        s1.study();
        s1.doHomework();




        //创建第2个对象
        a102_XueSheng  s2=new a102_XueSheng();

        //使用对象
        System.out.println("name="+s2.name+"   age="+s2.age);

        s2.name="阿巴阿巴";
        s2.age=88;

        System.out.println("name="+s2.name+"   age="+s2.age);

        s2.study();
        s2.doHomework();
    }
}
