/*
 * 2���� ������ �Է� �޾� ���� ����Ͻÿ�.
 * Ŭ������ �޼ҵ� ���.
 */
import java.util.Scanner;

class Math{  // ����� �ִ� Ŭ����	
	public int sum;   // ��� ���� - ��ü����

	public int add(int x, int y) {  // 2���� �Ű� ������ �ִ� ���ϱ� �޼ҵ�
		sum = x + y;
		return sum;  // �޼ҵ带 ȣ���� ������ ���� ������(����).
	}
}

public class MathTest01 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Math plus = new Math();  // Math Ŭ�����κ��� ��ü ����.
		
		System.out.print("ù ��° ���� �Է� : ");
		int x = stdIn.nextInt();   
		System.out.print("�� ��° ���� �Է� : ");
		int y = stdIn.nextInt();  
		
		// �Է� ���� ���� Math Ŭ������ add() �޼ҵ�� ���޵�(�޼ҵ� ȣ��).
		int sum = plus.add(x, y);  
		System.out.println(x + " + " + y + " = " + sum);
	}
}
