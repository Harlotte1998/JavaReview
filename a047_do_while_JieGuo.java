
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����1:04:11 


3.1 do...whileѭ������ʽ
������ʽ:
	do {
		ѭ�������;
	}while(�����ж����);
	
	
������ʽ:
	��ʼ�����;
	do {
		ѭ�������;
		�����������;
	}while(�����ж����);


ִ������: .
��ִ�г�ʼ�����
��ִ��ѭ�������
��ִ�������������
��ִ�������ж���䣬��������true����false
	�����false,ѭ������
	�����true,����ִ��
�ݻص��ڼ���


*/

public class a047_do_while_JieGuo {
	public static void main(String[] args) {
		//����   �ڿ���̨ ���5�� hello  worid
		//  �� for ѭ��ʵ��
		for(int i=0;i<=5;i++) {
			System.out.println("hello  worid");
		}
		
		System.out.println("+++++++++++++++++++");
		
		// do...while  ѭ��ʵ��
		int j=0;
		
		do {
			System.out.println("hello  worid");
			j++;
		}while(j<=5);
		
	}
}



















