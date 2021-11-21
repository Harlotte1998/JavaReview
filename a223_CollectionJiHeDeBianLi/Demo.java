package HeiMa.a223_CollectionJiHeDeBianLi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ：LC
 * @date ： 2021/11/21 19:22

1.5 Collection集合的遍历
    Iterator:迭代器，集合的专用遍历方式
        ●Iterator<E> iterator0: 返回此集合中元素的迭代器，通过集合的iterator0方法得到
        ●迭代器是通过集合的iterator0方法得到的， 所以我们说它是依赖于集合而存在的


    Iterator中的常用方法
        ●E next(:返回迭代中的下一一个元素
        ●boolean hasNext0:如果迭代具有更多元素，则返回true




public class Demo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();

        c.add("Java");
        c.add("html");
        c.add("css");
        c.add("JavaScript");

        System.out.println(c);


//        ●Iterator<E> iterator0: 返回此集合中元素的迭代器，通过集合的iterator0方法得到
        Iterator<String> it = c.iterator();


//        ●E next(:返回迭代中的下一一个元素
//        System.out.println(it.next());    //在控制台拿到第1个元素
//        System.out.println(it.next());    //在控制台拿到第2个元素
//        System.out.println(it.next());    //在控制台拿到第3个元素
//        System.out.println(it.next());    //在控制台拿到第4个元素

//        System.out.println(it.next());
        //第五次执行该语句  会报错 因为一共有四个元素 没有第五个元素

//
//        System.out.println("添加判断  +++++++++++ ");
//        if (it.hasNext()){
//            System.out.println(it.next());    //在控制台拿到第1个元素
//        }
//
//        if (it.hasNext()){
//            System.out.println(it.next());    //在控制台拿到第1个元素
//        }
//
//        if (it.hasNext()){
//            System.out.println(it.next());    //在控制台拿到第1个元素
//        }
//
//        if (it.hasNext()){
//            System.out.println(it.next());    //在控制台拿到第1个元素
//        }
//
//        //第五次执行该语句  不会报错
//        //虽然一共有四个元素 没有第五个元素
//        // 但是与一个 if 判断
//
//        if (it.hasNext()){
//            System.out.println(it.next());    //在控制台拿到第1个元素
//        }
//
//

//        ●boolean hasNext0:如果迭代具有更多元素，则返回true


        System.out.println("循环版++++++++");
        while (it.hasNext()){
//            System.out.println(it.next());

            //更规范的做法
            String s = it.next();
            System.out.println(s);

        }
    }
}
 */








