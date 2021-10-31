package HeiMa.a129_StringBuilderTianJiaHeFanZhuan;



/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 13:57
 * @Version 1.0

3.3 StringBuilder的添加和反转方法


            方法名                                 说明
    public StringBuilder append(任意类型)    添加数据，并返回对象本身
    public StringBuilder reverse()          返回相反的字符序列



 */

public class StringBuilderDemo {
    public static void main(String[] args) {


        //创建对象
        StringBuilder sb1=new StringBuilder();


/*
        //public  StringBuilder  append(任意类型);  添加数据 并返回数据本身
        StringBuilder sb2=sb1.append("hello");
        //s1调用 append方法  添加了  hello  字符串进入了 s1  中
        //s1返回的数据  使用StringBuilder 创建第二个对象 sb2  接收

        System.out.println("sb1: "+sb1);    //hello
        //sb1中的数据 也被修改成为了  hello
        System.out.println("sb2: "+sb2);    //hello
        System.out.println(sb1==sb2);       //false   相同
        //sb1   sb2  是同一个对象

        //添加对象  返回的是本身
        //所以就没必要，再新建一个  新的对象去调用  新建的对象sb2  还是原来的 sb1
        //原来的 sb1  与sb2是相通的作用



        //  可以传任意类型的
        sb1.append("Hello");
        sb1.append("Worid");
        sb1.append(100);

  */


        //链式编程   因为每一次调用方法返回的都是方法本身
        //所以 sb1等同于sb1.append("Hello");
        //只要是 对象  就可以调用方法
        sb1.append("Hello").append("Worid").append(100);


        System.out.println("sb1:  "+sb1);


        //public StringBuilder reverse()          返回相反的字符序列
        sb1.reverse();
        System.out.println("反转: "+sb1);

    }
}
