package HeiMa.a221_CollectionJiHeDeGaiShuHeShiShiYong;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author ：LC
 * @date ： 2021/11/16 19:21

1.3 Collection集合概述和使用

    Collection集合概述
        ●是单例集合的顶层接口， 它表示一-组对象， 这些对象也称为Collection的元素
        ●JDK 不提供此接口的任何直接实现，它提供更具体的子接口(如Set和List) 实现

    创建Collection集合的对象
        ●多态的方式
        ●具体的实现类ArrayList


 */
public class Demo {
    public static void main(String[] args) {
//        创建Collection集合的对象
        Collection<String> c=new ArrayList<String>();
//        ●多态的方式
//        ●具体的实现类ArrayList

        //添加元素  使用的是 add方法
        c.add("hello");
        c.add("worid");
        c.add("java");

        System.out.println(c);
        /**

        * */



    }
}




