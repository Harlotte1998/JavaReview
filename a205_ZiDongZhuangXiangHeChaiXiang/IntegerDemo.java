package HeiMa.a205_ZiDongZhuangXiangHeChaiXiang;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/12 20:50
 * @Version 1.0



5.4自动装箱和拆箱
    ●装箱: 把基本数据类型转换为对应的包装类类型
    ●拆箱: 把包装类类型转换为对应的基本数据类型

    Integer i = 100; // 自动装箱
    i += 200;   //i=i+200;  i+200自动拆箱;  i=i+200;是自动装箱

    注意:在使用包装类类型的时候，如果做操作，最好先判断是否为null
    我们推荐的是，只要是对象，在使用前就必须进行不为null的判断


 */

public class IntegerDemo {
    public static void main(String[] args) {
        //    ●装箱: 把基本数据类型转换为对应的包装类类型
        //    ●拆箱: 把包装类类型转换为对应的基本数据类型
        //Integer.valueOf(100);
        //100是个基本类型 通过Integer调用valueOf方法
        //就把 100 转换为对应的包装类类型
        //  Ctrl + Alt + V    自动生成 左边的内容
        //Integer i = Integer.valueOf(100);
        //上面的这个动作就叫装箱
        /*
        Integer ii=100;
        100是基本类型  ii是 对应的包装类 类型
        如果把 100 直接赋值给 ii  能够成功 这就叫做 自动装箱
        但是 100 是基本类型  ii 是引用类型  直接赋值是行的

        JDK5 以后   Integer i = Integer.valueOf(100);
        简化为   Integer ii=100;
        * */
        Integer ii=100;

        /*
        拆箱
        是把包装类类型转换为对应的 基本数据类型
        ii +=200;
        ii是引用类型  200是基本数据类型  ii+200   这个动作应该是做不了的
        我们平常这样做
        先把
        int ii；  转为 int 类型   也就是基本类型
        然后  再与 200做加法
        最后再赋值给 ii
        * */
        //ii.intValue();
        //这个方法就能把 ii 转为 int类型
        //ii.intValue()+200;
        //然后再加 200   这个结果就是 int类型
        //最后 再把   ii.intValue();+200;
        //赋值给 Integer 类型的 ii
        //ii=ii.intValue()+200;
        //这是 并不会报错  因为这里是 自动装箱
        //ii.intValue() 是把 引用类型  ii  转换为 基本类型
        //这叫做手动 拆箱

        //System.out.println(ii);

        /*
        自动拆箱
        下面的这个动作 隐含了 自动拆箱  和自动装箱
        * */
        ii+=200;
        System.out.println(ii);


        /*
        *
        Integer iii=null;
        iii+=300;
        * NullPointerException
        * 会报错
        * 因为 iii 已经是 null  了
        *相当于 iii  先调用了intValue()这么一个方法
        * null 调用 方法  肯定是空指针了
        *
        * 添加一个判断
        * */
        Integer iii=null;
        if (iii!=null){
            iii+=300;

        }

        /*
        * 在开发中如果是一个引用类型变量
        * 我们在使用之前最好先判断
        * */






    }
}
