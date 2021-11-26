package HeiMa.a231_ZenQiangForXunHuan;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：LC
 * @date ： 2021/11/25 18:31

2.5增强for循环
    增强for:简化数组和Collection集合的遍历

        ●实现Iterable接口的类允许其对象成为增强型 for语句的目标
        ●它是JDK5之后出现的， 其内部原理是-个Iterator迭代器


    增强for的格式
        ●格式:
            for(元素数据类型变量名:数组或者Collection集合){
                //在此处使用变量即可，该变量就是元素
            }


        ●范例:
            int[]arr= {1,2,3,4, 5};
            for(int i:arr){
                System.out.printn(i);
            }



 */
public class Demo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        for (int i :arr){
            System.out.println(i);
        }


        System.out.println("+++++++++++++++");

        String[] strArray={"AAA","BBB","CCC","DDD","EEE","FFF"};
        for (String j:strArray){
            System.out.println(j);
        }

        System.out.println("+++++++++++++++");

        List<String> li=new ArrayList<String>();
        li.add("Java");
        li.add("Web");
        li.add("CSS");
        li.add("Html");

        for (String  k:li ){
            System.out.println(k);
        }

        System.out.println("+++++++++++++++");
        //验证内部是一个Iterator  迭代器
/*
        for (String s: li) {
            if (s.equals("Web")){
                li.add("Javaee");
                //ConcurrentModificationException
            }
        }
*/





    }
}
