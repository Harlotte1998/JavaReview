
package heimachengxuyuan;

import java.util.Random;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����1:45:11 

6.1Random�����ú�ʹ�ò���
	����:���ڲ���һ�������
	
ʹ�ò���:
�ٵ���	
		import java. ut1l.Random;
		�����Ķ�������������ඨ�������
�ڴ�������
		Random r = new Random() ;
		���������ʽ���棬r �Ǳ����������Ա䣬�����Ķ��������
�ۻ�ȡ�����
		int number = r . nextInt (10) ;//��ȡ���ݵķ�Χ: [0,10) ����0 ,������10
		���������ʽ���棬number�Ǳ����������Ա䣬����10���Ա䡣�����Ķ��������


*/

public class a051_Random {
	public static void main(String[] args) {
		//����һ������
		Random r=new Random();
		
		//��ѭ������10�� �����
		for(int i=0;i<=10;i++) {
			int number=r.nextInt(10);  //��ȡ���ݵķ�Χ: [0,10) ����0 ,������10
			
			System.out.println(number);
			//���������ʽ���棬number�Ǳ�������
			//���Ա䣬����10���Ա䡣�����Ķ��������
			
		}
		
		//����  ��ȡһ�� 1--100 ֮��������
		//int x=r.nextInt(100)+1;
		//��������ֻ�� ȡ��99
		
		int x=r.nextInt(100)+1;
		System.out.println(x);
	}
}	
