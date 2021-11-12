
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月22日 下午9:49:37 


执行流程:
①首先计算关系表达式的值
②如果关系表达式的值为true就执行语句体
③如果关系表达式的值为false就不执行语句体
④继续执行后面的语句内容


if语句格式

	格式:
	if(关系表达式) {
		语句体;
	}


*/

public class a032_if_JieGou {
	public static void main(String[] args) {
		
		//需求 判断a与b谁大  
		
		int a=10;
		int b=20;
		if (a>=b) {
			System.out.println("a>=b");
			
		}
			System.out.println("a<b");
	}
}



