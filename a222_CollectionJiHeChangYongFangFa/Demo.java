package HeiMa.a222_CollectionJiHeChangYongFangFa;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ：LC
 * @date ： 2021/11/16 20:02

1.4 Collection集合常用方法
    方法名         说明
    boolean add(E e)
        添加元素

    boolean remove(Object o)
        从集合中移除指定的元素

    void clear()
        清空集合中的元素

    boolean contains(Objecto)
        判断集合中是否存在指定的元素

    boolean isEmpty0
        判断集合是否为空

    int size0
        集合的长度，也就是集合中元素的个数



 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
//        boolean add(E e)
//        添加元素
        c.add("hello");
        c.add("java");
        c.add("javaWeb");
        c.add("html");
        c.add("css");
        System.out.println(c);   //  [hello, java]


//        boolean remove(Object o)
//        从集合中移除指定的元素
        c.remove("java");
        System.out.println(c);   //  [hello, java]


//        int size0
//        集合的长度，也就是集合中元素的个数
        int size = c.size();
        System.out.println(size);


//        boolean contains(Objecto)
//        判断集合中是否存在指定的元素
        boolean b = c.contains("css");
        System.out.println(b);


//        void clear(
//        清空集合中的元素
        c.clear();
        System.out.println(c);   //  [hello, java]


//        boolean isEmpty0
//        判断集合是否为空
        boolean empty = c.isEmpty();
        System.out.println(empty);




    }
}
