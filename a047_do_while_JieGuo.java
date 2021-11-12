
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午1:04:11 


3.1 do...while循环语句格式
基本格式:
	do {
		循环体语句;
	}while(条件判断语句);
	
	
完整格式:
	初始化语句;
	do {
		循环体语句;
		条件控制语句;
	}while(条件判断语句);


执行流程: .
①执行初始化语句
②执行循环体语句
③执行条件控制语句
④执行条件判断语句，看其结果是true还是false
	如果是false,循环结束
	如果是true,继续执行
⑤回到②继续


*/

public class a047_do_while_JieGuo {
	public static void main(String[] args) {
		//需求   在控制台 输出5次 hello  worid
		//  用 for 循环实现
		for(int i=0;i<=5;i++) {
			System.out.println("hello  worid");
		}
		
		System.out.println("+++++++++++++++++++");
		
		// do...while  循环实现
		int j=0;
		
		do {
			System.out.println("hello  worid");
			j++;
		}while(j<=5);
		
	}
}



















