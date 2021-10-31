package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 19:12
 * @Version 1.0

1.4 Debug使用
    ●查看方法调用的执行流程
    注意事项:
    如果数据来自于键盘输入，一-定 要记住输入数据，不然就不能继续往下查看了。





 */

public class a088_DeBugChaKanFangFaDiaoYong {
    public static void main(String[] args) {

        //创建对象
        Scanner sc=new Scanner(System.in);

        //接收数据
        System.out.println("请输入第一个数");
        int a=sc.nextInt();

        System.out.println("请输入第二个数");
        int b=sc.nextInt();

        //调用方法
        int max=getMax(a,b);
        //输出结果
        System.out.println("较大的值是  " +max);


    }
    //获取两个数的较大值
    public  static  int getMax(int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }

}
