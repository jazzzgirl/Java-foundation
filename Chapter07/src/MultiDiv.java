/*
 * �ۼ��� : 2021�� 4�� 29��
 * �ۼ��� : �а� �й� �̸�
 * ���� : MultiDiv Ŭ���� ����.
 * 		���ϱ�, ������ ����ϴ� ����� �ִ�.
 * 		�׸��� ���ϱ� ���� ��ɵ� �ִ�.(�߰�)
 */
public class MultiDiv extends PlusMinus {
	// �Ӽ� ����
	int multi;
	double div;
	
	// multi �޼ҵ�(���) ����
	public String multi(int x, int y) {
		multi = x * y;
		return "�� ���� ���� " + multi;
	}
	// div �޼ҵ�(���) ����
	private String div(int x, int y) {
		div = x / y;
		return "�� ���� ���� ���� " + div;
	}
}
