/*
 * �ۼ��� : 
 * �ۼ��� :
 * ���� : ���� 10.12 
 */
class AAA {
	public int a;
	public int b;
	public double c;
}

public class ObjectMethodTest1 {
	public static void main(String args[]) {
		AAA aa = new AAA();
		System.out.println(aa);  // toString()�޼ҵ� �ڵ� ȣ��.  
		System.out.println(aa.toString()); // toString()�޼ҵ� ����� ȣ��.
		
		AAA bb = new AAA();
		System.out.println(bb);
		System.out.println(bb.toString());
		
		AAA cc = new AAA();
		System.out.println(cc);
		System.out.println(cc.toString());
		
		Integer ii = new Integer(99);  // Integer Ŭ�������� toString �޼ҵ� �������̵��Ͽ� ���.
		System.out.println(ii);   // ���� ������ ���.
		System.out.println(ii.toString());
	}
}
