package HeiMa.a213_YiChang;

/**
 * @author ：LC
 * @date ： 2021/11/15 18:42

java.lang.Object
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.IndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException

 寻找 ArrayIndexOutOfBoundsException   异常的初始类


Throwable  里面的 构造方法
    public class Throwable
    extends Object
    implements Serializable

Throwable类是java语言中的所有错误和异常的超类。
    两子类的实例，Error和异常
        1.0 Error 一个 Error是 Throwable表示严重的问题，合理的应用程序不应该试图捕获，
           大多数这样的错误是异常情况
        2.0 异常 异常类及其子类是一种 Throwable表明合理的应用程序想要捕获的条件。

31415926

1.1异常概述
异常:就是程序出现了不正常的情况
异常体系
            Throwable
      ↓               ↓
    Error           Exception
                       ↓                      ↓
              RuntimeException        非RuntimeException

Error:严重问题，不需要处理
Exception:称为异常类,它表示程序本身可以处理的问题
●RuntimeException: 在编译期是不检查的，出现问题后，需要我们回来修改代码
●非RuntimeException:编译期就必须处理的,否则程序不能通过编译,就更不能正常运行了



 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method(){
        int[] arr={1,2,3};
//        System.out.println(arr[1]);
//        System.out.println(arr[3]);  ArrayIndexOutOfBoundsException 数组的索引越界

//




    }

}
