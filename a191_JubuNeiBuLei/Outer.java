package HeiMa.a191_JubuNeiBuLei;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 13:21
 * @Version 1.0
 */

public class Outer {

    private int num=10;

    public void method(){

        //局部变量
        int num2=20;

        //局部内部类
        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);
            }
        }

        Inner  i=new Inner();
        i.show();

    }
}
