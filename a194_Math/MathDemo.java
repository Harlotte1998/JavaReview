package HeiMa.a194_Math;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 14:05
 * @Version 1.0


1.1 Math类概述
    通过查看帮助文档
    Math包含执行基本数字运算的方法
    没有构造方法，如何使用类中的成员呢?
        看类的成员是否都是静态的，如果是,通过类名就可以直接调用

    1.2 Math 类的常用方法


        方法名                                              说明
    public static int abs(int a)                    返回参数的绝对值
    public static double ceil(double a)             返回大于或等于参数的最小double值，等于一个整数
    public static double floor(double a)            返回小于或等于参数的最大double值，等于一个整数
    public static int round(float a)                按照四舍五入返回最接近参数的int
    public static int max(int a,int b)              返回两个int值中的较大值
    public static int min(int a,int b)              返回两个int值中的较小值
    public static double pow(double a,double b)     返回a的b次幂的值
    public static double random()                   返回值为double的正值，[0.0,1.0)
                                                    能取到 0.0  取不到 1.0



 */

public class MathDemo {
    public static void main(String[] args) {
        //public static int abs(int a)
        //返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------------");
        //public static double ceil(double a)
        //返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------------");
        //public static double floor(doublea)
        //返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("--------------");
        //public static int round(float a)
        //按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.56));
        System.out.println("--------------");
        //public static int max(int a,int b)
        //返回两个int值中的较大值
        System.out.println(Math.max(89,900));
        System.out.println("--------------");
        //public static int min(int a,int b)
        //返回两个int值中的较小值
        System.out.println(Math.min(89,900));
        System.out.println("--------------");

        //public static double pow(double a,double b)
        //返回a的b次幕的值
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("--------------");

        //public static double random()
        //返回值为double的正值，[0.0,1.0)  能取到 0.0  取不到 1.0
        System.out.println(Math.random());
        System.out.println(Math.random()*100   +"     X100");
        //取整数部分  原来的double  类型  强制转换为 int类型
        System.out.println((int)(Math.random()*100));
        //原来的取值范围是 [0.0,1.0)  能取到 0.0  取不到 1.0
        //解决取不到100的方案
        System.out.println((int)(Math.random()*100)+1);


    }
}
