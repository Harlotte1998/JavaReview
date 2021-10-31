package HeiMa.a131_ZiFuChuanPinJieShengJiBan;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 15:56
 * @Version 1.0

0案例: 拼接字符串
    需求:定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，并在控制台
    输出结果。例如，数组为int]arr = {1,2,3};,执行方法后的输出结果为: [1,2, 3]

思路:
    ①定义一个int类型的数组，用静态初始化完成数组元素的初始化
    ②定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。 返回值类型String,参数列表int[] arr
    ③在方法中用StringBuilder按照要求进行拼接，并把结果转成String返回
    ④调用方法，用一个变量接收结果


 */

public class StringDemo {
    public static void main(String[] args) {
        //①定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr={80,90,70,60,50,40};
        //调用方法，用一个变量接收结果
        String  sb2=arrToString(arr);
        //输出结果
        System.out.println(sb2);
    }

    /*
    * 定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回，
      调用该方法，并在控制台输出结果
      两个明确
        返回值类型   String  s1
        参数        int[]   arr
     */
    public  static  String  arrToString(int[]  arr){
        StringBuilder sb1=new StringBuilder();

        sb1.append("[");
        for (int i=0;i<arr.length;i++){
            //如果是最后一个 就直接拼接  不用加 逗号
            if (i==arr.length-1){
                //StringBuilder  拼接的方法
                sb1.append(arr[i]);
            //如果不是最后一个 就在 每个字符后面 加一个 逗号 " , " 用来分隔
            }else {
                sb1.append(arr[i]).append(", ");
            }
        }
        sb1.append("]");

        //创建一个空的 字符串 来接收  转换后的  string
        String k= sb1.toString();

        return  k;

    }


}
