
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��6��21�� ����2:27:48 


*/

public class a025DuanLuLuoJiYunSuanFu {
	public static void main(String[] args) {
		
		
		
		
		/*
		 * �߼���	&   ���������� �ұ߶�Ҫִ��
		 * ��·��	&&  ������Ϊ�� �ұ�ִ�� ������Ϊ�٣��ұ߲�ִ��
		 * 
		 * 
		 * �߼���	|   ����������  �ұ߶�Ҫִ��
		 * ��·��	||  ������Ϊ�٣��ұ�ִ�У�������Ϊ�棬�ұ߲�ִ��
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */

		int i=10;
		int j=20;
		int a=10;
		int b=20;
		
		int k=30;
		
		
		//&&  ��false��false  
		System.out.println((i>j)&&(i>k));  //false && false      false
		System.out.println((i<j)&&(i>k));  //true  && false      false
		System.out.println((i>j)&&(i<k));  //false && true       false
		System.out.println((i<j)&&(i<k));  //true  && true       false
		System.out.println("------------------------");
		
		
		//||   ��true��true
		System.out.println((i>j) ||  (i>k));  //false || false     false
		System.out.println((i<j) ||  (i>k));  //true  || false     true
		System.out.println((i>j) ||  (i<k));  //false || true      true
		System.out.println((i<j) ||  (i<k));  //true  || true      true
		System.out.println("------------------------");		
		
		//  &&��&
		System.out.println((a++ >100)&(b++>100));    //false &&  false
		System.out.println("a��"+a);      
		System.out.println("b��"+b);
		//�߼���	&   ���������� �ұ߶�Ҫִ��    a++  b++��ִ��һ��
		
		System.out.println((i++ >100)&&(j++>100));    //false &&  false
		System.out.println("i��"+i);      
		System.out.println("j��"+j);
		//��·��	&&  ������Ϊ�� �ұ�ִ��  i++ִ��һ��     ������Ϊ�٣��ұ߲�ִ�� j++��ִ��
		
		
		
		
	}
}
