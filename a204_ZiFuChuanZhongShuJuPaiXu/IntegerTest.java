package HeiMa.a204_ZiFuChuanZhongShuJuPaiXu;

import java.util.Arrays;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/12 18:29
 * @Version 1.0
 * <p>
 * 案例:字符串中数据排序
 * 需求:有一个字符串: "91 27 46 38 50”，
 * 请写程序实现最终输出结果是: "27 38 46 50 91"
 * 思路:
 * ①定义一个字符串
 * ②把字符串中的数字数据存储到一个int类型的数组中   难点
 * ●得到字符串中每一个数字数据?
 * public StringO split(String regex)
 * ●定义一个int数组，把String[]数组中的每一个元素存储到int数组中
 * public static int parselnt(String s)
 * ③对int数组进行排序
 * ④把排序后的int数组中的元素进行拼接得到一个字符串，这里拼接采用StringBuilder来实现
 * ⑤输出结果
 */

public class IntegerTest {
    public static void main(String[] args) {

        //①定义一个字符串
        String s = "91 27 46 38 50 ";

        //②把字符串中的数字数据存储到一个int类型的数组中   难点
        /*
        通过split()  方法 得到一个 String[]  数组
        * */

        String[] strArray = s.split(" ");

        //遍历一下String[]  检验里面有没有数据
/*        for (int i = 0; i <strArray.length ; i++) {
            System.out.println(arr[i]);
        }
        */

        //定义一个int数组，把String[]数组中的每一 个元素存储到int数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            //把String[]数组中的每一 个元素存储到int数组中
            //arr[i]=strArray[i];
            // arr[i] 是int类型 strArray[i]是String 类型  直接赋值 不行
            //使用 Integer.parseInt   方法
            arr[i] = Integer.parseInt(strArray[i]);


        }
/*      //遍历检验一下
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }  */

        //③对int数组进行排序
/*        //方案一
        for (int i = 0; i <arr.length-1 ; i++) {
            int a=0;
            if (arr[i+1]<arr[i]){
                a=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=a;
            }
        }
        */

        //方案二  直接调用方法
        Arrays.sort(arr);

/*
        //遍历检验一下
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + "  ");
        }
*/

        //④把排序后的int数组中的元素进行拼接得到一个字符串，
        //这里拼接采用StringBuilder来实现

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            //判断是不是第一个元素
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                //不是最后一个元素  每个元素后面加一个 空格
                sb.append(arr[i]).append(" ");
            }
        }

        String result = sb.toString();

        //输出拼接的结果
        System.out.println("result年: "+result);

    }
}
