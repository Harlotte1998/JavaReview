
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��22�� ����10:07:40 


	��ʽ:
	if (��ϵ���ʽ1){
		�����1;
	} else if (��ϵ���ʽ2){
		�����2;
	}
	...
	else {
		�����n+1;
	}
	
	
	ִ������: 
	�����ȼ����ϵ���ʽ1��ֵ
	�����ֵΪtrue��ִ�������1;���ֵΪfalse�ͼ����ϵ���ʽ2��ֵ
	�����ֵΪtrue��ִ�������2;���ֵΪfalse�ͼ����ϵ���ʽ3��ֵ
	��...
	�����û���κι�ϵ���ʽΪtrue,��ִ�������n+1��

//����:����¼��-һ��������(.2....7)�������Ӧ������һ�����ڶ���...������

*/

public class a035_if_else_if_JieGou {
	public static void main(String[] args) {
		
		System.out.println("������һ�������� 1----7");
		
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("����һ");
			
		} else if(num==2) {
			System.out.println("���ڶ�");
			
		} else if(num==3) {
			System.out.println("������");
			
		} else if(num==4) {
			System.out.println("������");
			
		} else if(num==5) {
			System.out.println("������");
			
		} else if(num==6) {
			System.out.println("������");
			
		} else if(num==7) {
			System.out.println("������");
			
		} 
		
		System.out.println("����");
	}
}
