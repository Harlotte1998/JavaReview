
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年6月21日 下午2:40:52 


*/

public class a026sanYuanYunSuanFu {
	public static void main(String[] args) {
		/*
		 * 三元运算符
		 * 格式：
		 * 关系表达式   ? 表达式1  :   表达式2;
		 * 范例:
		 * 
		 * a  >  b  ?  a : b;
		 * 
		 * 
		 * 执行流程 
		 * 首先计算关系表达式的值
		 * 如果为true    表达式1的值就是运算结果
		 * 如果为false   表达式2的值就是运算结果
		 * 
		 * 
		 * 
		 * 
		 * */
		
		//定义两个变量
		int a=10;
		int b=20;
		
		//获取两个数据中的较大值
		
		int  max=a>b ? a : b ;
		
		//输出结果
		
		System.out.println("max:"+max);
		
		
		
		
		
	}
}
