package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 19:25
 * @Version 1.0

I 0案例:减肥计划
需求:输入星期数，显示今天的减肥活动
周一:跑步
周二:游泳
周三:慢走
周四:动感单车
周五:拳击
周六:爬山
周日:好好吃一顿


 */

public class a089_JianFeiJiHua {
    public static void main(String[] args) {
        System.out.println("输入星期数，显示今天的减肥活动");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        //对星期数进行判断
        if (i==1){
            System.out.println("星期一：跑步");
        } else if (i==2){
            System.out.println("周二:游泳");

        } else if (i==3){
            System.out.println("周三:慢走");

        } else if (i==4){
            System.out.println("周四:动感单车");

        }else if (i==5){
            System.out.println("周五:拳击");

        } else if (i==6){
            System.out.println("周日:好好吃一顿");

        } else if (i==7){

        }else {
            System.out.println("请输入正确语句");
        }

    }
}
