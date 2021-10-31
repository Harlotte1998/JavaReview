package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 12:40
 * @Version 1.0
 *
 *

3.1 带参数方法定义
    格式：   public  static  void  方法名  (参数){ ... ... }
    格式(单个参数)：   public  static  void  方法名  (数据类型  变量名){ ... ... }
    范例(单个参数)：   public  static  void  isEvenNumber  (int number){ ... ... }
    格式(多个参数)：   public  static  void  方法名  (数据类型 变量名1 ,数据类型 变量名2 , ....){ ... ... }
    范例(多个参数)：   public  static  void  getMax  (int number1 , int number2 ){ ... ... }


    注意:
        ●方法定义时， 参数中的数据类型与变量名都不能缺少，缺少任意-一个程序将报错
        ●方法定义时，多个参数之间使用逗号(，)分隔


3.2带参数方法调用
    格式：       方法名(参数);

    格式(单个参数)   方法名(变量名/常数值);
    范例(单个参数)   getMax(5);

    格式(多个参数)   方法名(变量名/常数值1 , 变量名/常数值2 , 变量名/常数值3 );
    范例(多个参数)   getMax(5 , 6 , 9  );

    注意:
        ●方法调用时， 参数的数量与类型必须与方法定义中的设置相匹配，否则程序将报错


 */

public class a073_DaiCanShuFangFaDingYiHeDiaoYong {
    public static void main(String[] args) {

        //常量值的调用
        isEvenNumber(10);

        //变量的使用
        int number=188;
        isEvenNumber(number);

    }


    //需求:定义一个方法，该方法接收一一个参数，判断该数据是否是偶数
    public  static  void  isEvenNumber(int number){
        if(number%2==0){
            System.out.println(number+"是偶数");
        }else {
            System.out.println(false);
            System.out.println(number+"不是偶数");

        }
    }



}
