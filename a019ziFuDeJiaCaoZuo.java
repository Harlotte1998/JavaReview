package heimachengxuyuan;


//�ַ���+����
/*
 * �ַ���+���������ַ��ڼ�����ײ��Ӧ����ֵ���м���
 * 'A'    65    A--Z��������
 * 'a'    97    a--z��������
 * '0'    48
 * 
 * �������ʽ�а�����������������͵�ֵ��ʱ�������������ʽ�����ͻ�
 * �Զ�����������
 * ��������
 * byte����  short����  char���� �����ᱻ������int����
 * �������ʽ�������Զ���������ߵȼ�������ͬ��������
 * �ȼ�˳��
 * byte  short  char  int  long  float  double
 * 
 
 *  
 * */


public class a019ziFuDeJiaCaoZuo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		char  c = 'A';              //  A��Ascllֵ�� 65
		System.out.println(c);
		//���һ��  �ַ�    A
		
		int  i=10;
		System.out.println(i+c);
		//���   75   ��ʱ������� A  �� ascll��ֵ   ��  10  ��ӵĽ��
		
		
		//char ch = i + c;
		//System.out.println(ch);  �ᱨ�� 
		//  char���ͻᱻ�Զ�����Ϊ  int  ����
		int ch =i+c;
		System.out.println(ch);
		
		//  int k=12+13.13;   �ᱨ��   int���͵�����  ���ܽ��� ������
		double  k=12+12.65;
		System.out.println(k);
		
		
	}
}
