/*
 * ���� 8.4
 */

// Ŭ���� ����.
class Box3 {
	int width, height, depth;  // ��� ���� - ��ü ����
	long idNum;  // ��� ���� - ��ü ����
	static long boxID = 0; // Ŭ���� ���� 
	
	// �����ڴ� ��ü�� ������ �� �ڵ����� ����(ȣ��) ��.
	public Box3() {   // ������ �޼ҵ� - Ŭ���� ��� ���� �޼ҵ� 
		idNum = ++boxID;
	}
}	

// ���� Ŭ����
class Box3Test1 {
	public static void main(String args[]) {
		// ��ü ����.   ���� �����ڰ� �����.
		Box3 mybox1 = new Box3();
		Box3 mybox2 = new Box3();
		Box3 mybox3 = new Box3();
		Box3 mybox4 = new Box3();

		  										// ��ü �� ���� �� ���
		System.out.println("mybox1�� id ��ȣ : " + mybox1.idNum);
		System.out.println("mybox2�� id ��ȣ : " + mybox2.idNum);
		System.out.println("mybox3�� id ��ȣ : " + mybox3.idNum);
		
												// ��ü�� ���ؼ� Ŭ���� ���� �� ���
												// ������ �ƴ����� �̷��� ������� �ʴ´�.
		System.out.println("mybox4�� id ��ȣ : " + mybox4.boxID);
		
												// Ŭ�������� ���ؼ� Ŭ���� ���� ���� ����ϴ� ���� ��Ģ
		System.out.println("������ ������ �ڽ� ��ȣ�� "+ Box3.boxID + "�� �Դϴ�");
	}
}