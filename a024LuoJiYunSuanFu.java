
package heimachengxuyuan;

/** 

* @author ���� Your-Name:   ����

* @version ����ʱ�䣺2021��6��21�� ����2:12:22 


*/

public class a024LuoJiYunSuanFu {
	public static void main(String[] args) {
		/*5.1�߼����������
			����ѧ�У�-������x,����3,С��6,���ǿ������������б�ʾ: 3<x<6.
			��Java�У���Ҫ�������ʽ���Ƚ��в�⣬�ٽ��кϲ���
			����Ϊ: x>3��x<6
			��ϲ���: x>3&&x<6

		 * 
		 * 
		 * &&�߼���������������ӹ�ϵ���ʽ�������
		 * �߼������Ҳ����ֱ�����Ӳ������͵ĳ������߱���
		 * 
		 * &	�߼���
		 * |	�߼���
		 * ^	�߼����
		 * !	�߼���
		 * 
		 * */
		
		
		int i=10;
		int j=20;
		int k=30;
		
		
		//&   ��false��false
		System.out.println((i>j)&(i>k));  //false & false
		System.out.println((i<j)&(i>k));  //true  & false
		System.out.println((i>j)&(i<k));  //false & true
		System.out.println((i<j)&(i<k));  //true  & true
		System.out.println("------------------------");
		
		
		//|   ��true��true
		System.out.println((i>j) |  (i>k));  //false | false
		System.out.println((i<j) |  (i>k));  //true  | false
		System.out.println((i>j) |  (i<k));  //false | true
		System.out.println((i<j) |  (i<k));  //true  | true
		System.out.println("------------------------");		
		
		
		//^   ��ͬΪfalse  ��ͬΪtrue
		System.out.println((i>j) ^  (i>k));  //false  ^ false
		System.out.println((i<j) ^  (i>k));  //true   ^ false
		System.out.println((i>j) ^  (i<k));  //false  ^ true
		System.out.println((i<j) ^  (i<k));  //true   ^ true
		System.out.println("------------------------");		
		
		
		
		//�� !a ��ԭ���Ľ��a�෴      a=!!a  
		System.out.println((i>j) );        //  false 
		System.out.println(!(i>j) );       //  !false   
		System.out.println(!!(i>j) );      //  !!false  
		System.out.println(!!!(i>j) );     //  !!!false  
		
		
		
	}
}
