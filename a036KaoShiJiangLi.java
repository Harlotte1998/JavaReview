
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��22�� ����10:17:33 

//���ݲ���: ��ȷ���ݣ��߽����ݣ���������

*/

public class a036KaoShiJiangLi {
	public static void main(String[] args) {
		System.out.println("��������ĳɼ���");
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		
		 if(score>=90 && score<=100 ) {
			System.out.println("�ɼ����� 91--100");
			
		} else if(score>=81 && score<=90) {
			System.out.println("�ɼ�һ�� 81--90");
			
		} else if(score>=71 && score<=80) {
			System.out.println("�ɼ����� 71--80");
			
		} else if(score>=61 && score<=70) {
			System.out.println("�ɼ�����61--70");
			
		} else if(score>=51 && score<=60) {
			System.out.println("�ɼ����� 51--60");
			
		} else if(score>=01 && score<=50) {
			System.out.println("�ɼ��ܲ� 0--50");
		}  else {
			System.out.println("���������������");
		}
		
		 
	}
}
