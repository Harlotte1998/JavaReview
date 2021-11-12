package HeiMa.a189_NeiBuLei;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/10 20:24
 * @Version 1.0
 */

public class Outer {
    private  int num=100;

    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i=new Inner();
        i.show();
    }

}