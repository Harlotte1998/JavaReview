package HeiMa.a209_RiQiGongJULei;

/*
    案例:日期工具类
    需求:定义一个日期工具类(DateUtils), 包含两个方法:
        把日期转换为指定格式的字符串;把字符串解析为
        指定格式的日期，然后定义一个测试类(DateDemo),测试日期工具类的方法

    思路:
        ①定义日期工具类(DateUtils)
        ②定义一个方法dateToString, 用于把日期转换为指定格式的字符串
            ●返回值类型: String
            ●参数: Date date, String format
        ③定义一个方法stringToDate, 用于字符串解析为指定格式的日期
            ●返回值类型: Date
            ●参数: String s, String format
        ④定义测试类DateDemo,调用日期工具类中的方法


* */

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d=new Date();
        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");

        System.out.println(s1);


        String s2 = DateUtils.dateToString(d,  "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, " HH:mm:ss");
        System.out.println(s3);

        System.out.println("--------------------------");

        //测试 方法stringToDate, 用于字符串解析为指定格式的日期
        String s="2048年1月9日 15:45:28";

        Date date = DateUtils.StringToDate(s,"yyyy年mm月dd日 HH:mm:ss");
        System.out.println(date);


    }
}


