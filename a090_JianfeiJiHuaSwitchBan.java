package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 19:36
 * @Version 1.0

需求:输入星期数，显示今天的减肥活动
    周一:跑步
    周二:游泳
    周三:慢走
    周四:动感单车
    周五:拳击
    周六:爬山
    周日:好好吃一顿
思路:
    1:键盘录入-个星期数，用一个变量接收
    2:对星期数进行判断，这里用switch 语句实现
    3:在对应的语句控制中输出对应的减肥活动
导包:
    1:手动导包





 */

public class a090_JianfeiJiHuaSwitchBan {
    public static void main(String[] args) {
        //
        Scanner sc=new Scanner(System.in);

        //键盘录入一个数据   用一个变量进行接收
        System.out.println("请输入一个星期数");
        int week=sc.nextInt();

        //对星期数进行判断
        switch (week){
            case 1:
                System.out.println("周一:跑步");
                break;
            case 2:
                System.out.println("周二:游泳");
                break;
            case 3:
                System.out.println("周三:慢走");
                break;
            case 4:
                System.out.println("周四:动感单车");
                break;
            case 5:
                System.out.println("周五:拳击");
                break;
            case 6:
                System.out.println("周六:爬山");
                break;
            case 7:
                System.out.println("周日:好好吃一顿");
                break;
            default:
                System.out.println("你输入的星期数有误");
        }
    }
}
