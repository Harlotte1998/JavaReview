package HeiMa.a116_APIDeShiYong;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/29 19:49
 * @Version 1.0

1.3 API使用练习
需求:按照帮助文档的使用步骤学习Scanner类的使用，并实现键盘录入-个字符串,最后输出在控制台


Scanner:
    用于获取键盘录入数据。(基本数据类型，字符串数据)
public String nextLine():
    获取键盘录入字符串数据


public String nextLine()

注意:
调用方法的时候，如果方法有明确的返回值,我们用变量接收
可以手动完成，也可以使用快捷键的方式完成(Ctrl+Alt+V)



 */

public class ScannerDemo {
    public static void main(String[] args) {
       //创建对象
        Scanner sc=new Scanner(System.in);
              //   new后面的  Scanner(System.in); 其实是一个构造方法
              //  System.in  是构造方法里面的一个参数


        //接收数据
        System.out.println("请输入一个字符串数据");
        String line=sc.nextLine();
        //更加合理的写法
        //  先写一个 sc.nextLine();
        //  Ctrl + Alt + V    自动补全
//        String s = sc.nextLine();
        /*
        * 调用方法的时候，如果方法有明确的返回值,我们用变量接收
        可以手动完成，也可以使用快捷键的方式完成(Ctrl+Alt+V)
        * */


        //输出结果
        System.out.println("你输出的数据是"+line);
    }
}
