/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� 10.2
 */

class A {
	public int aa = 1;   // ��� ����. ��� ���� ����.
}

class B extends A {   // A�� ��� ����.
	private int bb = 2;   // ��� ����. �� Ŭ���� �������� ���� ����
	public int bb() {     // �޼ҵ�. ��� ���� ����.
		return bb;     // �� �޼ҵ带 �̿��Ͽ� �ܺο����� ������ �Ұ����� bb��������� ��� �� �� �ִ�.
	}
}

class C extends B {   // B�� ���.
	int cc = 3;    // ��� ����. ������ ����.  ���� ��Ű�� �������� ���� ����.
}

public class InheritanceTest1  {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ���� " + objc.aa);  // 1
		 									// ���� �߻�. private�� ����Ǿ.. 
		//System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb);
		                       
										                 // �޼ҵ�� �����ϸ� �ȴ�.
		System.out.println("objc��ü�� ��ü �Ӽ� ���� bb�� ���� " + objc.bb());	  // 2
		
		System.out.println("objc��ü�� ��ü �Ӽ� ���� cc�� ���� " + objc.cc);  // 3
	}
}

/*
private�� ����� �ɹ������� �޼ҵ�� ��� �Ұ���.
������ �޼ҵ带 �̿��Ͽ� ���������� ���� ������ ��� ����.
*/