
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 上午10:34:37 


案例:求和
需求:求1-5之间的数据和，并把求和结果在控制台输出


分析:
①求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
	int sum = 0;
②从1开始到5结束的数据，使用循环结构完成
	for (int i=1;1<=5; 1++) 
③将反复进行的事情写入循环结构内部，此处反复进行的事情是将数据i加到用于保存最终求和的变量sum中
	for (int i = 1;i<=5; i1++) {
	sum += i;
④当循环执行完毕时，将最终数据打印出来
	System. out. println("1-5之间的数据和是:”+ sum) ;


*/

public class a041QuiHe {
	public static void main(String[] args) {
		//①求和的最终结果必须保存起来，需要定义一个变量，用于保存求和的结果，初始值为0
		int num=0;
		
		
		//从1开始到5结束的数据，使用循环结构完成
		for(int i=1;i<=5;i++) {
			//将反复进行的事情写入循环结构内部
			num=i+num;
			System.out.println(i);
			
		}
		//当循环执行完毕时，将最终数据打印出来
		System.out.println(num);
	}
}
