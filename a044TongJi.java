
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��10��23�� ����12:26:08 


0����:ͳ��
����:ͳ�ơ�ˮ�ɻ�����-���ж��ٸ��� ���ڿ���̨�������
�ٶ������count,���ڱ��桰ˮ�ɻ���������������ʼֵΪ0
	int count = 0;
�����ж�ˮ�ɻ����Ĺ����У����������������������Ϊ�޸�count��ֵ��ʹcount+1
	if(a*a*a+b*b*b+c*c*c==ԭ��){
		count++;
	}

*/

public class a044TongJi {
	public static void main(String[] args) {
		
		int count=0;
		
		
		for(int i=100;i<=999;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10%10;
			
			
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i) {
				count++;
			}
			
			
			
		}
		
		System.out.println("100--999ˮ�ɻ�����"+count+"��");
	}
}
