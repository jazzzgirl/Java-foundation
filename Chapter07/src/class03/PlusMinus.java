package class03;
/*
 * �ۼ��� : 2021�� 4�� 27��
 * �ۼ��� : �а� �й� �̸�
 * ���� : PlusMinus Ŭ���� ����.
 * 		���ϱ�, ���� ����ϴ� ����� �ִ�.
 */
public class PlusMinus {
	// �Ӽ� ���� - ���� ����(����)
	int plus, minus;
	
	// plus ��� ����(�޼ҵ�)
	// 2���� ������ ���� ���� �޾� �հ踦 ���� ���� �����ش�.
	// �����ش� -> �޼ҵ带 ȣ���� ������ �����Ѵ�.
	public String plus(int x, int y) {
		plus = x + y;
		return "�� ���� ���� " + plus;
	}
	
	// minus �޼ҵ� ����
	// 2���� ������ ���� ���� �޾� ���� ���Ͽ� ���� �����ش�.
	public String minus(int x, int y) {
		minus = x - y;
		return "�� ���� ���� " + minus;
	}
}
