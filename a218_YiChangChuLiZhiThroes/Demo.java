package HeiMa.a218_YiChangChuLiZhiThroes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：LC
 * @date ： 2021/11/16 16:29


1.7异常处理之throws
    虽然我们通过try...catch 可以对异常进行处理,但是并不是所有的情况我们都有权限进行异常的处理
    也就是说，有些时候可能出现的异常是我们处理不了的,这个时候该怎么办呢?
    针对这种情况，Java 提供了throws的处理方案


    格式:
        throws异常类名;
    注意:这个格式是跟在方法的括号后面的

 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
//        method01();
        try {
            method02();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }




    //运行时异常
    /**

    public static void method01()throws ArrayIndexOutOfBoundsException{
        int[] arr={51,28,89,687};

        System.out.println(arr[4]);
    }
    throes 处理运行时异常  只会把异常抛出  还需要通过 try catch  来解决
    */



    //编译型异常
    /*
    编译时异常必须要进行处理，两种处理方案: try..a.ch ..或者throws,
    如果采用throws这种方案，将来谁调用谁处理   在main 方法中  调用这个方法
    就在 main  方法中处理

    * */
    public static void method02() throws ParseException {
        String s="2021-09-18";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf.parse(s);
        System.out.println(d);
    }
}
