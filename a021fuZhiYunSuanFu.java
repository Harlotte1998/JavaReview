package heimachengxuyuan;

public class a021fuZhiYunSuanFu {
	public static void main(String[] args) {
		
		int i=10;
		System.out.println("i:"+i);
		
		
		//  +=  把左边和右边的数据做加法操作，结果赋值到左边
		i+=20;   //i=i+20;
		
		System.out.println("i:"+i);
		
		
		
		//注意  扩展的赋值运算符底层隐含了强制类型转换
		short s=10;
		 
	    //s=s+20;  //这样会报错    s是short类型  不能接收一个short类型和int类型相加
		           //  short 比 int 表示的范围小
		s=(short)(s+20);
		
		//s+=20;      //这一行代码 可以代替上面 带有强制 转换的语句   
		System.out.println("s:"+s);
	
	
	
	
	
	
	}
}


