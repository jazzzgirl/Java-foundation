public class C_Main2 {
	int count = 10;		   // ��ü ����
	static int num = 20;   // Ŭ���� ����.
	
	public int sum(int x, int y) {   // �Ϲ� �޼ҵ�
		return x + y;
	}
	
	static int mul(int x, int y) {   // Ŭ���� �޼ҵ�
		return x * y;
	}
	
	public static void main(String[] args) {
		// ��ü ���� ���� �ϸ� ��.
		C_Main2 s = new C_Main2();
		
		int same;  // ��������
		same = s.count;   // ��ü�� ���ؼ� ��ü ���� ���.
		System.out.println("count : " + same);

		same = C_Main2.num;   // Ŭ���� �����̴ϱ� Ŭ���� ������ ���� ����.
		System.out.println("num : " + same);
		
		// sum �޼ҵ� ȣ��. sum(5,5)
		same = s.sum(5, 5);
		System.out.println("sum : " + same);
		
		same = C_Main2.mul(5, 5);
		System.out.println("mul : " + same);
	}
}
