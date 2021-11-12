
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月22日 下午10:17:33 

//数据测试: 正确数据，边界数据，错误数据

*/

public class a036KaoShiJiangLi {
	public static void main(String[] args) {
		System.out.println("请输入你的成绩：");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		
		 if(score>=90 && score<=100 ) {
			System.out.println("成绩优秀 91--100");
			
		} else if(score>=81 && score<=90) {
			System.out.println("成绩一般 81--90");
			
		} else if(score>=71 && score<=80) {
			System.out.println("成绩还行 71--80");
			
		} else if(score>=61 && score<=70) {
			System.out.println("成绩堪忧61--70");
			
		} else if(score>=51 && score<=60) {
			System.out.println("成绩不行 51--60");
			
		} else if(score>=01 && score<=50) {
			System.out.println("成绩很差 0--50");
		}  else {
			System.out.println("你输入的数据有误");
		}
		
		 
	}
}
