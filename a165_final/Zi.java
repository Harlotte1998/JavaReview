package HeiMa.a165_final;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 11:33
 * @Version 1.0
 */


                    //因为 父类 被final修饰 所以不能继续被继承
public class Zi /*extends Fu  */  {
/*
    @Override
    public void mether(){
        System.out.println(" Zi  method");
    }

   */


    public final int age= 20;

    public void show(){
        //重新赋值  100
//        age=100;
        //被 final 修饰的成员变量变为常量   不能被继续赋值
        System.out.println(age);
    }







}
