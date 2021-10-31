package HeiMa;
//数组初始化之动态初始化
/*
    2.1数组初始化概述
        Java中的数组必须先初始化，然后才能使用
        所谓初始化:就是为数组中的数组元素分配内存空间,并为每个数组元素赋值
    2.2数组初始化方式
        ●动态初始化
        ●静态初始化

    2.3动态初始化
        动态初始化:初始化时只指定数组长度，由系统为数组分配初始值
        ●格式:数据类型[]变量名= new数据类型[数组长度];
        ●范例:int [] arr= new int[3];






 */
public class a059_ShuZuDongTaiChuShiHua {
    public static void main(String[] args) {
        int[] arr=new int [3];

        /*
        左边
            int:  说明数组中的类型是int类型
            [] :  说明这是一个数组
            arr:  这是数组的名称
        右边
            new：  为数组申请内存空间
            int:   说明数组中的元素类型是int类型
            [] :   说明这是一个数组
            3  ：   数组长度，其实就是数组中的元素个数

        * */
    }

}
