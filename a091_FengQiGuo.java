package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 19:46
 * @Version 1.0

需求:朋友聚会的时候可能会玩一个游戏: 逢七过。规则是:从任意-个数字开始报数,
    当你要报的数字包含7或者是7的倍
    数时都要说:过。为了帮助大家更好的玩这个游戏,
    这里我们直接在控制台打印出1-100之间的满足逢七必过规则的数据。
    这样，大家将来在玩游戏的时候，就知道哪些数据要说:过。


 */

public class a091_FengQiGuo {
    public static void main(String[] args) {


        for (int i=1;i<101;i++){

            int a=i%10;         //个位数
            int b=i/10%10;      //十位数
            int c=i/10/10%10;   //百位数

            if (a==7 || b==7 || i%7==0    ){

                System.out.println("不能说的数字");
                System.out.println(i);

            }

        }
    }
}
