package HeiMa.a199_ArrayMaoPaoPaiXuYuanLi;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 16:11
 * @Version 1.0
 */

public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[]  arr={24,69,80,57,13};
        System.out.println("排序前     "+arrayToString(arr));

/*
        //第一次比较
        for (int i = 0; i <arr.length -1-0; i++) {

            *//*
            arr[i]前面的数  比 arr[i+1]后面的数  大 就交换
            * *//*
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        System.out.println("第一次比较后 "+arrayToString(arr));
        //最大的数据 出现在 最后面

        //第二次比较
        for (int i = 0; i <arr.length -1-1; i++) {

            *//*
            arr[i]前面的数  比 arr[i+1]后面的数  大 就交换
            * *//*
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        System.out.println("第二次比较后 "+arrayToString(arr));


        //第三次比较
        for (int i = 0; i <arr.length -1-2; i++) {

            *//*
            arr[i]前面的数  比 arr[i+1]后面的数  大 就交换
            * *//*
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第三次比较后 "+arrayToString(arr));


        //第四次比较
        for (int i = 0; i <arr.length -1-3; i++) {

            *//*
            arr[i]前面的数  比 arr[i+1]后面的数  大 就交换
            * *//*
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第四次比较后 "+arrayToString(arr));
   */
        //代码优化
        for (int j = 1; j <arr.length ; j++) {
            for (int i = 0; i <arr.length -j; i++) {
                //arr[i]前面的数  比 arr[i+1]后面的数  大 就交换
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            System.out.println("第"+j+"次比较后 "+arrayToString(arr));
        }


    }


    //把数组中的元素按照指定的规则组成一个字符串  [元素1，元素2，元素3  ....]
    public static String arrayToString(int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i <arr.length ; i++) {
            if (i==arr.length-1){
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" , ");
            }
        }

        sb.append("]");
        String s=sb.toString();
        return s;
    }

}
