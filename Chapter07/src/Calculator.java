/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : PlusMinus Ŭ�����κ��� ��ü ����.
 * 		 ��� ���.
 */
public class Calculator {

	public static void main(String[] args) {
		// PlusMinus Ŭ�����κ��� ��ü ����.
		PlusMinus pm = new PlusMinus();
		// MultiDiv Ŭ�����κ��� ��ü ����.
		MultiDiv md = new MultiDiv();

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
		
		// md ��ü�� ���� div �޼ҵ� ȣ��
		result = md.div(5, 2);
		// ���� �߻� ���� : div �޼ҵ�� private ���� ����Ǿ� ������ �Ұ����ϴ�.
		
	}
}