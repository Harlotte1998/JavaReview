
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��22�� ����10:31:42 


��ʽ˵��:
����ʽ:ȡֵΪbyte. short. int. char, JDK5�Ժ������ö��,
			JDK7�Ժ������String.
��case:  ���������Ҫ�ͱ��ʽ���бȽϵ�ֵ��
��break: ��ʾ�жϣ���������˼����������switch��䡣
��default: ��ʾ�����������ƥ��ʱ�򣬾�ִ�иô�������,��if��
			���else���ơ�


ִ������:
�����ȼ�����ʽ��ֵ��
�����κ�case�����ֵ���бȽ�,����ж�Ӧ��ֵ���ͻ�ִ����Ӧ����
�䣬��ִ�еĹ����У�����break�ͻ������
��������е�case�����ֵ�ͱ��ʽ��ֵ����ƥ�䣬�ͻ�ִ��default
���������壬Ȼ������������


��ʽ��
switch(���ʽ){

	case ֵ1:
			�����1;
			break;

	case ֵ2:
			�����2;
			break;

	case ֵ3:
			�����3;
			break;
	......
	
	default:
			�����n+1;
			break;

}


*/

public class a037_swith_jieGou {
	public static void main(String[] args) {
		System.out.println("������һ�������� 1---7 ");
		
		Scanner sc=new Scanner(System.in);
		int week=sc.nextInt();
		
		switch(week) {
			case 1 :
				System.out.println("����һ");
				break;
		
			case 2 :
				System.out.println("���ڶ�");
				break;			
		
			case 3 :
				System.out.println("������");
				break;			
		
			case 4 :
				System.out.println("������");
				break;			
	
			case 5 :
				System.out.println("������");
				break;			

			case 6 :
				System.out.println("������");
				break;			
			
			case 7 :
				System.out.println("������");
				break;			
			
			default:
				System.out.println("���������������");
			
		}
		
			System.out.println("����");
	}
}
