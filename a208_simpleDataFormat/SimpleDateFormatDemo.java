package HeiMa.a208_simpleDataFormat;



/*
    6.3 SimpleDateFormat类概述
        SimpleDateFormat是一个具体的类,
        用于以区域设置敏感的方式格式化和解析日期。
        我们重点学习日期格式化和解析
        日期和时间格式由日期和时间模式字符串指定，
        在日期和时间模式字符串中，从'A'到'Z' 以及从'a'到'Z'
        引号的字母被解释为表示日期或时间字符串的组件的模式字母


        常用的模式字母及对应关系如下:

            ●y  年
            ●M  月
            ●d  日
            ●H  时
            ●m  分
            ●s  秒



    6.4 SimpleDateFormat的构造方法
        方法名     说明
        public SimpleDateFormat0
            构造一个SimpleDateFormat,使用默认模式和日期格式
        public SimpleDateFormat(String pattern)
            构造-个SimpleDateFormat使用给定的模式和默认的日期格式




    6.5 SimpleDateFormat格式化和解析日期
        1.格式化(从Date到String )
            public final String format(Date date):将日期格式化成日期/时间字符串
        2.解析(从String到Date )
            public Date parse(String source):从给定字符串的开始解析文本以生成日期


* */


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
    //1.格式化(从Date到String )
        //public final String format(Date date):将日期格式化成日期/时间字符串
        //创建对象
        Date d=new Date();
        //1.0使用无参的构造方法   这是使用 默认的  方式
        //SimpleDateFormat  sdf=new SimpleDateFormat();
        //调用方法
        //String format = sdf.format(d);

        //System.out.println(format);


        //2.0 使用 给定的格式
        SimpleDateFormat  sdf=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        String format = sdf.format(d);
        System.out.println(format);

        System.out.println("---------------");

    //2.解析(从String到Date )
        //public Date parse(String source):从给定字符串的开始解析文本以生成日期
        //String ss="2021-02-08 11:45:56";
        //SimpleDateFormat  sdf2=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        //Date parse = sdf2.parse(ss);
        /*
        此时 parse 下面会报错   Alt + Enter
        选择第一个
        主函数后面会 增加  throws ParseException
        这是抛出异常的意思
        此时 报错 ParseException: Unparseable date: "2021-02-08 11:45:56"
        解析异常
        String ss="2021-02-08 11:45:56";
        SimpleDateFormat  sdf2=new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        2021-02-08 11:45:56
        yyyy年MM月dd日HH:mm:ss
        年月日 和 -  -  -  不匹配
        上下格式要匹配
        * */

        String ss="2021-02-08 11:45:56";
        SimpleDateFormat  sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse(ss);
        System.out.println(parse);
        /*
         Mon Feb 08 11:45:56 CST 2021
        **/



    }
}
