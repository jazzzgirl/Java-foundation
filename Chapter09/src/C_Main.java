public class C_Main {
	int count = 10;   // ��ü ����
	static int num = 20;  // Ŭ���� ����
	
	public int sum(int x, int y) {   // �޼ҵ� ����.
		return x + y;
	}
	
	static int mul(int x, int y) {  // Ŭ���� �޼ҵ� ����.
		return x * y;
	}

	public static void main(String[] args) {  // ���� �޼ҵ�.(Ŭ���� �޼ҵ�)
		
		int same;   // ���� �޼ҵ忡�� ������ ���� ����.
		same = count;   		// Ŭ���� ������ �ƴ�.  �Ϲ� ��ü ������ ��� �Ұ���.
		//same = num;
		System.out.println("num : " +same);
		
		same = sum(5,5);  	// Ŭ���� �޼ҵ尡 �ƴ϶� ȣ�� �Ұ���.
		//same = mul(5,5);
		System.out.println("mul : " +same);
	}
}
