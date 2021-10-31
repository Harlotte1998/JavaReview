package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 21:29
 * @Version 1.0
 */

public class a068_ShuZuZuiZhi {
    public static void main(String[] args) {

        //获取最大值

        // 定义数组
        int[] arr={11,56,78,88,94,35,19,89};

        //1.定义一个变量  用于 保存 最大值   （或最小值）

        //2.取数值第一个数据作为变量的初始值
        int max=arr[0];
        //3.与数组中剩余的数据诸葛对比

        for (int x=1 ;x<arr.length;x++){
            if (arr[x] > max){
                max=arr[x];
            }
        }

        System.out.println(max);



    }
}
