package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 18:46
 * @Version 1.0

    6.1数组操作的两个常见小问题

        ●索引越界:访问了数组中不存在的索引对应的元素，造成索引|越界问题
        ●空指针异常:访问的数组已经不再指向堆内存的数据，造成空指针异常
        ●null: 空值，引用数据类型的默认值,表示不指向任何有效对象






 */

public class a066_ShuZuCaoZuoXiaoWenTi {
    public static void main(String[] args) {

        int[]  arr=new  int[3];
//         ●索引越界:访问了数组中不存在的索引对应的元素，造成索引|越界问题
        System.out.println(arr[2]);


        //  ●空指针异常
        //  把 null  赋值给数组
        arr=null;
        //  输出元素
        System.out.println(arr[0]);


    }
}
