package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 10:53
 * @Version 1.0

1.1什么是方法
    ●方法 . (method)是将具有独立功能的代码块组织成为-个整体，使其具有特殊功能的代码集

注意:
    ●方法必须先创建才可以使用， 该过程称为方法定义
    ●方法创建后并不是 直接运行的，需要手动使用后才执行，该过程称为方法调用



 *
 *
 */

public class a069_FangFaGaiShu {
    public static void main(String[] args) {


        //定义两个变量
        int a=10;
        int b=56;
        //获取两个数中的最大值
        int max=a>b?a:b;
        //输出结果
        System.out.println("Max: "+max);


        // 上面的这段程序是输出 两个数中的最大值
        // 如果别的地方也需要 判断两个数中的 最大值
        // 就会反复粘贴这一段代码   非常冗余
        // 如果用方法封装起来  就可以  只调用
        //
        //


    }


}
