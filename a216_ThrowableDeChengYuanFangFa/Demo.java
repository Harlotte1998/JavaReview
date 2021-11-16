package HeiMa.a216_ThrowableDeChengYuanFangFa;

/**
 * @author ：LC
 * @date ： 2021/11/15 20:00


Throwable
    是所有异常和错误的  祖宗类
    只要是这个体系的 都可以使用他的成员方法


1.5 Throwable的成员方法
    方法名         说明
    public String getMessage(
        返回此throwable的详细消息字符串
    public String toString0
        返回此可抛出的简短描述
    public void printStackTrace0
        把异常的错误信息输出在控制台



 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }


    public static void method(){

        try {
            int[]  arr={1,2,3,4};
            System.out.println(arr[2]);
            System.out.println(arr[4]);
        }catch (ArrayIndexOutOfBoundsException e){


//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
            e.printStackTrace();




        }
    }

}