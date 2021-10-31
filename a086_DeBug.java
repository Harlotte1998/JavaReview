package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 18:52
 * @Version 1.0

1.1 Debug概述
    Debug:是供程序员使用的程序调试工具，它可以用于查看程序的执行流程，
    也可以用于追踪程序执行过程来调试程序。


    Debug调试，又被称为断点调试，断点其实是一个标记， 告诉我们从哪里开始查看
        ①如何加断点
        ②如何运行加了断点的程序
        ③看哪里
        ④点哪里
        ⑤如何删除断点

    1.2.1如何加断点
        选择要设置断点的代码行，在行号的区域后面单击鼠标左键即可。

    1.2.2如何运行加’了断点的程序
        在代码区域石键Debug执行

    1.2.3看哪里
        看Debugger窗口

    1.2.4点哪里
        点Step Into (F7)这个箭头，也可以直接按F7

    1.2.5如何删除断点
        选择要删除的断点，单击鼠标左键即可。




 */

public class a086_DeBug {
    public static void main(String[] args) {

        //定义两个变量
        int i =10;
        int j=20;

        //求和
        int sum=i+j;

        //输出结果
        System.out.println("sum:  "+sum);

    }
}
