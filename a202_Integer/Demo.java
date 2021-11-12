package HeiMa.a202_Integer;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/12 17:45
 * @Version 1.0

Integer  是int的包装类类型

        方法名                                         说明
    public Integer(int value)                   根据int值创建Integer对象(过时)
    public Integer(String s)                    根据String值创建Integer对象(过时)
    public static Integer valueOf(int i)        返回表示指定的int值的Integer实例
    public static Integer valueOf(String s)     返回一个保存指定值的Integer对象String

    使用构造方法
        public Integer(int value)                   根据int值创建Integer对象(过时)
        public Integer(String s)                    根据String值创建Integer对象(过时)

    静态方法获取对象
        public static Integer valueOf(int i)        返回表示指定的int值的Integer实例
        public static Integer valueOf(String s)     返回一个保存指定值的Integer对象String


 */

public class Demo {
    public static void main(String[] args) {

/*

        Integer i1=new Integer(100);
        System.out.println(i1);     //输出 100


        Integer i2=new Integer("100");
        //Integer i2=new Integer("abcd");
        */
/*  报错  不是一个数字的字符串
        NumberFormatException.forInputString
        * *//*

        System.out.println(i2);
*/
        //public static Integer valueOf(int i)        返回表示指定的int值的Integer实例
        //public static Integer valueOf(String s)     返回一个保存指定值的Integer对象String

        Integer i3=Integer.valueOf(100);
        System.out.println(i3);     //输出 100


        Integer i4=Integer.valueOf("100");
        System.out.println(i4);     //输出 100

        //Integer i5=Integer.valueOf("abcd");
        //System.out.println(i5);     //输出 100

    }

}
