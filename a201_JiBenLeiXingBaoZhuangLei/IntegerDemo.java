package HeiMa.a201_JiBenLeiXingBaoZhuangLei;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 18:32
 * @Version 1.0



5.1基本类型包装类概述
    将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
    常用的操作之一:
        用于基本数据类型与字符串之间的转换

    基本数据类型和包装类的关系
        基本数据类型  包装类
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        char        Character
        boolean     Boolean



 */

public class IntegerDemo {
    public static void main(String[] args) {
        //  需求 我要判断一个数据是否在 int  范围内
        //  先获得 int 范围
        //  int 的范围 不好记忆
        //  public static final int MIN_VALUE
        //  public static final int MAX_VALUE
        /*
        final  修饰 说明这是常量
        static 修饰 说明是静态  可以通过类名直接访问
        * */

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
