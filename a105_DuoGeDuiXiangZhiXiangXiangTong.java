package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 15:15
 * @Version 1.0
 */

public class a105_DuoGeDuiXiangZhiXiangXiangTong {
    public static void main(String[] args) {
        //创建第1个对象
        a102_XueSheng  s1=new a102_XueSheng();

        //使用对象
        System.out.println("name="+s1.name+"   age="+s1.age);

        s1.name="创建第1个对象";
        s1.age=11111;

        System.out.println("name="+s1.name+"   age="+s1.age);

        s1.study();
        s1.doHomework();


        System.out.println("++++++++++");

        //创建第2个对象
        a102_XueSheng  s2=s1;

        //使用对象
        System.out.println("name="+s2.name+"   age="+s2.age);

        s2.name="创建第2个对象";
        s2.age=222222222;

        System.out.println("name="+s1.name+"   age="+s1.age);
        System.out.println("name="+s2.name+"   age="+s2.age);

        s2.study();
        s2.doHomework();
    }
}
