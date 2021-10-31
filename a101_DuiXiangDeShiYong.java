package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 17:21
 * @Version 1.0

1.8对象的使用
    创建对象
        格式   类名  对象名=new 类名();
        范例   Phone p=new Phone();

    使用对象
        1.使用成员变量
            格式  对象名.变量名
            范例  p.brand
        2.使用成员方法
            格式  对象名.方法名()
            范例  P.call







public class PhoneDemo{
    public static void main(String[] args) {
        //创建对象
        Phone p=new Phone();

        //使用对象
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
    }
}



 */