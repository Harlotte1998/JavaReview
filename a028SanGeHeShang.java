
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��6��21�� ����2:55:05 


*/

public class a028SanGeHeShang {
	public static void main(String[] args) {
		
		//���������������ڱ���������
		int height1=180;
		int height2=170;
		int height3=300;
		
		//����Ԫ�������ȡǰ�������еĽϸ����ֵ  
		//������ʱ��߱�����������
		
		int height4= height1>height2 ? height1  : height2;
		
		
		//����Ԫ�������ȡ��ʱ���ֵ�͵�����������߽ϸ�ֵ  ����������������
		int height = height4>height3 ? height4  : height3;
		
		System.out.println("��ߵ����:"+height);
		
	}
}
