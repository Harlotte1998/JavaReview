
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��6��21�� ����3:18:04 


*/

public class a030SanGeHeShangShengJiBan {

	public static void main(String[] args) {

		
		
		
		//��������
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("���������ݣ�");
		//��������
		int a= sc.nextInt();
	
	
		System.out.println("���������ݣ�");
		//��������
		int b= sc.nextInt();
	
		System.out.println("���������ݣ�");
		//��������
		int c= sc.nextInt();


	
		
		//����Ԫ�������ȡǰ�������еĽϸ����ֵ  
		//������ʱ��߱�����������
		
		int height4= a>b ? a  : b;
		
		
		//����Ԫ�������ȡ��ʱ���ֵ�͵�����������߽ϸ�ֵ  ����������������
		int height = height4>c ? height4  : c;
		
		System.out.println("��ߵ����:"+height);
		
		
		
		
		
		
		
		
		
	}

}
