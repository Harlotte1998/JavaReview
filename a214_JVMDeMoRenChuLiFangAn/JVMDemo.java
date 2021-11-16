package HeiMa.a214_JVMDeMoRenChuLiFangAn;

/**
 * @author ：LC
 * @date ： 2021/11/15 19:12


1.2 JVM的默认处理方案
    如果程序出现了问题，我们没有做任何处理，最终JVM会做默认的处理
    ●把异常的名称， 异常原因及异常出现的位置等信息输出在了控制台
    ●程序停止执行


 */
public class JVMDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");

    }


    public static void method(){
        int[]  arr={1,2,3,4};
        System.out.println(arr[2]);  //这是一个正确的
        System.out.println(arr[4]);  //这是一个错误的  数组越界
        /*ArrayIndexOutOfBoundsException:
        *
        *
        * */
    }

}
