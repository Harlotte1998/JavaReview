package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 13:33
 * @Version 1.0
 *

4.3带返回值方法练习
    需求:设计-个方法可以获取两个数的较大值，数据来自于参数

    思路
        1:定义一个方法，用于获取两个数字中的较大数_
        2:使用分支语句分两种情况对两个数字的大小关系进行处理
        3:根据题设分别设置两种情况下对应的返回结果
        4:在main()方法中调用定义好的方法并使用变量保存
        5:在main()方法中调用定义好的方法并直接打印结果







 */

public class a077_DaiFanHuiZhiFangFaLianXi {
    public static void main(String[] args) {

        // 4:在main()方法中调用定义好的方法并使用变量保存
        int result=getMax(89,54);
        System.out.println("较大的值"+result);

        //5:在main()方法中调用定义好的方法并直接打印结果
        System.out.println("较大的值"+getMax(89,54));
    }
    //需求:设计-个方法可以获取两个数的较大值，数据来自于参数
    //1:定义一个方法，用于获取两个数字中的较大数
    public static  int getMax(int a,int b){
        //2:使用分支语句分两种情况对两个数字的大小关系进行处理
        if (a>b){
            //3:根据题设分别设置两种情况下对应的返回结果
            // 返回值 a
            return a;
        }else {
            // 返回值 b
            return b;
        }
    }
}
