package HeiMa.a164_QuanXianXiuShiFu;

/**
 * @Author Miracle Liuce
 * @Date 2021/11/5 11:12
 * @Version 1.0


3.1修饰符的分类
    ●权限修饰符
    ●状态修饰符




    权限修饰符   在同一个类中      同一个包中      不同包的子类  不同包的无关类
    private     private
    默认         默认            默认
    protected   protected       protected      protected
    public      public          public         public        public

 */

public class Demo {
    public static void main(String[] args) {
        Fu f=new Fu();

        f.show2();
        f.show3();
        f.show4();


    }

}











