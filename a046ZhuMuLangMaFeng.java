
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午12:42:35 

。案例:珠穆朗玛峰
	需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)， 假如我有一张足够大的纸，它的厚度是0.1毫米。
	请问，我折叠多少次，可以折成珠穆朗玛峰的高度?



分析:
①因为要反复折叠，所以要使用循环，但是不知道折叠多少次，
  这种情况下更适合使用while循环
	
	while(条件判断语句){循环体}

②循环的执行过程中每次纸张折叠，纸张的厚度要加倍，因
  此需要先定义纸张厚度，在循环中使厚度加倍

	double paper = 0.1;
	while (条件判断语句) {
		paper *= 2;
	}
	
③折叠的过程中当纸张厚度大于珠峰就停止了，因此继续执
  行的要求是纸张厚度小于珠峰高度
	int zf = 8844430;
	while ( paper <= zf){....}

④设置一个计数器器，在循环中执行累加，对应折叠了多少次
	int count = 0;
	while(paper<=zf){
		count++;
	}





*/

public class a046ZhuMuLangMaFeng {
	public static void main(String[] args) {
		
		
		
		
		
		
		//定义一个计数器，初始值为零
		int count=0;
		//定义纸张厚度
		double paper=0.1;
		//定义珠穆朗玛峰的高度
		int zf=8844430;
		
		
		//因为要反复折叠，所以要使用循环，但是不知道折叠多少次 这种情况下更适合用 while循环
		//折叠过程中当纸张厚度大于 珠峰就停止了，因为继续执行的要求是纸张厚度小于珠峰高度	
		while(paper<=zf) {
			
			//循环的执行过程中，每次纸张折叠，纸张的厚度要加倍
			paper=paper*2;
			
			//再循环中执行累加  对应折叠了多少次
			count++;
		}
		
		//打印计数器的值
		System.out.println("需要折叠"+count+"次");
		
		
		
		
		
		
		
		
		
		
		
	}
}
