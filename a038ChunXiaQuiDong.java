
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����9:59:57 


����: -����12���£������ڴ����ﶬ4�����ڣ�����¼��-���·ݣ����ó���ʵ���жϸ��·������ĸ����ڣ��������

����	  3   4    5
�ļ�     6   7    8
�＾     9   10   11
����    12   1    2 



����			case 2  :
				System.out.println("����");
				// break;
�е� break   ע�͵���

�������·ݣ�
2
����
����
����


case  ��͸
	��Ϊ  case 2  �е�  break  û����   ����   ����������ִ��
  

ע������:��switch����У� ���case���Ƶ��������治дbreak,�����ִ�͸����,�ڲ��ж���һ��caseֵ������£��������У�
		ֱ������break,��������switch������



*/

public class a038ChunXiaQuiDong {
	public static void main(String[] args) {
		System.out.println("�������·ݣ�");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		
//		switch(month) {
//			case 1  :
//				System.out.println("����");
//				break;
//
//			case 2  :
//				System.out.println("����");
//				//break;
//				
//			case 3  :
//				System.out.println("����");
//				break;			
//				
//			case 4  :
//				System.out.println("����");
//				break;
//				
//			case 5  :
//				System.out.println("����");
//				break;				
//				
//			case 6  :
//				System.out.println("�ļ�");
//				break;				
//				
//			case 7  :
//				System.out.println("�ļ�");
//				break;				
//				
//			case 8  :
//				System.out.println("�ļ�");
//				break;				
//				
//			case 9  :
//				System.out.println("�＾");
//				break;				
//				
//			case 10  :
//				System.out.println("�＾");
//				break;			
//				
//				
//			case 11  :
//				System.out.println("�＾");
//				break;				
//				
//				
//			case 12  :
//				System.out.println("����");
//				break;			
//				
//			default:
//				System.out.println("��������·�����");
//				break;
//				//default   �� break;  ����ʡ��
//				
//		}
		
		//  ���� case  ��͸��  �򻯺�Ĵ���  
		
		switch(month) {
		
			case 1 :
			case 2 :
			case 12 :
				
				System.out.println("����");
				break;

			case 3 :
			case 4 :
			case 5 :
				
				System.out.println("����");
				break;
				
			case 6 :
			case 7 :
			case 8 :
				
				System.out.println("�ļ�");
				break;
				
			case 9 :
			case 10 :
			case 11 :
				
				System.out.println("�＾");
				break;
			
			default:
				
				System.out.println("���������������");
		
		}

			System.out.println("����");
	}
}
