package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 17:14
 * @Version 1.0
 *

案例:数组最大值
    需求:设计一一个方法用于获取数组中元素的最大值，调用方法并输出结果
        思路:
        ①定义一个数组，用静态初始化完成数组元素初始化
        ②定义一个方法，用来获取数组中的最大值
        ③调用获取最大值方法，用变量接收返回结果
        ④把结果输出在控制台




 */

public class a085_ShuZuZuiDaZhi {
    public static void main(String[] args) {

        //①定义一个数组，用静态初始化完成数组元素初始化
        int[] arr={45,65,998,89,32,15,100,78};
        // ③调用获取最大值方法，用变量接收返回结果
        int number=arrMax(arr);
        //④把结果输出在控制台
        System.out.println("number"+number);
    }

    //②定义一个方法，用来获取数组中的最大值
    /*
    * 两个明确
    * 返回值类型     int
    * 参数          int[]  arr
    *
    * */
    public  static  int  arrMax(int[] arr){

        int Max=arr[0];

        for (int i=1;i<arr.length;i++){
            if (Max<arr[i]){
                Max=arr[i];
            }
        }

        return Max;

    }

}
