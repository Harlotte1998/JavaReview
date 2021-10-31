package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 12:51
 * @Version 1.0

案例: 数组遍历
需求:设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如: [11,22,33, 44, 55]

    思路:
        ①因为要求结果在-行上输出，所以这里需要在学习-个新的输出语句System.out.print( “内容”);
        System.out.printIn(“内容”); 输出内容并换行
        System.out.print(“内容”); 输出内容不换行
        System.out.println0;起到换行的作用
        ②定义一个数组,用静态初始化完成数组元素初始化
        ③定义一个方法，用数组遍历通用格式对数组进行遍历
        ④用新的输出语句修改遍历操作
        ⑤调用遍历方法


 */

public class a084_ShuZuBianLi {
    public static void main(String[] args) {

        //定义一个数组,用静态初始化完成数组元素初始化
        int[] arr={45,65,89,32,15,97,56};
        printArrey(arr);
    }

    // 定义一个方法，用数组遍历通用格式对数组进行遍历
    /*
    *两个明确
    *   返回值类型   不需要返回值    void
    *   参数         int  类型的数组   int[]  arr
    *
    * */

    public static  void  printArrey(int[] arr){

        System.out.print("[");

        for (int i=0;i<arr.length;i++){

            System.out.print(arr[i] +"  " );
        }

        System.out.print("]");

    }

}
