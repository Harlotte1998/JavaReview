package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 18:40
 * @Version 1.0
 *

5.1数组初始化之静态初始化
    静态初始化:初始化时指定每个数组元素的初始值，由系统决定数组长度

    格式:数据类型[]变量名= new数据类型[] {数据1,数据2,数据3....}
    范例:int[]  arr = new  int[]{1,2,3};
    简化格式:数据类型[]变量名= {数据1,数据2,数据......}
    范例:int[]  arr = new  {1,2,3};      //推荐使用








 */

public class a065_ShuZuJingTaiChuShiHua {
    public static void main(String[] args) {
        //定义数组  规范格式
        int[] arr=new int[]{12,65,78,564,45,158,0};

        //输出数组名
        System.out.println(arr);
        //输出数组元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
