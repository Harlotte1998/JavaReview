package HeiMa.a217_NianYiShiYiChangHeYunXingShiYiChangDeQuBie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：LC
 * @date ： 2021/11/15 20:17

1.6编译时异常和运行时异常的区别
    Java中的异常被分为两大类:编译时异常和运行时异常，也被称为受检异常和非受检异常
    所有的RuntimeException类及其子类被称为运行时异常，其他的异常都是编译时异常


    编译时异常:必须显示处理，否则程序就会发生错误，无法通过编译

    运行时异常:无需显示处理，也可以和编译时异常-样处理




 */
public class Demo {
    public static void main(String[] args) {
//        method();
        method2();

    }

/**
    //运行时异常
    public static void method(){
        int[] arr={1,2,3,4};

        System.out.println(arr[4]);
        */
/**
        这时 在 idea中并不报错    这是一个非受检异常   运行时异常

         *//*

    }
*/

    /**

    //编译时异常
    public static void method2(){
        String s="2048-08-09";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
        Date parse = sdf.parse(s);
        System.out.println(parse);

    }


     此时
     Date parse = sdf.parse(s);
     中的 parse  会变红  运行程序 会报异常  如下所示
     Error:(51, 31)
     java: 未报告的异常错误java.text.ParseException;
     必须对其进行捕获或声明以便抛出

     去帮助文档中 找一下  ParseException


     java.lang.Object
     java.lang.Throwable
     java.lang.Exception
     java.text.ParseException

     他的最终父类 是 Throwable  说明 他是 编译时异常
     编译时异常:必须显示处理，否则程序就会发生错误，无法通过编译
    通过 try  catch  处理

     编译时异常 是说 在编译时 有可能出现异常  不是一定出异常

    */

    public static void method2(){

        try {
            String s="2048-08-09";
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
            Date parse = sdf.parse(s);
            System.out.println(parse);

        } catch (ParseException  e){
            e.printStackTrace();
        }


    }






}
