package HeiMa.a122_BianLiZiFuChuan;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 9:32
 * @Version 1.0

0案例: 遍历字符串
需求:
    键盘录入一个字符串，使用程序实现在控制台遍历该字符串
思路:
    ①键盘录入一个字符串，用Scanner实现
    ②遍历字符串，首先要能够获取到字符串中的每一一个字符
        ●public char charAt(int index):返回指定索引处的char值，
         字符串的索引|也是从0开始的
          类似于数组下标
    ③遍历字符串，其次要能够获取到字符串的长度
        ●public int length():返回此字符串的长度
        ●数组的长度: 数组名.length
        ●字符串的长度:字符串对象length0

    ④遍历字符串的通用格式
    for(int i=0; i<s.1ength(); i++) {
        s.charAt(i); // 就是指定索引处的字符值
    }

 */

public class StringTest {
    public static void main(String[] args) {
        //①键盘录入一个字符串，用Scanner实现
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line=sc.nextLine();
        //②遍历字符串，首先要能够获取到字符串中的每一一个字符
        for (int i=0;i<line.length();i++){
            System.out.println(line.charAt(i));
        }
        //③遍历字符串，其次要能够获取到字符串的长度
        //
        //
        //
    }
}
