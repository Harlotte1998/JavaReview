package HeiMa.a211_CalendarChangYongFangFa;

/*
*
* 6.7 Calendar的常用方法
    方法名         说明
    public int get(int field)
        返回给定日历字段的值
    public abstract void add(int field, int amount)
        根据日历的规则，将指定的时间量添加或减去给定的日历字段
    public final void set(int year,int month,int date)
        设置当前日历的年月日

* */

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();



        int year = c.get(Calendar.YEAR);
        // 月份  是从0 开始的
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println(  year+"年 " +  month+"月  "  + date+"日 ");


        /*
        public abstract void add(int field, int amount)
        根据日历的规则，将指定的时间量添加或减去给定的日历字段
        比正常时间  少了三年
        输出的是 三年前的  今天
        c.add(Calendar.YEAR,-3);


        int year1 = c.get(Calendar.YEAR);
        // 月份  是从0 开始的
        int month1 = c.get(Calendar.MONTH) + 1;
        int date1 = c.get(Calendar.DATE);

        System.out.println(  year1+"年 " +  month1+"月  "  + date1+"日 ");
        * */


        //需求三  输出 十年后的 5天前
        c.add(Calendar.YEAR,10);
        c.add(Calendar.DATE,-5);

        int year2 = c.get(Calendar.YEAR);
        // 月份  是从0 开始的
        int month2 = c.get(Calendar.MONTH) + 1;
        int date2 = c.get(Calendar.DATE);

        System.out.println(  year2+"年 " +  month2+"月  "  + date2+"日 ");


        //set  方法设置当前年月日
        c.set(2056,01,23);
        int year3 = c.get(Calendar.YEAR);
        // 月份  是从0 开始的
        int month3 = c.get(Calendar.MONTH) + 1;
        int date3 = c.get(Calendar.DATE);

        System.out.println(  year3+"年 " +  month3+"月  "  + date3+"日 ");






    }
}
