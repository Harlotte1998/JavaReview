
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午12:33:07 


2.1 while循环语句格式

基本格式:

	while (条件判断语句) {
		循环体语句;
	}


完整格式: !

		初始化语句;
		while (条件判断语句) {
			循环体语句;
			条件控制语句;
		}

执行流程:
	①执行初始化语句
	②执行条件判断语句，看其结果是true还是false
		如果是false,循环结束
		如果是true,继续执行
	③执行循环体语句
	④执行条件控制语句
	⑤回到②继续



*/

public class a045_while_XunHuanYuJu {
	public static void main(String[] args) {
		
	//需求:在控制台输出s"HelloHoEld"
		
		//for 循环 实现
		for(int i=1;i<=5;i++) {
			System.out.println("hello worid");
		}
		
		System.out.println("--------------------");
		
		//while 循环实现
		int j=1;
		while(j<=5) {
			System.out.println("hello  worid");
			j++;
		}

		
	}
}
