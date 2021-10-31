package HeiMa;

import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 13:41
 * @Version 1.0

案例:查找
需求:已知-个数组arr = {19, 28, 37, 46, 50};键盘录入-个数据，查找该数据在数组中的索引,
并在控制台输出找到的索引值。

思路:
    ①定义-个数组,用静态初始化完成数组元素的初始化
    ②键盘录入要查找的数据,用-个变量接收
    ③定义一个索引变量，初始值为-1
    ④遍历数组，获取到数组中的每一个元愫
    ⑤拿键盘录入的数据和数组中的每一-个元素进行比较,如果值相同，就把该值对应的索引|赋值给索引变量，并结束循环
    ⑥输出索引|变量



 */

public class a096_ChaZhao {
    public static void main(String[] args) {

/*
        //在Main  方法里面直接写

        int[] arr={45,65,78,99,13,98,31};

        Scanner sc=new Scanner(System.in);
        //请输入数据
        System.out.println("请输入数据");
        int number=sc.nextInt();

        //定义一个索引变量  初始值为 -1
        int index=-1;

        //遍历数组  获取到数组中的每一个元素
         for(int i=0;i<=arr.length;i++){
                //拿键盘录入的数据和数组中的每一个元素进行比较，
                //如果值相同 那就把该值对应的索引赋值给索引变量

                if (arr[i]==number){
                    index=i;
                    break;
                }
         }

         //输出索引变量
        System.out.println(i);

    }

*/

        //采用方法的写法

        int[] arr={45,65,78,99,13,98,31};

        Scanner sc=new Scanner(System.in);
        //请输入数据
        System.out.println("请输入数据");
        int number=sc.nextInt();

        int x=getIndex(arr, number);

        System.out.println(x);


    }


        //查找指定的数据在数组中的索引
            /*
                两个明确:
                返回值类型: int
                参数: int[] arr, int number
            */
        public static  int getIndex(int[] arr, int number){
                int index=-1;

                //遍历数组  获取到数组中的每一个元素
                for(int i=0;i<=arr.length;i++){
                    //拿键盘录入的数据和数组中的每一个元素进行比较，
                    //如果值相同 那就把该值对应的索引赋值给索引变量

                    if (arr[i]==number){
                        index=i;
                        break;
                    }
                }

                return index ;

            }

}
