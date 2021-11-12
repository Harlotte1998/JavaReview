
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年6月21日 下午2:27:48 


*/

public class a025DuanLuLuoJiYunSuanFu {
	public static void main(String[] args) {
		
		
		
		
		/*
		 * 逻辑与	&   无论左边真假 右边都要执行
		 * 短路与	&&  如果左边为真 右边执行 如果左边为假，右边不执行
		 * 
		 * 
		 * 逻辑或	|   无论左边真假  右边都要执行
		 * 短路或	||  如果左边为假，右边执行，如果左边为真，右边不执行
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */

		int i=10;
		int j=20;
		int a=10;
		int b=20;
		
		int k=30;
		
		
		//&&  有false则false  
		System.out.println((i>j)&&(i>k));  //false && false      false
		System.out.println((i<j)&&(i>k));  //true  && false      false
		System.out.println((i>j)&&(i<k));  //false && true       false
		System.out.println((i<j)&&(i<k));  //true  && true       false
		System.out.println("------------------------");
		
		
		//||   有true则true
		System.out.println((i>j) ||  (i>k));  //false || false     false
		System.out.println((i<j) ||  (i>k));  //true  || false     true
		System.out.println((i>j) ||  (i<k));  //false || true      true
		System.out.println((i<j) ||  (i<k));  //true  || true      true
		System.out.println("------------------------");		
		
		//  &&和&
		System.out.println((a++ >100)&(b++>100));    //false &&  false
		System.out.println("a："+a);      
		System.out.println("b："+b);
		//逻辑与	&   无论左边真假 右边都要执行    a++  b++都执行一次
		
		System.out.println((i++ >100)&&(j++>100));    //false &&  false
		System.out.println("i："+i);      
		System.out.println("j："+j);
		//短路与	&&  如果左边为真 右边执行  i++执行一次     如果左边为假，右边不执行 j++不执行
		
		
		
		
	}
}
