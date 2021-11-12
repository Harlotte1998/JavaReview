
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月22日 下午10:07:40 


	格式:
	if (关系表达式1){
		语句体1;
	} else if (关系表达式2){
		语句体2;
	}
	...
	else {
		语句体n+1;
	}
	
	
	执行流程: 
	①首先计算关系表达式1的值
	②如果值为true就执行语句体1;如果值为false就计算关系表达式2的值
	③如果值为true就执行语句体2;如果值为false就计算关系表达式3的值
	④...
	⑤如果没有任何关系表达式为true,就执行语句体n+1。

//需求:键盘录入-一个星期数(.2....7)，输出对应的星期一，星期二，...星期日

*/

public class a035_if_else_if_JieGou {
	public static void main(String[] args) {
		
		System.out.println("请输入一个星期数 1----7");
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("星期一");
			
		} else if(num==2) {
			System.out.println("星期二");
			
		} else if(num==3) {
			System.out.println("星期三");
			
		} else if(num==4) {
			System.out.println("星期四");
			
		} else if(num==5) {
			System.out.println("星期五");
			
		} else if(num==6) {
			System.out.println("星期六");
			
		} else if(num==7) {
			System.out.println("星期七");
			
		} 
		
		System.out.println("结束");
	}
}
