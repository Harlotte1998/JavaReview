package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 16:27
 * @Version 1.0

1.7类的定义
    类的重要性:是Java程序的基本组成单位
    类是什么:是对现实生活中-类具有共同属性和行为的事物的抽象,确定对象将会拥有的属性和行为

    类的组成:属性和行为
        ●属性: 在类中通过成员变量来体现(类中方法外的变量)
        ●行为:在类中通过成员方法来体现(和前面的方法相比去掉static关键字即可)

    类的定义步骤:
        ①定义类
        ②编写类的成员变量
        ③编写类的成员方法

    public  class  类名{
        //成员变量
        变量 1 的数据类型  变量1;
        变量 2 的数据类型  变量2;
        ...

        //成员方法
        方法1;
        方法2;
         ...
    }

        类名:
            手机(Phone)
        成员变量:
            品牌(brand)
            价格(price)
        成员方法:
            打电话(call)
            发短信(sendMessage)




public class Phone{
    //类的定义步骤:
       //①定义类


       //②编写类的成员变量
       //品牌(brand)
       String brand;
       //价格(price)
       int price;

       //③编写类的成员方法

        //成员方法
        public void call(){
            System.out.println("打电话");
        }

        //成员方法
        public void sendMessage(){
            System.out.println("发短信");
        }


}



 */