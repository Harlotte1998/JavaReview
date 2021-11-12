
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 上午9:59:57 


需求: -年有12个月，分属于春夏秋冬4个季节，键盘录入-个月份，请用程序实现判断该月份属于哪个季节，并输出。

春季	  3   4    5
夏季     6   7    8
秋季     9   10   11
冬季    12   1    2 



当把			case 2  :
				System.out.println("冬季");
				// break;
中的 break   注释掉后

请输入月份：
2
冬季
春季
结束


case  穿透
	因为  case 2  中的  break  没有了   所以   语句继续向下执行
  

注意事项:在switch语句中， 如果case控制的语句体后面不写break,将出现穿透现象,在不判断下一个case值的情况下，向下运行，
		直到遇到break,或者整体switch语句结束



*/

public class a038ChunXiaQuiDong {
	public static void main(String[] args) {
		System.out.println("请输入月份：");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
//		switch(month) {
//			case 1  :
//				System.out.println("冬季");
//				break;
//
//			case 2  :
//				System.out.println("冬季");
//				//break;
//				
//			case 3  :
//				System.out.println("春季");
//				break;			
//				
//			case 4  :
//				System.out.println("春季");
//				break;
//				
//			case 5  :
//				System.out.println("春季");
//				break;				
//				
//			case 6  :
//				System.out.println("夏季");
//				break;				
//				
//			case 7  :
//				System.out.println("夏季");
//				break;				
//				
//			case 8  :
//				System.out.println("夏季");
//				break;				
//				
//			case 9  :
//				System.out.println("秋季");
//				break;				
//				
//			case 10  :
//				System.out.println("秋季");
//				break;			
//				
//				
//			case 11  :
//				System.out.println("秋季");
//				break;				
//				
//				
//			case 12  :
//				System.out.println("冬季");
//				break;			
//				
//			default:
//				System.out.println("你输入的月份有误");
//				break;
//				//default   的 break;  可以省略
//				
//		}
		
		//  利用 case  穿透后  简化后的代码  
		
		switch(month) {
		
			case 1 :
			case 2 :
			case 12 :
				
				System.out.println("冬季");
				break;

			case 3 :
			case 4 :
			case 5 :
				
				System.out.println("春季");
				break;
				
			case 6 :
			case 7 :
			case 8 :
				
				System.out.println("夏季");
				break;
				
			case 9 :
			case 10 :
			case 11 :
				
				System.out.println("秋季");
				break;
			
			default:
				
				System.out.println("你输入的数据有误");
		
		}

			System.out.println("结束");
	}
}
