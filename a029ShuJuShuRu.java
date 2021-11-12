
package heimachengxuyuan;


import  java.util.Scanner;;
/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年6月21日 下午3:04:22 


*/

/*    
 * 1.导包
 *   import java.util.Scanner;
 *   
 *   导包的动作必须要在类定义的上边
 * 
 * 2.创建对象
 *   Scanner  sc = new Scanner(Syatem.in)
 *   
 *   上面这个格式里面 只有sc是变量名  可以变  其他的都不允许变
 *   
 *   
 * 3.接收数据
 *   int i = sc.nextInt();
 *   
 *   上面这个格式里面 只有   i 是变量名，可以变，其他的都不允许变
 * 
 * 
 * 
 * 
 * */


public class a029ShuJuShuRu {
	public static void main(String[] args) {
		System.out.println("请输入数据：");
		
		//创建对象
		Scanner sc =new Scanner(System.in);
		
		//接收数据     nextInt()  接收一个整数型的数据
		int x= sc.nextInt();
		
		//输出数据
		System.out.println("x:"+x);
		
	}
}


