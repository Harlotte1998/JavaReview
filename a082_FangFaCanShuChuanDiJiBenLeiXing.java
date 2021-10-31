package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/24 17:50
 * @Version 1.0
 *

7.1方法参数传递(基本类型)

对于基本数据类型的参数，形式参数的改变,不影响实际参数的值


public  class ArgDemo01{
    public  static  void  main(){
        int number=100;
        System.out.printl("调用change方法前"+number);
        change(number);
        System.out.printl("调用change方法后"+number);

    }

    public  static  void  change( int number){
        number=200;
    }

}

//首次输出 100
//第二次输出 100




 */

public class a082_FangFaCanShuChuanDiJiBenLeiXing {
    public static void main(String[] args) {
        
    }
}
