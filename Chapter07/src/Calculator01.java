/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� �޼ҵ尡 �ִ� Ŭ������ �ٸ� Ŭ���� �����Ͽ� ����ϴ� ���.
 */

// Ŭ���� ����. - ���� ������ ������� ����.
class PlusMinus01 {
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


class MultiDiv01 extends PlusMinus01 {
	// �Ӽ� ����
	int multi;
	double div;
	
	// multi �޼ҵ�(���) ����
	public String multi(int x, int y) {
		multi = x * y;
		return "�� ���� ���� " + multi;
	}
	// div �޼ҵ�(���) ����
	public String div(int x, int y) {
		div = x / y;
		return "�� ���� ���� ���� " + div;
	}
}

public class Calculator01 {

	public static void main(String[] args) {
		// PlusMinus Ŭ�����κ��� ��ü ����.
		PlusMinus01 pm = new PlusMinus01();
		// MultiDiv Ŭ�����κ��� ��ü ����.
		MultiDiv01 md = new MultiDiv01();

		// ���� ����.
		String sum, cha, multi, result;
		
		// ��ü�� ���� PlusMinusŬ������ �ִ� �޼ҵ� ȣ��
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// ��ü�� ���ؼ� minus �޼ҵ� ȣ��
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// ��ü�� ���ؼ� multi �޼ҵ� ȣ��.
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md ��ü�� ���ؼ� ���ϱ� ��� ���
		result = md.plus(3, 5);
		System.out.println(result);

	}

}
