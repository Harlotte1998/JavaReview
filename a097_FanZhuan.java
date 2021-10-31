package HeiMa;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 14:17
 * @Version 1.0


案例:反转
    需求:已知-一个数组 arr = {19, 28, 37, 46, 50};  用程序实现把数组中的元素值交换，
    交换后的数组       arr= {50, 46, 37, 28, 19};  并在控制台输出交换后的数组元素。

分析:
    第1个元素和最后一个元素交换
    第2个元素和倒数第二二个元素交换
    第3个元素和倒数第三个元素交换

元素交换:
    假如数组开始索引|叫start,结束索引|叫end
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;

思路:
    ①定义-一个数组,用静态初始化完成数组元素的初始化
    ②循环遍历数组,这-次初始化语句定义两个索引变量， 判断条件是开始索引小于等于结束索引
    ③变量交换
    ④遍历数组



 */

public class a097_FanZhuan {
    public static void main(String[] args) {

/*

        int x=arr[0];
        arr[0]=arr[arr.length-1]
        arr[arr.length-1]=arr[0]

        int x=arr[0];
        arr[1]=arr[arr.length-2]
        arr[arr.length-2]=arr[2];




        int[] arr={11,22,33,44,55};

        for (int i=0;i<=arr.length/2-1;i++){
            int x=arr[i];

            arr[i]=arr[arr.length-i-1];
            int aa=arr[i];
            arr[arr.length-i-1]=x;
        }

        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+",");
        }

*/


                int[] arr={11,22,33,44,55};

                //调用反转的方法
                reverse(arr);


                //遍历数组
                printArray(arr);
    }


    // 反转数组的方法
    /*
    *两个明确:
        返回值类型: void
        参数: int[] arr

    * */
    public  static  void  reverse(int[] arr){
        // ①定义-一个数组,用静态初始化完成数组元素的初始化

        //  ②循环遍历数组,这-次初始化语句定义两个索引变量， 判断条件是开始索引小于等于结束索引
        for (int start=0,end=arr.length-1; start<=end;start++,end--){
            //变量交换
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }


    //④遍历数组  的方法
    /*
    *两个明确:
        返回值类型: void
        参数: int[] arr

    * */
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if (x==arr.length-1){
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x]+",");
            }
        }
        System.out.print("]");
    }


}
