
package heimachengxuyuan;

import java.util.Random;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午1:45:11 

6.1Random的作用和使用步骤
	作用:用于产生一个随机数
	
使用步骤:
①导包	
		import java. ut1l.Random;
		导包的动作必须出现在类定义的上面
②创建对象
		Random r = new Random() ;
		上面这个格式里面，r 是变量名，可以变，其他的都不允许变
③获取随机数
		int number = r . nextInt (10) ;//获取数据的范围: [0,10) 包括0 ,不包括10
		上面这个格式里面，number是变量名，可以变，数字10可以变。其他的都不允许变


*/

public class a051_Random {
	public static void main(String[] args) {
		//创建一个对象
		Random r=new Random();
		
		//用循环创建10个 随机数
		for(int i=0;i<=10;i++) {
			int number=r.nextInt(10);  //获取数据的范围: [0,10) 包括0 ,不包括10
			
			System.out.println(number);
			//上面这个格式里面，number是变量名，
			//可以变，数字10可以变。其他的都不允许变
			
		}
		
		//需求  获取一个 1--100 之间的随机数
		//int x=r.nextInt(100)+1;
		//上面的这个只能 取到99
		
		int x=r.nextInt(100)+1;
		System.out.println(x);
	}
}	
