package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/23 21:17
 * @Version 1.0
 */

public class a067_BianLi {
    public static void main(String[] args) {

        // 遍历数组

        int[] arr=new int[]{11,22,33,44,55};

        //最简单的方法
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println("++++++++++++++++++++++");

        //for 循环的方法
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);
        }


        System.out.println("++++++++++++++++++++++");

        // 获取数组元素个数
        //使用通用的遍历格式

        int[] arr02={11,22,33,44,55,66,77,88,99,100};

        for (int i=0;  i<  arr02.length   ;i++){

            System.out.println(arr02[i]);
        }


    }
}
