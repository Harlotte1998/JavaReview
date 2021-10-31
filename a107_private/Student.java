package HeiMa.a107_private;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/28 15:49
 * @Version 1.0

4.1 private关键字


 */

public class Student {
/*

        //成员变量
        String name;
        int age;

        //成员方法
        public void show(){
            System.out.println("name="+name+"age="+age);
        }

*/

    String name;
    private int age;


    //成员方法
    public void show(){
        System.out.println("  name="+name+"   age="+age);

    }


    public void setAge(int a){
//        age=a;
    if(a<0 || a>120){
        System.out.println("你给的年龄有误");
    }else {
        age=a;
    }

    }

    public int getAge() {
        return age;
    }
}