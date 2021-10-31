package HeiMa.a125_ZiFuChuanFanZhuan;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 11:31
 * @Version 1.0


6案例:字符串反转
    需求:定义一个方法，实现字符串反转。键盘录入-个字符串，调用该方法后，在控制台输出结果
    例如，键盘录入abc,输出结果cba


    思路:
        ①键盘录入一个字符串，用Scanner实现
        ②定义一个方法，实现字符串反转。返回值类型String,参数String s
        ③在方法中把字符串倒着遍历，然后把每一一个得到的字符拼接成一个字符串并返回
        ④调用方法，用一个变量接收结果
        ⑤输出结果

 */

public class StringTest {
    public static void main(String[] args) {
        //①键盘录入一个字符串，用Scanner实现
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line=sc.nextLine();

        //调用方法  用一个变量  接收结果
        String str = arrReverse(line);

        //输出结果
        System.out.println("s："+str);

    }

    //②定义一个方法，实现字符串反转。返回值类型String, 参数String s
    /*
    * 两个明确
    *   1.参数        String line
    *   2.返回值类型  String
    * */
    public static String arrReverse(String s){
        //先创建一个 空的 字符串
        String k ="";


        //拼接的操作
        //③在方法中把字符串倒着遍历
        for (int i=s.length()-1;i>=0;i--){
           k=k+s.charAt(i);
        }

        //返回值
        return k;

    }

}
