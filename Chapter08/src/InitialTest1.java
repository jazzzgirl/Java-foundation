class Initial{
	// ��� ����. ������ �� ����. Ŭ���� ��ü���� ���.
	// Ŭ���� �� �޼ҵ� �ۿ� ����.
	int number;
	double rate;
	String name;
	int[] score;
	
	// �޼ҵ� ����(�ҹ��ڷ� ����)
	public void aMethod() {
		int count;    // �޼ҵ� ���� ����. 
		System.out.println(number);  // 0
		//System.out.println(count);  // ���� -> �ʱⰪ�� ����.
	}
}
public class InitialTest1 {
	public static void main(String args[]) {
		// main()�޼ҵ� ���� ����. �ʱⰪ ������ ����
		int var1;
		double var2;
		
		// ��ü ����.
		Initial ob1 = new Initial();
		
		System.out.println("���� ���� var1�� ���� : " + var1);  // ����
		System.out.println("���� ���� var2�� ���� : " + var2);  // ����
 		System.out.println("��ü ���� number�� ���� : " + ob1.number);  // 0 ���
		System.out.println("��ü ���� rate�� ���� : " + ob1.rate);  // 0.0 ���
		System.out.println("��ü ���� name�� ���� : " + ob1.name);  // null ���
													// ������ �� null ���
		System.out.println("��ü ���� score�� ���� : " + ob1.score);
		// ��ü�� �޼ҵ� ȣ�� 
		ob1.aMethod();  // 0 ���
	}
}