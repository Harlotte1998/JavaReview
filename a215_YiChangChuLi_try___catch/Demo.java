package HeiMa.a215_YiChangChuLi_try___catch;

/**
 * @author ：LC
 * @date ： 2021/11/15 19:21
 *
 * 自己处理异常的意义
 *  Java虚拟机默认的处理方案会让程序在出现问题的地方直接结束掉
 *  在实际开发中，程序在某一个部分出问题，应该不能影响后续的执行
 *  所以我们要自己来处理异常

    1.3异常处理
        如果程序出现了问题，我们需要自己来处理，有两种方案:
            ●try . catch .
            ●throws

1.4异常处理之try..catch... .
●格式:
    try {
        可能出现异常的代码;
    } catch (异常类名  变量名) {
        异常的处理代码;
    }

异常类名  要和异常对象匹配
变量名    其实就是接收的那个对象  这个变量名其实就是一个对象名

执行流程:
    程序从try里面的代码开始执行
    出现异常，会自动生成一个异常类对象，
    该异常对象将被提交给Java 运行时  系统
    当Java运行时系统接收到异常对象时，
    会到catch中去找匹配的异常类,找到后进行异常的处理
    执行完毕之后，程序还可以继续往下执行






* */

public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }


    public static void method(){
        /**

        int[]  arr={1,2,3,4};
        System.out.println(arr[2]);  //这是一个正确的
        System.out.println(arr[4]);  //这是一个错误的  数组越界
       ArrayIndexOutOfBoundsException:
         此时控制台 输出了
            开始
            3
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
                at HeiMa.a215_YiChangChuLi_try___catch.Demo.method(Demo.java:51)
                at HeiMa.a215_YiChangChuLi_try___catch.Demo.main(Demo.java:42)

         输出了 开始
         3
         然后开始报错
         报错的内容有   错误原因
         错误的位置
        程序从 出现问题的地方结束了   这是java虚拟机  默认的处理方式
        我们要做的是 让程序继续向下执行
        在控制台  能输出 结束  两个字



        try {
            int[]  arr={1,2,3,4};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("提示信息: 你访问的数组的索引不存在 ");
        }


        开始
        提示信息: 你访问的数组的索引不存在
        结束

        try {
        int[]  arr={1,2,3,4};
            System.out.println(arr[4]);  当从这里出现问题之后 会产生一个异常类的对象
            //就相当于在这 new 了一个异常  new ArrayIndexOutOfBoundsException()
            把这个东西   new ArrayIndexOutOfBoundsException() 叫给JAVA的运行时系统
            这个 运行时系统 就到 catch里面找匹配的   然后找到 匹配的
            然后就在 {
            System.out.println("提示信息: 你访问的数组的索引不存在 ");
        }
        里面执行
        在实际开发中  出现异常  应该是蹦出一个页面 进行提示  而不仅仅是 在命令行输出一句话





        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("提示信息: 你访问的数组的索引不存在 ");
        }
         */


        try {
            int[]  arr={1,2,3,4};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("提示信息: 你访问的数组的索引不存在 ");
            e.printStackTrace();


        }
        /**
        这里的 e 也是一个对象   既然是对象  就可以调方法

         开始
         结束
         java.lang.ArrayIndexOutOfBoundsException: 4
         at HeiMa.a215_YiChangChuLi_try___catch.Demo.method(Demo.java:113)
         at HeiMa.a215_YiChangChuLi_try___catch.Demo.main(Demo.java:46)
        * */



    }

}