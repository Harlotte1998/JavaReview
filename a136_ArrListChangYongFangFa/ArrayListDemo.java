package HeiMa.a136_ArrListChangYongFangFa;

import java.util.ArrayList;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 17:28
 * @Version 1.0

1.3 ArrayList集合常用方法
                方法名                         说明
    public boolean remove(Object)       删除指定的元素，返回删除是否成功
    public E remove(int index)          删除指定索弓|处的元素，返回被删除的元素
    public E set(int index,E element)   修改指定索弓|处的元素，返回被修改的元素
    public E get(int index)             返回指定索弓|处的元素
    public int size()                   返回集合中的元素的个数


        在测试一个功能的时候把其他功能注释掉
        保证其他功能不受影响


 */

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array =new ArrayList<>();

        //添加元素
        array.add("hello");
        array.add("worid");
        array.add("java");
        array.add("100");
        array.add("age");

        //输出集合
        System.out.println("array: "+array);

        //public boolean remove(Object)       删除指定的元素，返回删除是否成功
//        System.out.println(array.remove("java"));    //true
//        System.out.println(array.remove("CCCCCC"));  //false

        //public E remove(int index) 删除指定索弓|处的元素，返回被删除的元素

//        System.out.println(array.remove(1));    //返回被删除的元素 worid
//        System.out.println(array.remove(5));    // 索引越界

        //public E set(int index,E element)   修改指定索弓|处的元素，返回被修改的元素
//        System.out.println(array.set(1,"javaee"));   //返回被修改的元素
//        System.out.println("array: "+array);
//        System.out.println(array.set(5,"javaee"));   // 索引越界
        //public E get(int index)             返回指定索弓|处的元素
//        System.out.println(array.get(0));   // hello  不改变集合原来的样子
//        System.out.println(array.get(1));   // worid  不改变集合原来的样子
//        System.out.println(array.get(2));   // java  不改变集合原来的样子
//        System.out.println(array.get(5));   //IndexOutOfBoundsException  数组越界

        //public int size()                   返回集合中的元素的个数
        System.out.println(array.size());

    }
}
