
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����12:33:07 


2.1 whileѭ������ʽ

������ʽ:

	while (�����ж����) {
		ѭ�������;
	}


������ʽ: !

		��ʼ�����;
		while (�����ж����) {
			ѭ�������;
			�����������;
		}

ִ������:
	��ִ�г�ʼ�����
	��ִ�������ж���䣬��������true����false
		�����false,ѭ������
		�����true,����ִ��
	��ִ��ѭ�������
	��ִ�������������
	�ݻص��ڼ���



*/

public class a045_while_XunHuanYuJu {
	public static void main(String[] args) {
		
	//����:�ڿ���̨���s"HelloHoEld"
		
		//for ѭ�� ʵ��
		for(int i=1;i<=5;i++) {
			System.out.println("hello worid");
		}
		
		System.out.println("--------------------");
		
		//while ѭ��ʵ��
		int j=1;
		while(j<=5) {
			System.out.println("hello  worid");
			j++;
		}

		
	}
}
