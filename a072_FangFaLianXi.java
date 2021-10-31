package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 11:20
 * @Version 1.0
 *
2.4方法练习
需求:
    设计-个方法用于打印两个数中的较大数

思路:
    1:定义一个方法，用于打印两个数字中的较大数，例如getMax()
    2:方法中定义两个变量，用于保存两个数字
    3:使用分支语句分两种情况对两个数字的大小关系进行处理
    4:在main()方法中调用定义好的方法




 *
 */

public class a072_FangFaLianXi {
    public static void main(String[] args) {

        getMax();

    }

    public static void getMax(){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入a");
        int a=sc.nextInt();
        System.out.println("输入b");
        int b=sc.nextInt();

        if (a>b){
            System.out.println("a>b");
        } else {
            System.out.println("a<b");

        }


    }
}
