/*
 * �ۼ��� : 
 * �ۼ��� :
 * ���� : ���� 10.13 
 */
class AAA1 {
	public int a=10;
	public String toString() {  //toString �޼ҵ� �������̵��Ͽ� ���.
		return "AAA1 Ŭ���� ��ü, �Ӽ� a�� ���� : " + a;
	}
}
public class ObjectMethodTest2 {
	public static void main(String args[]) {
		AAA1 aa = new AAA1();
		System.out.println(aa);  // �������̵� �� toString()�޼ҵ� ȣ��.  
		System.out.println(aa.toString());
	}
}
