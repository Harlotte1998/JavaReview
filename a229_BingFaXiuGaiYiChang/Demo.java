package HeiMa.a229_BingFaXiuGaiYiChang;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ：LC
 * @date ： 2021/11/22 12:11


需求:
我有一-个集合: List<String> list = new Arraylist<string>();
里面有三个元素: list. add( "hello");list. add( "world");list . add( "java");
遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，我就添加一个"javaee“元素，请写代码实现

2.3并发修改异常
    并发修改异常
        ●ConcurrentModificationException
    产生原因
        ●迭代器遍历的过程中 ,通过集合对象修改了集合中元素的长度，造成了迭代器获取元素中判断预期修改值和实际修改值不一-致
    解决方案
        ●用for循环遍历，然后用集合对象做对应的操作即可


 */
public class Demo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list=new ArrayList<String>();
        //添加元素
        list.add("hello");
        list.add("worid");
        list.add("java");

        System.out.println(list);


    /*
        //遍历集合，得到每一个元素，看有没有"world"这个元素，
        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            String next = it.next();
            if (next.equals("worid")){
                list.add("Javaee");
            }
        }
        报错
        ConcurrentModificationException

        * */

        for (int i = 0; i <list.size() ; i++) {
            String ss=list.get(i);
            if (ss.equals("worid")){
                list.add("javaee");
            }
        }


        //输出
        System.out.println(list);
    }
}
