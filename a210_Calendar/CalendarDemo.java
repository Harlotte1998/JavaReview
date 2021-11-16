package HeiMa.a210_Calendar;


import java.util.Calendar;

/*
6.6 Calendar类概述
    Calendar为某一时刻和一组日历字段之间的转换提供了-些方法，
        并为操作日历字段提供了- -些方法
    Calendar提供了-个类方法getInstance用于获取Calendar对象，
        其日历字段已使用当前日期和时间初始化:


    Calendar rightNow = CalendargetInstance0;

*
*
* */
public class CalendarDemo {
    public static void main(String[] args) {
        //
        Calendar c = Calendar.getInstance();
//        System.out.println(c);
        /* 输出一下内容
         * java.util.GregorianCalendar
         * [time=1636877690007,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo
         * [id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null]
         * ,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=10,WEEK_OF_YEAR=47,WEEK_OF_MONTH=3,
         * DAY_OF_MONTH=14,DAY_OF_YEAR=318,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=4,HOUR_OF_DAY=16,MINUTE=14,
         * SECOND=50,MILLISECOND=7,ZONE_OFFSET=28800000,DST_OFFSET=0]
         * */


        int year = c.get(Calendar.YEAR);
        // 月份  是从0 开始的
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println(  year+"年 " +  month+"月  "  + date+"日 ");


    }
}
