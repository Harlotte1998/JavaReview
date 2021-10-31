package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 18:13
 * @Version 1.0
 */

public class a064_DuoGeShuZuZhiXiangXiangTongNeiCun {
    public static void main(String[] args) {

        //动态初始化 数组
        int[] arr =new int[3];

        arr[0]=100;
        arr[1]=200;
        arr[2]=300;

        //输出数组名与数组元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //定义第二个数组指向第一个数组
        //把第一个数组arr的  ！！！地址值！！！ 赋值给  第二个数组
        //arr  是一个地址值
        int arr02[]=arr;

        // 通过arr02 索引值  修改 元素值
        arr02[0]=111;
        arr02[1]=222;
        arr02[2]=333;

        /*
        两个数组指向相同时，任意一个数组修改元素值  都会修改堆内存
        其他数组的元素值也会被修改

        */


        //输出两个数组的名及元素
        System.out.println(arr);
        System.out.println(arr02);

        System.out.println(arr[0]);
        System.out.println(arr02[0]);

        System.out.println(arr[1]);
        System.out.println(arr02[1]);

        System.out.println(arr[2]);
        System.out.println(arr02[2]);



    }
}
