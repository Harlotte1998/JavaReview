
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����10:42:24 

0����: ��ż����
����:��1-100֮ ���ż���ͣ�������ͽ���ڿ���̨���

�ٶ�1-100�����������1-5��������ͼ�����ȫһ���������ǽ���������ͬ
	int sum = 0;
	for (int i = 1;i<= 100; i++) {
		sum += i;
	}

�ڶ�1-100��ż�����,��Ҫ����Ͳ��������������
	int sum = 0;
	for(inti=1;1<=100;i++){
		if (ִ�е���������) {
			sum += i;
	}
	
������������ż���Ų������㣬�������Ӧ�����ж��Ƿ���ż��
	int sum = 0;
	for (int i = 1;i<= 100; i++) {
		if(i82=0){
			sum += i;
		}
	}

�ܵ�ѭ��ִ�����ʱ�����������ݴ�ӡ����
	System. out. println("1 -100֮�ʵĽ�������:��+ sum) ;
	

*/

public class a042QuiOuShuHe {
	
	public static void main(String[] args) {
		
		
//����һ
		int num=0;
		
		for(int i=0; i<=100;i=i+2 ) {
			num=i+num;
		}
		
		System.out.println(num);

		
		
		System.out.println("------------------------------");
//������
	  
		int a=0;
		
		for(int i=0;i<=100;i++) {
			//��1-100��ż�����,��Ҫ����Ͳ��������������
			if(i%2==0) {
				a=i+a;
			}
		}
		
		System.out.println(a);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
