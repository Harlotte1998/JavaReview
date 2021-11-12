package heimachengxuyuan;


//字符的+操作
/*
 * 字符的+操作是拿字符在计算机底层对应的数值进行计算
 * 'A'    65    A--Z是连续的
 * 'a'    97    a--z是连续的
 * '0'    48
 * 
 * 算数表达式中包含多个基本数据类型的值的时候，整个算数表达式的类型会
 * 自动进行提升。
 * 提升规则
 * byte类型  short类型  char类型 都将会被提升到int类型
 * 整个表达式的类型自动提升到最高等级操作数同样的类型
 * 等级顺序
 * byte  short  char  int  long  float  double
 * 
 
 *  
 * */


public class a019ziFuDeJiaCaoZuo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char  c = 'A';              //  A的Ascll值是 65
		System.out.println(c);
		//输出一个  字符    A
		
		int  i=10;
		System.out.println(i+c);
		//输出   75   此时输出的是 A  的 ascll码值   与  10  相加的结果
		
		
		//char ch = i + c;
		//System.out.println(ch);  会报错 
		//  char类型会被自动提升为  int  类型
		int ch =i+c;
		System.out.println(ch);
		
		//  int k=12+13.13;   会报错   int类型的整数  不能接收 浮点数
		double  k=12+12.65;
		System.out.println(k);
		
		
	}
}
