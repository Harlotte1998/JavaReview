package HeiMa.a121_YongHuDengLu;
import java.util.Scanner;
import java.util.Scanner;

/**
 * @Author Miracle Liuce
 * @Date 2021/10/30 8:59
 * @Version 1.0


2. String
    案例:用户登录
        需求:已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，
             登录之后，给出相应的提示
    思路:
        ①已知用户名和密码，定义两个字符串表示即可
        ②键盘录入要登录的用户名和密码，用Scanner实现
        ③拿键盘录入的用户名、密码和E知的用户名、密码进行比较，给出相应的提示。
            字符串的内容比较，用equals()方法实现
        ④用循环实现多次机会,这里的次数明确，采用for循环实现，
            并在登录成功的时候，使用break结束循环


 */

public class StringTest01 {
    public static void main(String[] args) {
        //①已知用户名和密码，定义两个字符串表示即可
        String username="lc";
        String password="admin123";

        //④用循环实现多次机会,这里的次数明确，采用for循环实现，
        for (int i=0;i<3;i++){



            //②键盘录入要登录的用户名和密码，用Scanner实现
            Scanner sc=new Scanner(System.in);

            System.out.println("请输入用户名");
            String  name= sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            //③拿键盘录入的用户名、密码和E知的用户名、密码进行比较，给出相应的提示。
            if (name.equals(username) && pwd.equals(password)){
                System.out.println("登录成功");
                break;
            }else {
                //改进 还有 0 次机会
                if (2-i==0){
                    System.out.println("你的账户被锁定 请与管理员联系");
                }else {
                    System.out.println("登录失败，你还有"+(2-i)+"次机会");
                }

            }

        }
/*
        System.out.println("请输入密码");
        for(int i=0;i<3;i++){
            Scanner sc=new Scanner(System.in);
            String s1 = sc.nextLine();

            if (s1.equals(password)){
                System.out.println("密码正确 登录成功");
                break;
            }else {
                System.out.println("密码错误");
                System.out.println("请再次输入密码，还剩"+(2-i)+"次机会");

            }
        }*/
    }
}
