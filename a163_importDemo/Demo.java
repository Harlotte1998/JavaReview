package HeiMa.a163_importDemo;


import HeiMa.a163_import.Teacher;
import java.util.Scanner;



/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 10:53
 * @Version 1.0

    2.1导包的概述和使用
            使用不同包下的类时，使用的时候要写类的全路径,写起来太麻烦了
            为了简化带包的操作, Java就提供了导包的功能
        导包的格式

            ●格式: import 包名;
            ●范例: import cn.itcast.Teacher





 */

public class Demo {
    public static void main(String[] args) {

/*
//    Teacher t=new Teacher();   这样会报错
        HeiMa.a163_import.Teacher t =new HeiMa.a163_import.Teacher();
        t.teach();



        java.util.Scanner sc=new java.util.Scanner(System.in);


 */
        Teacher t =new Teacher();
        Scanner sc=new Scanner(System.in);








    }



}
