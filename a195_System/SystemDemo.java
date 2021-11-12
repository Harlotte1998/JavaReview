package HeiMa.a195_System;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 14:48
 * @Version 1.0

2.1 System类概述
    System包含几个有用的类字段和方法，它不能被实例化

2.1 System类的常用方法
    方法名     说明
    public static void exit(int status)
        终止当前运行的Java虚拟机，非零表示异常终止
    public static long currentTimeMillis(
        返回当前时间(以毫秒为单位)


 */

public class SystemDemo {
    public static void main(String[] args) {

/*

        System.out.println("开始");
        //public static void exit(int status)  终止当前运行的Java虚拟机，非零表示异常终止
        System.exit(0);
        System.out.println("结束");
*/



        //public static long currentTimeMillis() 返回当前时间(以毫秒为单位)
        System.out.println(System.currentTimeMillis());
        //把毫秒换算为 秒
        System.out.println(System.currentTimeMillis()/1000);
        //把毫秒换算为 分
        System.out.println(System.currentTimeMillis()/1000/60);
        //把毫秒换算为 时
        System.out.println(System.currentTimeMillis()/1000/60/60);        //把毫秒换算为 秒
        //把毫秒换算为 天
        System.out.println(System.currentTimeMillis()/1000/60/60/24);        //把毫秒换算为 秒
        //把毫秒换算为 年
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        //
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365+"年");
        //整数与整数之间操作只会得到整数  *1.0  让他变为浮点数  更加精确
        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
        //当前的年份
        System.out.println(1970+System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");


        // 获得 这个for 循环一共运行了 多少时间  毫秒值
        long start=System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println("这个for循环耗时的毫秒值:  " + (end-start));




    }
}
