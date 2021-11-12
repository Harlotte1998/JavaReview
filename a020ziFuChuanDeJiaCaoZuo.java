package heimachengxuyuan;

public class a020ziFuChuanDeJiaCaoZuo {
	public static void main(String[] args) {
		/*
		 * 1.当“+”操作中，出现字符串时，这个“+”是字符串连接符，
		 *   不是算数运算
		 *   
		 *   
           2.当“+”操作中，如果出现了字符串，就是连接运算符，
                        否则就是算术运算，
                        当连续进行“+”操作时，从左到右逐个依次执行。
		 * */
		System.out.println("字符串"+"字符串"); 
		//字符串字符串
		
		System.out.println("字符串"+666);
		//字符串666
		
	    System.out.println(666+"字符串");
	    //666字符串
	    
		System.out.println("字符串"+6+66);
		//字符串666
		//当连续进行“+”操作时，从左到右逐个依次执行。
		//先是 字符串6+66    然后  字符串666 
		
		
		System.out.println(1+99+"年");
		//100年
		
		//当连续进行“+”操作时，从左到右逐个依次执行。
		//前面先是算术运算符   遇到字符串候就变成了连接运算符
	}
}
