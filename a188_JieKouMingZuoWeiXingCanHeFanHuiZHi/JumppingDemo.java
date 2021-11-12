package HeiMa.a188_JieKouMingZuoWeiXingCanHeFanHuiZHi;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/10 19:43
 * @Version 1.0

1.3接口名作为形参和返回值
    ●方法的形参是接口名， 其实需要的是该接口的实现类对象
    ●方法的返回值是接口名， 其实返回的是该接口的实现类对象


 */

public class JumppingDemo {
    public static void main(String[] args) {
        //创建测试类对象  并调用方法
        JumppingOperator jo=new JumppingOperator();
        Jumpping j=new Cat();
        jo.useJumpping(j);


        //接口名作为返回值
        Jumpping j2=jo.getJumpping();
        j2.jump();
    }
}
