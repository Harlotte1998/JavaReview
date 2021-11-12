
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年6月21日 下午2:55:05 


*/

public class a028SanGeHeShang {
	public static void main(String[] args) {
		
		//定义三个变量用于保存和尚身高
		int height1=180;
		int height2=170;
		int height3=300;
		
		//用三元运算符获取前两个和尚的较高身高值  
		//并用临时身高变量保存起来
		
		int height4= height1>height2 ? height1  : height2;
		
		
		//用三元运算符获取临时身高值和第三个和尚身高较高值  并用最大身高量保存
		int height = height4>height3 ? height4  : height3;
		
		System.out.println("最高的身高:"+height);
		
	}
}
