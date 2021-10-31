package HeiMa.a128_StringBuilderGouZaoFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 13:44
 * @Version 1.0

    方法名                         说明
StringBuilder()               创建一一个空白可变字符串对象，不含有任何内容
StringBuilder(String str)     根据字符串的内容，来创建可变字符串对象


 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        //创建一一个空白可变字符串对象，不含有任何内容
        StringBuilder  sb1=new StringBuilder();
        System.out.println("sb1: "+sb1);
        System.out.println("sb1.length(): "+sb1.length());


        //根据字符串的内容，来创建可变字符串对象
        StringBuilder  sb2=new StringBuilder("helloworid");
        System.out.println("sb2: "+sb2);
        System.out.println("sb2.length(): "+sb2.length());



    }
}
