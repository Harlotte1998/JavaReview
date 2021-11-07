package HeiMa.a162_package;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/4 19:44
 * @Version 1.0

 修饰符
     包
     导包
     修饰符


1.1包的概述和使用
    其实就是文件夹
    作用:对类进行分类管理
    包的定义格式
        ●格式: package包名;       (多级包用.分开)
        ●范例: package com.itheima;


带包的Java类编译和执行
●手动建包:
    按照以前的格式编译java文件 javac HelloWorldjava
    手动创建包   在E盘建立文件夹com,然后在com下建立文件夹itheima
    把class文件放到包的最里面 把HelloWorld.class文件放到com下的itheima这个文件夹下
    带包执行    java com.itheima.HelloWorld
●自动建包: javac -d . HelloWorldjava
    java com.itheima.HelloWorld



 */

public class PackageDemo {
}
