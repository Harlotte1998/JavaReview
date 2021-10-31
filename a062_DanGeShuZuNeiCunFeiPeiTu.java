package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 17:51
 * @Version 1.0












 */

public class a062_DanGeShuZuNeiCunFeiPeiTu {
    public static void main(String[] args) {


        //动态初始化
        int[] arr=new int[3];
        //输出数组名
        System.out.println(arr);    //  [I@1b6d3586

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        //给数组中的元素 赋值
        arr[0]=100;
        arr[1]=200;

        //再次输出数组名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
