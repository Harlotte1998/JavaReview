package heimachengxuyuan;


        //自动类型转换    	
            	
        /*
         * 7.2自动类型转换
			把-一个表示  数据范围小  的数值或者变量赋值给另-个表示    数据范围大   的变量
			范例: doubled = 10;
			
			
			
			表示数据范围从小到大
			
			byte --> short --> int --> long --> float --> double
                                                                                                个
                               char
            
         * */    	
            	

	
				
				
				
				
public class a017Leixingzhuanhuan {
		public static void main(String[] args) {
			//自动类型转换
        	double  d  =10;
			System.out.println(d);
			
			/*  本身是一个整数类型    转换为浮点数flaot类型   
			 * 能正常输出     表示范围小的  可以转换成  表示范围大的  
			 *  
			 * */
			
			byte   b=10;
			short  s=b;
			int    i=b;			
			//  可以把  byte 转换成   short   int     
			
			// char = i;    这个
			
			//强制类型转换
			//规格  目标数据类型  变量名=(目标数据类型) 值或者变量名
	        //范例  int K =(int)88.88		
			
			// 88.88  是浮点数 float  
			// i 被定义成了  int  整数类型     
			//  int 类型 范围比 float 小      需要强制转换
			//  数值强制类型转换 会有数据丢失  不会进行四舍五入
			
			
			
			
			int k=(int)88.888;
			
			System.out.println(k);
				
				
			}
}
