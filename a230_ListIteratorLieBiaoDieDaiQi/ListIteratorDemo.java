package HeiMa.a230_ListIteratorLieBiaoDieDaiQi;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author ：LC
 * @date ： 2021/11/22 19:32

2.4 Listlterator
    Listlterator:列表迭代器
        ●通过List集合的listlterator()方法得到， 所以说它是List集合特有的迭代器
        ●用于允许程序员沿任一 方向遍历列表的列表迭代器，在迭代期间修改列表，并获取列表中迭代器的当前位置
    Listlterator中的常用方法
        ●E next0:返回迭代中的下一个元素
        ●boolean hasNext0:如果迭代具有更多元素，则返回true
        ●E previous():返回列表中的上-个元素
        ●boolean hasPrevious0: 如果此列表迭代器在E相反方向遍历列表时具有更多元素，则返回true
        ●void add(E e):将指定的元素插入列表


 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list=new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("worid");
        list.add("JAVA");


/*
        //通过List集合的listlterator()方法得到
        ListIterator<String> li = list.listIterator();


        //正向遍历 一般不会用
        while(li.hasNext()){
            String next = li.next();
            System.out.println(next);
        }

        System.out.println("+++++++++++++");

        //逆向遍历     一般不会用
        while (li.hasPrevious()){
            String s=li.previous();
            System.out.println(s);
        }

*/

        //获取列表迭代器
        ListIterator<String> lit=list.listIterator();
        while (lit.hasNext()){
            String next = lit.next();
            if (next.equals("worid")){
                lit.add("Javaee");
            }
        }
        System.out.println(list);
    }
}







