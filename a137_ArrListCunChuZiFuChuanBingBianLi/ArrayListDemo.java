package HeiMa.a137_ArrListCunChuZiFuChuanBingBianLi;

import java.util.ArrayList;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 17:28
 * @Version 1.0


6案例:存储字符串并遍历
    需求:创建一个存储字符串的集合,存储3个字符串元素，使用程序实现在控制台遍历该集合
    思路:
        ①创建集合对象
        ②往集合中添加字符串对象
        ③遍历集合，首先要能够获取到集合中的每一个元素， 这个通过get(int index)方法实现
        ④遍历集合,其次要能够获取到集合的长度，这个通过size0方法实现
        ⑤遍历集合的通用格式
        for(int i=0; i<集合对象.size0);i++){
            集合对象.get(i)就是指定索引处的元素
        }


 */

public class ArrayListDemo {
    public static void main(String[] args) {

        //①创建集合对象
        ArrayList<String> array=new ArrayList<>();
        //②往集合中添加字符串对象
        array.add("hello");
        array.add("worid");
        array.add("java");
        array.add("100");
        array.add("age");
        //③遍历集合，首先要能够获取到集合中的每一个元素， 这个通过get(int index)方法实现
        for (int i = 0; i <array.size() ; i++) {
            String s=array.get(i);
            System.out.println(s);
        }
        //④遍历集合,其次要能够获取到集合的长度，这个通过size0方法实现
        //⑤遍历集合的通用格式

    }
}
