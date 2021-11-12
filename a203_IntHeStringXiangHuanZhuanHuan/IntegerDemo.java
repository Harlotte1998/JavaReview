package HeiMa.a203_IntHeStringXiangHuanZhuanHuan;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/12 18:06
 * @Version 1.0

5.3 int和String的相互转换
    基本类型包装类的最常见操作就是:用于基本类型和字符串之间的相互转换
        1. int转换为String
            public static String valueOf(inti):     返回int参数的字符串表示形式。该方法是String类中的方法
        2. String转换为int
            public static int parselnt(Strings):    将字符串解析为int类型。该方法是Integer类中的方法



 */

public class IntegerDemo {
    public static void main(String[] args) {
    //  int-----string
        int num=789;
    //方式一
        String s1=""+num;
        //使用的是 字符串参与加法运算  做的是字符串连接
        //把他变成字符串
        System.out.println(s1);  //输出 789 是字符串类型

    //方式二
        /*
        public static String valueOf(int i)
        返回的 int参数的字符串表示形式。
        * */
        String s2=String.valueOf(num);
        System.out.println(s2);  //输出 789 是字符串类型

    //  int-----string
        String s="4658";

    //方式一
        //将String 转为 Integer  再转为 int
        //将字符串 变为一个 Integer类型
        Integer i=Integer.valueOf(s);
        //  Integer  再转为 int
        /*
        int intValue()
        返回一个 Integer 值 作为 int
        不是静态的  通过 对象 i  来调用
        利用Integer 作为一个桥梁
        * */
        int x=i.intValue();
        System.out.println(x);   //输出 4567  int 类型的


    //方式一
        /*
        public static int parseInt(String s)
        static  静态修饰的  可以通过类名 直接调用
        * */

        int y=Integer.parseInt(s);
        System.out.println(y);   //输出 4567  int 类型的

    }
}
