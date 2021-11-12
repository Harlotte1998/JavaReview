
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月22日 下午9:54:38 

11语句格式2
	格式:
	if(关系表达式){
		语句体1:
	}   else {
		语句体2:
	}
	执行流程。
	1首先计复关系表达式的值
	2:如果关系表达式的为 true  就执行语句体  1
	3:如果关系表达式的为 false  就执行语句体  2
	
	4:继续执行后面的语句内容

//需求:判断a是否大于b，如果是，在控制台输出: a的值大于b,如果不是，在控制台输出: a的值不大于b

*/

public class a033_if__else_JieGou {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		if(a>=b) {
			System.out.println("a>=b");
		}else {
			System.out.println("a<b");
			
		}
	}
}
