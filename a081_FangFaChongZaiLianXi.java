package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 17:31
 * @Version 1.0
 *

需求:使用方法重载的思想，设计比较两个整数是否相同的方法，
    兼容全整数类型(byte,short,intlong)




 */

public class a081_FangFaChongZaiLianXi {
    public static void main(String[] args) {

        //方法调用
        System.out.println(compare(12,12));

        //需要强制转换
        System.out.println(compare((byte)12,(byte)12));

        //需要强制转换
        System.out.println(compare((short)12,(short)12));

        //需要强制转换
        System.out.println(compare((byte)12,(byte)12));

        System.out.println(compare(10l  ,  10l));

        /*
        System.out.println(compare(12.0,12.0));

        System.out.println(compare(12,12));

        System.out.println(compare(12,12));*/

    }

    public static  boolean compare(int a, int b){
        System.out.println("int");
        //  观察调用了哪一个方法
        return a==b;

    }

    public static  boolean compare(long a, long b){
        System.out.println("long");
            return a==b;
    }

    public static  boolean compare(short a, short b){
        System.out.println("short");
        return a==b;
    }

    public static  boolean compare(byte a, byte b){
        System.out.println("byte");
        return a==b;
    }
}
