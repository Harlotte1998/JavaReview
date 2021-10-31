package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 13:01
 * @Version 1.0
 *
 *

3.4带参数方法练习
    需求:设计-个方法用于打印两个数中的较大数,数据来自于方法参数


//    ①定义一个方法，用于打印两个数字中的较大数，例如getMax()
//    ②为方法定义两个参数,用于接收两个数字
//    3:使用分支语句分两种情况对两个数字的大小关系进行处理
//    4:在main()方法中调用定义好的方法(使用常量)
//    5:在main()方法中调用定义好的方法(使用变量)


//调用方法的时候，人家要几个，你就给几个，人家要什么类型的，你就给什么类型的



 *
 *
 */

public class a075_DaiCanShuFangFaLianXi {
    public static void main(String[] args) {

        //常量调用
        getMax(89,45);

        //变量调用
        int a=10;
        int b=30;

        getMax(a,b);

    }





    public static  void  getMax(int a,int b){
        if (a>b){
            System.out.println(a+"是较大值");
        }else {
            System.out.println(b+"是较大值");
        }

    }

}
