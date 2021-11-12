package HeiMa.a196_ObjectLeiDetoStringFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 15:11
 * @Version 1.0


3.1 Object类的概述
    Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或者间接的继承自该类

    构造方法: public Object0
    回想面向对象中，为什么说子类的构造方法默认访问的是父类的无参构造方法?
        因为它们的顶级父类只有无参构造方法

    看方法的源码   选中方法  按下Ctrl + B

    建议所有子类都重写此方法
        自动生成即可

 */

public class ObjectDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("小明");
        s.setAge(89);
        System.out.println(s);
        System.out.println(s.toString());
        //默认底层调用  toString  方法
        //输出HeiMa.a196_Object.Student@1b6d3586
        /*
        public void println(Object x) {   // x=s
            //我们传递的这个参数  X 在这里 valueOf(x) 使用到了
            //继续跟进 valueOf(x)方法
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }



        public static String valueOf(Object obj) {  //obj=x
            //我们传递的这个参数 在这里被使用了  toString()
            return (obj == null) ? "null" : obj.toString();
        }

        //String  返回的是一个字符串
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        //getClass().getName()  获取路径名  获取的是带包名的路径名
        //Integer.toHexString(hashCode());

        }




        * */



    }
}
