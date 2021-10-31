package HeiMa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/26 12:14
 * @Version 1.0

需求:设计-个方法，用于比较两个数组的内容是否相同
思路:
①定义两个数组，分别使用静态初始化完成数组元素的初始化
②定义一个方法，用于比较两个数组的内容是否相同
返回值类型: boolean
参数: int[] arr, int[] arr2
③比较两个数组的内容是否相同，按照下面的步骤实现就可以了
首先比较数组长度，如果长度不相同，数组内容肯定不相同,返回false
其次遍历，比较两个数组中的每一个元素,只要有元素不相同,返回false
最后循环遍历结束后，返回true


 */

public class a095_ShuZuNeiRongXiangTong {
    public static void main(String[] args) {

        //①定义两个数组，分别使用静态初始化完成数组元素的初始化
        int[] arr01={45,98,46,32,79,145,797,12,46,65};
        int[] arr02={54,98,64,32,79,145,797,12,46,65};

        boolean flag=compare(arr01 , arr02);
        System.out.println(flag);


    }

    //②定义一个方法，用于比较两个数组的内容是否相同
    /*
    * 两个明确
    *   返回值类型  boolean
    *   参数        int[] arr01 , int[]  arr02
    * */
    public static Boolean compare(int[] arr01 , int[] arr02 ){

        //③比较两个数组的内容是否相同，按照下面的步骤实现就可以了
        if (arr01.length!=arr02.length){
            return false;
        }

        //其次遍历，比较两个数组中的每一个元素,只要有元素不相同,返回false
        for (int i=0;i<arr01.length;i++){
            if (arr01[i]!=arr02[i]){
                return false;
            }
        }

        //最后循环遍历结束后，返回true
        return  true;

    }



}






        /*

        boolean a=true;


        for (int i=0;i<arr01.length;i++){


            if (  arr01.length!= arr02.length && arr01[i]!=arr02[i]){
                a= true;
            }
                a=false ;

        }

        return a;

    }
*/


