package HeiMa.a224_JiHeDeShiYongBuZhou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author ：LC
 * @date ： 2021/11/21 20:21
 */
/*  步骤1:创建集合对象
    步骤2:添加元素
            步骤2.1:创建元素
            步骤2.2:添加元素到集合
            合并:添加元素到集合
    步骤3:遍历集合
            步骤3.1:通过集合对象获取迭代器对象
            步骤3.2:通过迭代器对象的hasNext ()方法判断是否还有元素
            步骤3.3:通过迭代器对象的next ()方法获取下一个元素
*/

public class Demo{
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();   //步骤1:创建集合对象
        //步骤2:添加元素
        String s="Java";                           //步骤2.1:创建元素
        c.add(s);                                  //步骤2.2:添加元素到集合
        c.add("Python");                           //合并:添加元素到集合
        //步骤3:遍历集合
        Iterator<String> it=c.iterator();         //步骤3.1:通过集合对象获取迭代器对象
        while (it.hasNext()){                      //步骤3.2:通过迭代器对象的hasNext ()方法判断是否还有元素
            String str=it.next();                  //步骤3.3:通过迭代器对象的next ()方法获取下一个元素
            System.out.println(str);
        }
    }
}