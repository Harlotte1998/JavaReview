package HeiMa.a209_RiQiGongJULei;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 工具类
* 构造方法私有
* 成员方法静态
*
* */

public class DateUtils {
    private DateUtils(){}

    /*将日期转为指定格式的字符串
    * 返回值类型  String
    * 参数       Date date   String  format
    *
    * */
    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String format1 = sdf.format(date);

        return format1 ;
    }

    /*
    * 将字符串解析为指定格式的日期
    * 返回值类型   Data
    * 参数        String  s   String format
    * */
    public static Date StringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date d=sdf.parse(s);


        return d;
    }
}
