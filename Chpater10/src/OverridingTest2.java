/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� 10.8
 */
class OT2a {
	public void show(String str) {
		System.out.println("���� Ŭ������ �޼ҵ� show() ���� : " + str);
	}
}
class OT2b extends OT2a {
	// �޼ҵ� �̸� ����, �Ű����� Ÿ�� ����, �Ű����� ���� ����.
	// �������̵� -> ���� Ŭ������ �޼ҵ带 ������ �� ��.
	public void show(String s) {   		
		System.out.println("���� Ŭ������ �޼ҵ� show() ���� : " + s);
	}
}

public class OverridingTest2 {
	public static void main(String args[]) {
		OT2b otb = new OT2b();    // ���� Ŭ������ �޼ҵ� ��� ����.
		otb.show("���� �ڹ����α׷���!!!"); 
	}
}