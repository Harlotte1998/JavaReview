package HeiMa.a164_QuanXianXiuShiFu;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 11:13
 * @Version 1.0
 */

public class Fu {
    private void show1(){
        System.out.println("private");
    }

     void show2(){
        System.out.println("默认");
    }

    protected void show3(){
        System.out.println("protected");
    }

    public  void show4(){
        System.out.println("public");
    }


    public static void main(String[] args) {
        Fu f=new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();

        //在本类中  都可以被访问


    }
}
