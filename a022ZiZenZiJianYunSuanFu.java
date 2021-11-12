package heimachengxuyuan;

public class a022ZiZenZiJianYunSuanFu {
	public static void main(String[] args) {
		int i=10;
		System.out.println("i:"+i);
		
		i++;
		System.out.println("i:"+i);
		
		
		++i;
		System.out.println("i:"+i);
		
		
		//参与操作使用
		int j=i++;
		System.out.println("i:"+i);
		System.out.println("j:"+i);
		
		int k=++i;
		System.out.println("i:"+i);
		System.out.println("k:"+i);
		
		
		/*
		 * 注意事项:
           ●+ +和--既可以放在变量的后边，也可以放在变量的前边。
           ●单独使用的时候， + +和--无论是放在变量的前边还是后边，结果是-样的。
           ●参与操作的时候, 如果放在变量的后边，先拿变量参与操作,后拿变量做+ +或者--。
                      参与操作的时候，如果放在变量的前边，先拿变量做+ +或者--,后拿变量参与操作。

		 * 
		 * 
		 * 
		 * 
		 * */ 
		
	}
}
