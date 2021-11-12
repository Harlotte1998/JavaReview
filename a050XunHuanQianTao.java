
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午1:33:34 
	
	
	5.1循环嵌套概述
		语句结构:
			●顺序语句	以分号结尾，表示-句话的结束

			●分支语句	一对大括号表示if的整体结构，整体描述一 个完整的if语句
						一对大括号 表示switch的整体结构，整体描述一个完整的switch语句

			●循环语句	一对大括号 表示for的整体结构，整体描述一个完整的for语句
						一对大括号表示while的整体结构，整体描述-一个完整的while语句
						do..while以分号结尾，整体描述-个完整的do.while语句
		
		
		任何语句对外都可以看成是一句话，一 句代码
		分支语句中包含分支语句称为分支嵌套
		循环语句中包含循环语句称为循环嵌套


	循环嵌套:
		循环语句中包含循环语句
	需求:在控制合输出一天的小时和分钟I
		分钟和小时的范围:
		分钟: 0 <minute < 60
		小时: 0 <ahour<24
		



*/

public class a050XunHuanQianTao {
	public static void main(String[] args) {
		int num=0;
		for(int i=0;i<=24;i++) {
			for(int j=0;j<=60;j++) {
				for(int k=0;k<=60;k++) {
					System.out.println(i+"时"+j+"分"+k+"秒");
					num++;
				}
			}
		}
		
		System.out.println(num);
	}
}
