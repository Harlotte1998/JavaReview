package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 15:24
 * @Version 1.0

    成员变量:类中方法外的变量
        String name;
        int  age;



    局部变量:方法中的变量
        int i=0;
        int j=0;

3.2成员变量和局部变区别

    区别              成员变量                    局部变量
类中位置不同      类中方法外               方法内或者方法声明上
内存中位置不同     堆内存                  栈内存
生命周期不同      随着对象的存在而存在，     随着方法的调用而存在
                随着对象的消失而消失   ，   随着方法的调消失而消失用完毕而消失
初始化值不同      有默认的初始化值          没有默认的初始化值，必须先定义，
                                         赋值，才能使用


 */

public class a106_ChengYuanBianLiangHeJuBuBianLiang {

    //成员变量
    String name;
    int  age;

    //成员方法
    public  void   study(){

        int i=0;
        System.out.println("学习");
    }

    public  void   doHomework(){
        int j=0;
        System.out.println("回家做作业");
    }
}
