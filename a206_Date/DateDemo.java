package HeiMa.a206_Date;

import java.util.Date;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/13 16:49
 * @Version 1.0

6.1 Date类概述和构造方法
    Date代表了-一个特定的时间，精确到毫秒
    方法名                     说明
    public Date()           分配一个Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
    public Date(long date)  分配个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数

    CST 指的是 中国标准时间
 */

public class DateDemo {
    public static void main(String[] args) {

        //public Date()           分配一个Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d1=new Date();
        System.out.println(d1);
        /*
        * 按照常理  System.out.println(d1);应该是一个 路径名@地址值
        * 但是 输出的是   Sat Nov 13 17:03:53 CST 2021
        * 说明 他重写了 这个 toString方法
        * */

        //public Date(long date)  分配个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long data =1000*60*60;
        Date d2=new Date(data);
        System.out.println(d2);
        /*
        *应该输出 格林威治 时间
        * 1970年 01日 01:00:00
        * 但是我国位于 东八区  时间要 +8
        * Thu Jan 01 09:00:00 CST 1970
        *
        * */
    }
}
