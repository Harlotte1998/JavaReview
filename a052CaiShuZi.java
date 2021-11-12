
package heimachengxuyuan;

import java.util.Random;
import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午1:57:02 

0案例:猜数字
需求:程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少?
当猜错的时候根据不同情况给出相应的提示
	●如果猜的数字比真实数字大，提示你猜的数据大了
	●如果猜的数字比真实数字小，提示你猜的数据小了
	●如果猜的数字与真实数字相等，提示恭喜你猜中了   结束循环

分析:
①要完成猜数字的游戏，首先需要有一个要猜的数字, 使用随机数生
  成该数字，范围1到100
  		Random r=new Random();
		int x=r.nextInt(10)+1;
		
②因为无法预知几次能够猜中，因此猜数字这个操作应该是反复进行
  的，需要使用循环，而while循环通常用于描述未知循环次数的循环
  		while(条件) {}
  		
③使用程序实现猜数字,每次均要输入猜测的数字值，需要使用键盘
  录入实现
  		System.out.println("请输入一个数字");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
④比较输入的数字和系统产生的数据，需要使用分支语句。这里使用
  if..else..if  格式，根据不同情况进行猜测结果显示，当猜中后使用
  break结束循环即可



生成一个随机数  不会改变   (放到while 循环外面)
	●如果猜的数字比真实数字大，提示你猜的数据大了
	●如果猜的数字比真实数字小，提示你猜的数据小了
	●如果猜的数字与真实数字相等，提示恭喜你猜中了   结束循环

*/

public class a052CaiShuZi {
	public static void main(String[] args) {


//要完成猜数字的游戏，首先需要有一个要猜的数字, 使用随机数生成该数字，范围1到100			
		Random r=new Random();
		int x=r.nextInt(100)+1;
		
		
		
		
//  while  循环  从  这里开始包裹     确保随机数字 不会每次都改变 
		while(true) {
		
		
//使用程序实现猜数字,每次均要输入猜测的数字值，需要使用键盘录入实现			
			System.out.println("请输入一个数字");
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			

			
			System.out.println("随机的数字"+x);
			System.out.println("输入的数字"+num);
		

//        比较输入的数字和系统产生的数据，需要使用分支语句。这里使用
//		  if..else..if  格式，根据不同情况进行猜测结果显示，
//		   当猜中后使用break结束循环即可			
		
		
			if(x==num) {
				System.out.println("猜对了 !!!!!!");
				break;
			    //  当猜中后  结束 while循环   counter 是跳出本次循环  
				//  break  是 结束所有的循环
				
			}else if(num>x  &  num<100 ) {
				System.out.println("你输入的比随机数字大");
				
			}else if(num<x) {
				System.out.println("你输入的比随机数字小");
				
			}else  {
				System.out.println("你输入的数据有误");
				
				
			}
			
			System.out.println("++++++++++++");
			
		}//  while  死循环  到此结束
		
		System.out.println("结束");
		

		
	}
}
