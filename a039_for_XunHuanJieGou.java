
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 上午10:21:45 


1.1循环结构
循环结构的组成:
	初始化语句:用于 表示循环开启时的起始状态，简单说就是循环开始的时候什么样
	条件判断语句:用于表示循环反复执行的条件，简单说就是判断循环是否能一-直执行下去
	循环体语句:用于表示循环反复执行的内容， 简与说就是循环反复执行的事情
	条件控制语句:用于表示循环执行中每次变化的内容，简单说就是控制循环是否能执行下去


循环结构对应的语法:
	初始化语句:这里可以是一 条或者多条语句， 这些语句可以完成些初始化操作
	条件判断语句:这里使用一个结果值为boolean类型的表达式，这个表达式能决定是否执行循环体。例如: a<3
	循环体语句:这里可以是任意语句， 这些语句将反复执行
	条件控制语句:这里通常是使用一条语句来改变变量的值， 从而达到控制循环是否继续向下执行的效果。常见i+ +,--这样的操作


1.2 for循环语句格式
格式:
	for (初始化语句;条件判断语句;条件控制语句) {
		循环体语句;
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

public class a039_for_XunHuanJieGou {
	public static void main(String[] args) {
		
		for ( int i=0 ; i<=5; i++ ) {
			System.out.println("hello Worid");
			
		}

	}
}
