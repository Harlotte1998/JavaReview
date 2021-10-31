package HeiMa.a132_ZiFuChuanFanZhuan;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 16:25
 * @Version 1.0

案例:字符串反转
    需求:定义-一个方法,实现字符串反转。键盘录入-一个字符串，
        调用该方法后,在控制台输出结果
    例如，键盘录入abc,输出结果cba

    思路:
        ①键盘录入-个字符串,用Scanner实现
        ②定义一个方法，实现字符串反转。返回值类型String,参数String s
        ③在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        ④调用方法，用一个变量接收结果
        ⑤输出结果

 */

public class StringBuilderDemo {
    public static void main(String[] args) {
        //①键盘录入-个字符串,用Scanner实现
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1=sc.nextLine();
        //调用方法，用一个变量接收结果
        String s4=myReverse(s1);
        //⑤输出结果
        System.out.println("反转后的字符串："+s4);

    }

    /*
    *②定义一个方法，实现字符串反转。
    * 两个明确
    *   返回值类型  String
    *   参数       String s
    * */
    public  static  String myReverse(String s){
//        //通过构造方法就可以实现把String转换为StringBuilder
//        StringBuilder s2=new StringBuilder(s);
//        //用StringBuilder实现字符串的反转
//        s2.reverse();
//        //并把结果转成String返回
//        String s3=s2.toString();
//        return s3;


        //精简版   采用匿名对象的方法
        return new StringBuilder(s).reverse().toString();



    }
}
