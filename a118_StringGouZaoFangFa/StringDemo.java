package HeiMa.a118_StringGouZaoFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/29 21:49
 * @Version 1.0

2.2  String  构造方法

    方法名                             说明
    public  String()              创建一个空白字符串对象，不含有任何内容
    public  String( char[] chs)   根据字符数组的内容，来创建字符串对象
    public  String( byte[] bys)   根据字节数组的内容，来创建字符串对象
    String s="aegw";              直接赋值的方法创建字符串对象，内容就是abc

    推荐使用直接赋值的方式，得到字符串的对象

 */

public class StringDemo {
    public static void main(String[] args) {

        // public  String()              创建一个空白字符串对象，不含有任何内容
        String s1=new String();
        System.out.println("s1: "+s1);
        // public  String( char[] chs)   根据字符数组的内容，来创建字符串对象


        //根据字符数组的内容 先创建一个字符数组
        char[] chs={'a','b','c'};
        String s2=new String(chs);
        System.out.println("s2: "+s2);

        // public  String( byte[] bys)   根据字节数组的内容，来创建字符串对象
        byte[] bys={97,98,99,100,101};
        String s3=new String(bys);
        System.out.println("s3: "+s3);
        // 数字 对应的是 ACSll码 里面的字母

        // String s="aegw";              直接赋值的方法创建字符串对象，内容就是abc
        String s4="abc";
        System.out.println("s4: "+s4);

    }
}
