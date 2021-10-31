package HeiMa.a130_StringBuilderHeStringHuXiangZhuanHuan;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 15:39
 * @Version 1.0


3.4 StringBuilder和String相互转换


 StringBuilder中有两个很好用的方法   一个是  reverse();   append();
 String  不能直接使用 这两个方法
如果想要用这两个方法  String   就先把  StringBuilder  转为
 再把  StringBuilder 转为   String


1. StringBuilder转换为String
    public String toString():
    通过toString(就可以实现把StringBuilder转换为String
2. String转换为StringBuilder
    public StringBuilder(Strings):
    通过构造方法就可以实现把String转换为StringBuilder



 */

public class StringAndStringBuilder {
    public static void main(String[] args) {

/*

        //1. StringBuilder转换为String
        //新建一个对象  sb1
        StringBuilder sb1=new StringBuilder();
        //给这个对象添加字符
        sb1.append("hello");

        //String s=sb1;    这样是错误的

        //通过toString(就可以实现把StringBuilder转换为String
        String s1=sb1.toString();

        System.out.println(s1);

*/

        //2. String转换为StringBuilder
        String sb2="hello";

        //StringBuilder s2=sb2;  错误的做法

        //通过构造方法就可以实现把String转换为StringBuilder
        StringBuilder s2=new StringBuilder(sb2);

        //s2的内容  来自于  sb2
        System.out.println("s2: "+s2);

    }
}
