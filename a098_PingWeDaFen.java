package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 15:05
 * @Version 1.0

0案例:评委打分
    需求:在编程竞赛中，有6个评委为参赛的选手打分，分数为0 100的整数分。
    选手的最后得分为:去掉一个最高分和一 个最低分后的4个评委平均值(不考虑小数部分)。

思路:
    ①定义一个数组，用动态初始化完成数组元素的初始化，长度为6
    ②键盘录入评委分数
    ③由于是6个评委打分,所以，接收评委分数的操作，用循环改进
    ④定义方法实现获取数组中的最高分(数组最大值)，调用方法
    ⑤定义方法实现获取数组中的最低分(数组最小值)，调用方法
    ⑥定义方法实现获取数组中的所有元素的和(数组元素求和，调用方法)
    ⑦按照计算规则进行计算得到平均分
    ⑧输出平均分

 */

public class a098_PingWeDaFen {
    public static void main(String[] args) {
        //①定义一个数组，用动态初始化完成数组元素的初始化，长度为6
        int[] arr=new int[6];


        //②键盘录入评委分数
        Scanner sc=new Scanner(System.in);

        //③由于是6个评委打分,所以，接收评委分数的操作，用循环改进
        for (int i=0;i<6;i++){
            System.out.println("请输入第"+(i+1)+"评委的打分");
            arr[i]=sc.nextInt();
            // System.out.println(arr[i]);
        }

        //最大值测试
        int max=getMax(arr);

        System.out.println(max);

        //最小值测试
        int min=getMin(arr);

        System.out.println(min);

        //所有元素的和测试
        int sum=getSum(arr);

        System.out.println(sum);

        //⑦按照计算规则进行计算得到平均分
        int  avg=(sum-min-max)/(arr.length-2);

        //⑧输出平均分
        System.out.println("选手的最终分就是"+avg);



    }

    //④定义方法实现获取数组中的最高分(数组最大值)，调用方法
    /*
    两个明确:
    返回值类型: int
    参数: int[] arr
    */
    public static int getMax(int[] arr){

        System.out.println("+++++++++");

        int max=0;

        for (int j=1;j<arr.length;j++){
             max=arr[0];
            if (max<arr[j]){
                max=arr[j];
            }
        }

        return max;
    }

    //⑤定义方法实现获取数组中的最低分(数组最小值)，调用方法
    /*
    两个明确:
    返回值类型: int
    参数: int[] arr
    */

    public static int getMin(int[] arr){

        System.out.println("+++++++++");

        int min=0;

        for (int k=1;k<arr.length;k++){
            min=arr[0];
            if (min>arr[k]){
                min=arr[k];
            }
        }

        return min;
    }


    //
    /*
    两个明确:
    返回值类型: int
    参数: int[] arr
    */
    public  static int getSum(int[] arr){

        int sum=0;

        for (int m=0;m<arr.length;m++ ){
            sum=sum+arr[m];
        }

        return sum;

    }



}



