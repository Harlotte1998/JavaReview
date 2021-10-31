package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/25 12:42
 * @Version 1.0
 *


7.2方法参数传递(引用类型)

对于引用类型的参数，形式参数的改变,影响实际参数的值


 */

public class a083_FangFaCanShuChuanDiYinYongLeiXing {
    public static void main(String[] args) {

                int[] arr={12,56,64};
                System.out.println("调用change方法前"+arr[1]);
                change(arr);
                System.out.println("调用change方法后"+arr[1]);

            }

            public  static  void  change( int[] arr){
                arr[1]=200;

    }
}
