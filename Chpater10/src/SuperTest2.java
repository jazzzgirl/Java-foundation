/*
 * �ۼ��� : 
 * �ۼ��� :
 * ���� : ���� 10.10 super ���� 
 */
class D1 {
	int x = 1000;
	void display() {
		System.out.println("���� Ŭ���� D1�� display() �޼ҵ��Դϴ�");
	}
}
class D2 extends D1 {
	int x = 2000;
	void display() {   // �޼ҵ� �������̵�.
		System.out.println("���� Ŭ���� D2�� display() �޼ҵ��Դϴ�");
	}
	void write() {
		display();        // ���� Ŭ���� ���� display() �޼ҵ� ȣ��
		super.display();  // ���� Ŭ������ display() �޼ҵ� ȣ��
		System.out.println("D2 Ŭ���� ��ü�� x ���� : " + x);  // �� Ŭ������ �ɹ� ���� ���
												// ���� Ŭ������ �ɹ� ���� ���
		System.out.println("D1 Ŭ���� ��ü�� x ���� : " + super.x); 
	}
}
class SuperTest2 {
	public static void main(String args[]) {
		D2 d = new D2();
		d.write();
	}
}

