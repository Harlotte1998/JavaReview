
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午12:26:08 


0案例:统计
需求:统计“水仙花数”-共有多少个， 并在控制台输出个数
①定义变量count,用于保存“水仙花数”的数量，初始值为0
	int count = 0;
②在判定水仙花数的过程中，满足条件不再输出，更改为修改count的值，使count+1
	if(a*a*a+b*b*b+c*c*c==原数){
		count++;
	}

*/

public class a044TongJi {
	public static void main(String[] args) {
		
		int count=0;
		
		
		for(int i=100;i<=999;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				count++;
			}
			
			
			
		}
		
		System.out.println("100--999水仙花数有"+count+"个");
	}
}
