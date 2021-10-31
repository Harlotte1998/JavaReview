package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 17:44
 * @Version 1.0
 *
4.内存分配
    4.1 Java中内存分配
        Java程序在运行时，需要在内存中分配空间。为了提高运算效率,就对空间进行了不同区域的划分，
        因为每一片区域都有特定的处理数据方式和内存管理方式。



        数组在初始化时，会为存储空间添加默认值
        整数:默认值0
        浮点数:默认值0.Q
        布尔值:默认值false
        字符:默认值是空字符
        引用数据类型:默认值是null


    ●栈内存:存储局部变量
        定义在方法中的变量，例如: arr
        使用完毕，立即消失
    ●堆内存:存储new出来的内容(实体,对象)
        数组在初始化时，会为存储空间添加默认值
        整数: 0
        浮点数: 0.0
        布尔: false
        字符:空字符
        引用数据类型: null
    每一个new出来的东西都有一个地址值
    使用完毕，会在垃圾回收器空闲时被回收


 */

public class a061_NeiCunFeiPei {
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
