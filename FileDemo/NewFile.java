package FileDemo;

import java.io.File;
import java.util.Scanner;

public class NewFile {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//
//        System.out.println("请输入上级文件夹的位置");
//        String ParentFolder=sc.nextLine();
//
//        System.out.println("请输入通用格式");
//        String CommonFormat=sc.nextLine();


        System.out.println("请输入文件夹的起始编号");
        int a=sc.nextInt();

        System.out.println("请输入文件夹的结束编号");
        int b=sc.nextInt();


        for (int i = a; i <b ; i++) {



            File file1 = new File("F:\\About_Java/IDEAWorkSpace/IDEAWorkSpace01/HeiMa/src/HeiMa/a"+i+"_");



            if (file1.mkdirs()) {
                System.out.println("多级层文件夹创建成功！创建后的文件目录为：" + file1.getPath() + ",上级文件为:" + file1.getParent());

            }

        }


    }

}
