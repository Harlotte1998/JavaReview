package HeiMa.a219_ZiDingYiYiChang;

import java.util.Scanner;

/**
 * @author ：LC
 * @date ： 2021/11/16 17:00
 */
public class TeacherTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入分数");
        int score =sc.nextInt();

        Teacher t=new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }


    }
}
