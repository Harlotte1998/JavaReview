package HeiMa;

/**
 * @Author Miracle LiuCe
 * @Date 2021/10/23 17:31
 * @Version 1.0
 *

3.数组元素访问
    3.1数组元素访问
    ●数组变量访问方式
    ●格式: 数组名
    ●数组内部保存的数据的访问方式
    ●格式: 数组名[索引]

    计算机中习惯编号从0开始

    ●索引是数组中数据的编号方式
    ●作用: 索引用于访问数组中的数据使用,数组名[索引]等同于变量名，是一种特殊的变量名

    特征①:索引从0开始
    特征②:索引是连续的
    特征③:索引逐-增加，每次加1


     *
 *
 */

public class a060_ShuZuYuanSuFangWen {
    public static void main(String[] args) {
        //动态初始化
        int[] arr=new int[3];
        //输出数组名
        System.out.println(arr);    //  [I@1b6d3586
        // arr 是数组名 也是  内存空间 地址值   new  新建 申请内存空间

        //输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
