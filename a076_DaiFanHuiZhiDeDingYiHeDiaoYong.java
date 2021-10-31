package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 13:13
 * @Version 1.0
 *

 4.1 带返回值方法定义
    格式  public  static  数据类型   方法名(参数){
                return 数据;
         }
    范例1  public  static  boolean   isEvenNumber(int number){
                return   true;
            }

    范例2  public  static  int   getMax(int a,int b){
                return 100 ;
            }

    注意:
        方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错


4.2带返回值方法调用
    格式1:
        方法名(参数);
    范例:
        isEvenNumber(5 );

    格式2:
        数据类型  变量名=方法名(参数);
        boolean  flag=isEvenNumber(5);

    注意:
        ●方法的返回值通常 会使用变量接收，否则该返回值将无意义





 */

public class a076_DaiFanHuiZhiDeDingYiHeDiaoYong {
    public static void main(String[] args) {
        // 1.方法名(参数)
        //isEvenNumber(88);
        //此时的 isEvenNumber 代表返回的 false
        //没有使用变量接收，该返回值将无意义

        // 2. 数据类型  变量名=方法名(参数);
        boolean flag=isEvenNumber(88);
        System.out.println(flag);
        //  输出 true
    }

    //需求:定义一个方法，该方法接收-一个参数，判断该数据是否是偶数，并返回真假值

    public  static  boolean   isEvenNumber(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }


    }

}
