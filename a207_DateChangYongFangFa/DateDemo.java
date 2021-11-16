package HeiMa.a207_DateChangYongFangFa;


import java.util.Date;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/13 17:11
 * @Version 1.0


6.2 Date类的常用方法
方法名             说明

public long getTime()
获取的是日期对象从1970年1月1日00:00:00到现在的毫秒值


public void setTime(long time)
设置时间，给的是毫秒值



 */

public class DateDemo {
    public static void main(String[] args) {

        //创建日期对象
        Date d=new Date();
        //public long getTime()
        //获取的是日期对象从1970年1月1日00:00:00到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime()*1.0/1000/60/60/24/365+"年");

        System.out.println("过年了");
/*        public void setTime(long time)
        设置时间，给的是毫秒值*/
    }
}
