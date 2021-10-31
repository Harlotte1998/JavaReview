package HeiMa.a127_StringBuilder;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 13:38
 * @Version 1.0

如果对字符串进行拼接操作，每次拼接，都会构建一-个新的 String对象，
既耗时，又浪费内存空间，而这种操作还不可避免。
那么有没有一种比较好的方式可以解决这个问题呢?
答案是肯定的,我们可以通过Java提供的
StringBuilder类就来解决这个问题。

3.1 StringBuilder概述
    StringBuilder是一个可变的字符串类，我们可以把它看成是一个容器
    这里的可变指的是StringBuilder对象中的内容是可变的


    String和StringBuilder的区别: :
        ●String: 内容是不可变的
        ●StringBuilder: 内容是可变的

 */

public class StringBuilder {
    public static void main(String[] args) {
        String s="hello";
        s=s+"Worid";
        System.out.println(s);
    }
}
