
package heimachengxuyuan;

import java.util.Scanner;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��22�� ����9:59:31 

����:�������һ�����������ó���ʵ���жϸ���������������ż�������ڿ���̨�������������������ż����

*/

public class a034JiOuShu {
	public static void main(String[] args) {
				System.out.println("������������ݣ�");
				//��������
				Scanner sc =new Scanner(System.in);
				
				//��������     nextInt()  ����һ�������͵�����
				int x= sc.nextInt();
				
				if(x%2==0) {
					System.out.println("�������"+x+"��ż��");
				}else {
					System.out.println("�������"+x+"������");
				}
	}
}
