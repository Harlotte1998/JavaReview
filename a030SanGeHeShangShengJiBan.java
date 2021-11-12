
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年6月21日 下午3:18:04 


*/

public class a030SanGeHeShangShengJiBan {

	public static void main(String[] args) {

		
		
		
		//创建对象
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("请输入数据：");
		//接收数据
		int a= sc.nextInt();
	
	
		System.out.println("请输入数据：");
		//接收数据
		int b= sc.nextInt();
	
		System.out.println("请输入数据：");
		//接收数据
		int c= sc.nextInt();


	
		
		//用三元运算符获取前两个和尚的较高身高值  
		//并用临时身高变量保存起来
		
		int height4= a>b ? a  : b;
		
		
		//用三元运算符获取临时身高值和第三个和尚身高较高值  并用最大身高量保存
		int height = height4>c ? height4  : c;
		
		System.out.println("最高的身高:"+height);
		
		
		
		
		
		
		
		
		
	}

}
