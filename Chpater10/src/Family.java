/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : �������̵� ����
 */
class Parent {
	// �޼ҵ� ����
	public void print() {
		System.out.println("�θ� Ŭ���� print()�޼ҵ�");
	}
}
				  // ���
class Child extends Parent {
	//  ���� Ŭ������ print() �޼ҵ� �������̵�
	@Override
	public void print() {
		super.print();    // ���� Ŭ���� �޼ҵ� ȣ��.
		// �������� ���� �ۼ�.
		System.out.println("�ڽ� Ŭ���� print()�޼ҵ�");
	}
}

public class Family {
	public static void main(String[] args) {
		Child result = new Child();
		result.print();   // �ڽ� Ŭ������ �޼ҵ� ȣ��.
	}
}
