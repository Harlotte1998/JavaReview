
package heimachengxuyuan;

/** 

* @author 作者 Your-Name:   刘策

* @version 创建时间：2021年10月23日 下午1:14:05 


for和while的区别:
●条件控制语句所控制的自增变量，因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
●条件控制语句所控制的自增变量， 对于while循环来说不归属其语法结构中，在while循环结束后， 该变量还可以继续使用

// 1.0 for循环和while 的区别
	for(int i=0; i<=10;i++){
		System.out.println("Hello  worid");
	}
	
	System.out.println(  i  );   
	// 此时 i  不能被输出   i 是属于 for  循环内部的
	
	int j=0;
	while(j<=10) {
		System.out.println("while");
	}
	System.out.println(  i  );   
	// 此时j  能被输出   i 不是属于 for  循环内部的



// 2.0 死循环

for( ; ; ){
	  //  代表永远为真

   System.out.println("hello");
}

//会不停的 打印  hello
 
 

3.2三种循环的区别
三种循环的区别:
	●for循环和while循环先判断条件是否成立，然后决定是否执行循环体(先判断后执行)
	●do..while循环先执行一 次循环体， 然后判断条件是否成立，是否继续执行循环体(先执行后判断)
	


while的死循环格式是最常用的
命令提示符窗口中Ctrl+ C可以结束死循环


*/

public class a048SanZhongXunHuanDeQuBie {
	public static void main(String[] args) {
		

		
//死循环		
		
//		for( ; ; ){
//			   System.out.println("hello");
//			}
//		
		
//		while(true) {
//			System.out.println("while");
//		}
		
		
//		do {
//			System.out.println("do__while");
//		}while(true);
		
		
	}
}
