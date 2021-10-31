package HeiMa.a124_ZiFuChuanPinJie;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 11:04
 * @Version 1.0

案例:拼接字符串
    需求:定义一个方法，把int数组中的数据按照指定的格式拼接成-个字符串返回，调用该方法,
        并在控制台输出结果。例如，数组为int[] arr= {1,2,3};，
        执行方法后的输出结果为: [1,2, 3]

    思路:
        ①定义一个int类型的数组，用静态初始化完成数组元素的初始化
        ②定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。
            返回值类型String,参数列表int[] arr
        ③在方法中遍历数组,按照要求进行拼接
        ④调用方法，用一个变量接收结果
        ⑤输出结果



 */

public class StringTest {
    public static void main(String[] args) {
        //①定义一个int类型的数组，用静态初始化完成数组元素的初始化
        int[] arr={1,2,3,4,5,6,7};

        //调用方法，用一个变量接收结果
        String s = arrayToString(arr);
        System.out.println("s:"+s);


    }

    //②定义一个方法，用于把int数组中的数据按照指定格式拼接成一个字符串返回。
    /*
    * 两个明确
    *   返回值类型：  return String
    *   参数：    int[]  arr
    * */
    public static  String arrayToString(int[] arr){
        //先创建一个空白的字符串
        String s="";

        //输出时  第一个中括号
        s=s+"[";

        //在方法中遍历数组,按照要求进行拼接
        for(int i=0;i<arr.length;i++){
            //判读是不是最后一个 字符 是的话 不加 " , "
            if (i==arr.length-1){
                s=s+arr[i];
            } else {          //不是最后一个 字符   则 加上  " , "
                s=s+arr[i];
                s=s+"," ;
            }
        }

        //输出时  最后面的一个中括号
        s=s+"]";


        //返回结果
        return s;
    }


}
