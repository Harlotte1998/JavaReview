package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 17:02
 * @Version 1.0
 *
6.方法重载

//方法重载示例

public  class Methodemo{

    //两个数据求和方法
    public static int sum( int a , int b ){
        return a+b;
    }

    //三个数据求和方法
    public static int sum(int a ,int b ,int c ){
        return a+b+c;
    }

}


    6.1方法重载概述
        方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载

        多个方法在同一一个类中
        多个方法具有相同的方法名
        多个方法的参数不相同，类型不同或者数量不同

    6.2方法重载特点
        ●重载仅对应方法的定义， 与方法的调用无关，调用方式参照标准格式
        ●重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，
        换句话说不能通过返回值来判定两个方法是否相互构成重载

    在调用的时候，Java虛 拟机会通过参数的不同来区分同名的方法


//不是方法重载   虽然两个方法的返回值不同   但是重载与返回值无关
//重载只与  参数个数    方法名  有关   进行识别，与返回值无关，
public  class Methodemo{

    //两个数据求和方法
    public static int sum( int a  ){
        //方法体
    }

    //三个数据求和方法
    public static void sum(int a  ){
        //方法体
    }

}



// 参数值数量不同   方法名相同   返回值不同
//  是方法重载
public  class Methodemo{

    //两个数据求和方法
    public static int sum( int a  ){
        //方法体
    }

    //三个数据求和方法
    public static void sum(int a  ){
        //方法体
    }

}


// 参数值类型不同   方法名相同   返回值不同
//  是方法重载
public  class Methodemo{

    //两个数据求和方法
    public static int sum( int a  ){
        //方法体
    }

    //三个数据求和方法
    public static void sum(double a  ){
        //方法体
    }

}


// 参数值类型不同   方法名相同   返回值不同
//  是方法重载
public  class Methodemo{

    //两个数据求和方法
    public static int sum( int a  ){
        //方法体
    }

    //三个数据求和方法
    public static void sum(double a  ){
        //方法体
    }

}









 */

public class a080_FangFaChongZai {
    public static void main(String[] args) {
        // 调用方法
        int result=sum(10,20);
        System.out.println(result);

        double result01=sum(10.2,20.7);
        System.out.println(result01);

        int result02=sum(10,20 ,70);
        System.out.println(result02);
    }

    //需求1:求两个int类型数据和的方法
    public  static  int sum(int a,int b){
        return a+b;
    }

    //需求2:求两个double类型数据和的方法
    public  static  double sum(double a,double b){
        return a+b;
    }

    //需求3:求三个int类型数据和的方法
    public  static  int sum(int a,int b ,int c){
        return  a+b+c;
    }




}
