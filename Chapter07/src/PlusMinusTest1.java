public class PlusMinusTest1 {

	public static void main(String[] args) {
		// PlusMinus Ŭ�����κ��� ��ü ����.
		PlusMinus pm = new PlusMinus();
		
		// ���� ����.
		String sum, cha;
		
		// ��ü�� ���� PlusMinusŬ������ �ִ� �޼ҵ� ȣ��
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// ��ü�� ���ؼ� minus �޼ҵ� ȣ��
		cha = pm.minus(10, 20);
		System.out.println(cha);
	}
}