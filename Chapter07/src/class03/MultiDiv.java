package class03;
/*
 * �ۼ��� : 2021�� 4�� 29��
 * �ۼ��� : �а� �й� �̸�
 * ���� : MultiDiv Ŭ���� ����.
 * 		���ϱ�, ������ ����� �ִ� Ŭ����.
 * 		���ϱ�, ���� ����� �߰��� Ŭ����.
 */
public class MultiDiv extends PlusMinus {
	// �Ӽ� ����
	int multi;
	double div;
	
	
	// ���ϱ� ���(�޼ҵ�) ����
	public String multi(int x, int y) {
		multi = x * y;
		return "�� ���� ���� " + multi;
	}
	
	// ������ �޼ҵ� ����
	private String div(int x, int y) {
		div = x / y;
		return "�� ���� ��������  " + div;
	}
}
