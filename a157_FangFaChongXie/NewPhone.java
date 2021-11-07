package HeiMa.a157_FangFaChongXie;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/2 20:00
 * @Version 1.0

 新手机
 */

public class NewPhone extends phone{



    //  新功能
    @Override     //添加这个注解 就可以辅助检查  重写方法   方法声明的正确性   即 方法名正确与否
    //方法重写  与父类名字相同的方法   方法重写
    public void call(String name) {
        System.out.println("开启视频功能");
//        System.out.println("给" + name + "打电话");
        //因为继承父类 phone  所以没必要再写父类中的方法
        // 只需要使用 super 把参数传递回去就好  就能使用父类的功能
        super.call(name);

    }


}
