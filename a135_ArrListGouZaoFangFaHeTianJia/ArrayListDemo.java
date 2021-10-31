package HeiMa.a135_ArrListGouZaoFangFaHeTianJia;

import java.util.ArrayList;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 17:28
 * @Version 1.0

1.2 ArrayList构造方法和添加方法
            方法名                                       说明
    构造方法
        public ArrayList                        创建一个空的集合对象
    添加方法
        public boolean add(E e)                 将指定的元素追加到此集合的末尾
        public void add(int index,E element)    在此集合中的指定位置插入指定的元素


 */

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建-个空的集合对象
        // <String>  表示集合的类型  这个集合以后存储 String类型的元素
        ArrayList<String>  array=new ArrayList<String>();

        //输出集合
        System.out.println("array："+array);    //  []  此时没有元素在里面  如果有的话 会在 中括号里面显示出来

        //添加元素   public boolean add(E e) 将指定的元素追加到此集合的末尾
        //   public boolean add(E e)  会返回一个 boolean值 来表示 是否添加成功
        System.out.println(array.add("hello"));    //  输出一个  true  这里输出的是 array.add 是否添加成功
        //所以没必要 在输出array.add("hello");  的结果

        //直接调用
        array.add("hello");
        array.add("worid");

        //输出集合
        System.out.println("array: "+array);

        //public void add(int index,E element) 在此集合中的指定位置插入指定的元素
        //在 第 1 个元素后面 添加元素
        array.add(1,"java");
        System.out.println("array: "+array);

        //没有第五个元素 会直接报错  IndexOutOfBoundsException
        //集合的 索引越界
//        array.add(5,"DuoYuDe");
//        System.out.println("array: "+array);



    }
}
