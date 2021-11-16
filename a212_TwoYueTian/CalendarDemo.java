package HeiMa.a212_TwoYueTian;

/*

案例:二月天
需求:获取任意-年的二月有多少天
思路:
    ①键盘录入任意的年份
    ②设置日历对象的年、月、日
        ●年:来自于键盘录入，
        ●月:设置为3月，月份是从0开始的，所以设置的值是2
        ●日:设置为1日
    ③3月1日往前推一天, 就是2月的最后-天
    ④获取这一天输出即可

*
* */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        ①键盘录入任意的年份

        System.out.println("请输入年份");
        int year=sc.nextInt();
//        ②设置日历对象的年、月、日
        Calendar c=Calendar.getInstance();



//            ●年:来自于键盘录入，
//            ●月:设置为3月，月份是从0开始的，所以设置的值是2
//            ●日:设置为1日
        c.set(year,2,1);
//        ③3月1日往前推一天, 就是2月的最后-天
        c.add(Calendar.DATE,-1);

//        ④获取这一天输出即可
        int date=c.get(Calendar.DATE);
        System.out.println(year+"年的二月份有"+date+"天");








    }
}
