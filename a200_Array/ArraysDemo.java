package HeiMa.a200_Array;

import java.util.Arrays;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 16:50
 * @Version 1.0


这个类包含用于操作数组（如排序和搜索）的各种方法。
此类还包含一个静态工厂
可以将数组视为列表

4.2 Arrays类的概述和常用方法
    Arrays类包含用于操作数组的各种方法
        方法名     说明
    public static String toString(int[a)
        返回指定数组的内容的字符串表示形式
    public static void sort(int[] a)
        按照数字顺序排列指定的数组


    工具类的设计思想:
        ●构造方法用private修饰
        ●成员用 public static修饰;

 */

public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[]  arr={24,69,80,57,13};

        System.out.println("排序前"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后"+ Arrays.toString(arr));



    }
}
