package HeiMa.a120_ZiFuChuanDeBiJIao;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 8:44
 * @Version 1.0


2.4字符串的比较
    使用==做比较
    ●基本类型:比较的是数据值是否相同
    ●引用类型: 比较的是地址值是否相同
    字符串是对象，它比较内容是否相同,是通过一个方法来实现的，这个方法叫: equals()
    ●public boolean equals(Object anObject):将此字符串与指定对象进行比较。
        由于我们比较的是字符串对象，所以参数直接传递一个字符串

 */

public class StringDemo {
    public static void main(String[] args) {

        //构造方法的方式得到对象
        char[] chs= {'a','b','c'};
        String s1=new String(chs);
        String s2=new String(chs);

        //直接赋值的方式得到对象
        String s3="abc";
        String s4="abc";
        System.out.println("+++++++++++++++++++++");

        //比较字符串对象的地址是否相同
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }



}
