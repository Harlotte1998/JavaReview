package HeiMa.a112_GouZaoFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 17:16
 * @Version 1.0


5.1构造方法概述
        构造方法是一种特殊的方法
        作用:创建对象


        格式
        public  class 类名{
            修饰符  类名(参数){

            }
        }



        修饰符一般用  public

        功能:主要是完成对象数据的初始化



        public class Student{
            public static void main(String[] args) {
                Student s1=new Student();
            }
        }

        //无参的构造方法
        public  class  Student{
            public  Student(){
                //构造方法内书写的内容
            }
        }

 */




public class Student {

    private String name;
    private int age;

    //无参的构造方法
    public Student (){
        System.out.println("无参构造方法");
    }


    public  void show(){
        System.out.println("name:"+name);
    }

}
