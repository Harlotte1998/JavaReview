
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月22日 下午9:59:31 

需求:任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数。

*/

public class a034JiOuShu {
	public static void main(String[] args) {
				System.out.println("请输入你的数据：");
				//创建对象
				Scanner sc =new Scanner(System.in);
				
				//接收数据     nextInt()  接收一个整数型的数据
				int x= sc.nextInt();
				
				if(x%2==0) {
					System.out.println("你输入的"+x+"是偶数");
				}else {
					System.out.println("你输入的"+x+"是奇数");
				}
	}
}
