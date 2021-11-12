
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 上午10:42:24 

0案例: 求偶数和
需求:求1-100之 间的偶数和，并把求和结果在控制台输出

①对1-100的数据求和与1-5的数据求和几乎完全一样，仅仅是结束条件不同
	int sum = 0;
	for (int i = 1;i<= 100; i++) {
		sum += i;
	}

②对1-100的偶数求和,需要对求和操作添加限制条件
	int sum = 0;
	for(inti=1;1<=100;i++){
		if (执行的限制条件) {
			sum += i;
	}
	
③限制条件是偶数才参与运算，因此条件应该是判断是否是偶数
	int sum = 0;
	for (int i = 1;i<= 100; i++) {
		if(i82=0){
			sum += i;
		}
	}

④当循环执行完毕时，将最终数据打印出来
	System. out. println("1 -100之问的叫数和是:”+ sum) ;
	

*/

public class a042QuiOuShuHe {
	
	public static void main(String[] args) {
		
		
//方法一
		int num=0;
		
		for(int i=0; i<=100;i=i+2 ) {
			num=i+num;
		}
		
		System.out.println(num);

		
		
		System.out.println("------------------------------");
//方法二
	  
		int a=0;
		
		for(int i=0;i<=100;i++) {
			//对1-100的偶数求和,需要对求和操作添加限制条件
			if(i%2==0) {
				a=i+a;
			}
		}
		
		System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
