package HeiMa.a235_ListJiHeZiLeiDeTeDian;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

/**
 * @author ：LC
 * @date ： 2021/11/25 19:38

2.11 List集合子类特点
        List集合常用子类: ArrayList, LinkedList
            ●ArrayList: 底层数据结构是数组，查询快，增删慢
            ●LinkedList: 底层数据结构是链表，查询慢，增删快
        练习:
            分别使用ArrayList和LinkedList完成存储字符串并遍历


 */
public class ListDemo {
    public static void main(String[] args) {


        //创建ArrayList  集合对象
        ArrayList<String> array = new ArrayList<String>();
        //添加元素
        array.add("Hello");
        array.add("Worid");
        array.add("Java");
        array.add("Html");


        //遍历输出
        //增强for循环
        for (String i: array){
            System.out.println(i);
        }
        System.out.println("++++++++++++++");
        LinkedList<String> ll=new LinkedList<String>();

        ll.add("AAAA");
        ll.add("BBBB");
        ll.add("CCCC");
        ll.add("DDDD");

        for(String j:ll){
            System.out.println(j);
        }
        //
        //

    }
}
