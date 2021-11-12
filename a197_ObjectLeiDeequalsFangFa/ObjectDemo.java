package HeiMa.a197_ObjectLeiDeequalsFangFa;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/11 15:36
 * @Version 1.0


3.2 Object类的常用方法
    方法名 说明
    public String toString(
    返回对象的字符串表示形式。
    建议所有子类重写该方法，自动生成

    public boolean equals(Object obj)
    比较对象是否相等。默认比较地址，
    重写可以比较内容，自动生成

 */

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setAge(45);
        s1.setName("小明");

        Student s2=new Student();
        s2.setAge(45);
        s2.setName("小明");

        //需求 比较两个对象的内容是否相同
        System.out.println(s1==s2);  //不能实现 需求
        // s1   s2  只是地址值 他比的不是内容

        System.out.println(s1.equals(s2));   //false
        /*
            public boolean equals(Object obj) {
                // this --s1
                // obj--s2
                return (this == obj);


            }

            equals  默认比的是地址值
            需要重写   在student  类中
        * */


    }
}
