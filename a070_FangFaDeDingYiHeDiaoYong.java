package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 11:00
 * @Version 1.0
 *

 2.1 方法定义
    格式：
        public  static  void  方法名（）{
                // 方法体
        }

    范例：
        public  static  void  isEvenNumber（）{
            // 方法体
        }

 2.2 方法调用
    ●格式:方法名();
    ●范例:isEvenNumber();


注意:
    ●方法必须先定义后调用，否则程序将报错



 *
 */

public class a070_FangFaDeDingYiHeDiaoYong {
    public static void main(String[] args) {
        //需求  定义一个方法  在方法中定义一个变量  判断该数据是否为偶数

        //在 Main 方法中调用
        isEvenNumber();
    }

    public static  void isEvenNumber(){

        // 输入一个变量
        System.out.println("请输入一个数字");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        //判断是否为偶数
        if (i%2==0){
            System.out.println(i+"是一个偶数");
        }else {
            System.out.println(i+"不是一个偶数");
        }


    }

}
