/*
 * 2���� ������ �Է� �޾� ���� ����Ͻÿ�.
 * Ŭ������ �޼ҵ� ���.
 */

import java.util.Scanner;

class Math02{  // ����� �ִ� Ŭ����
	// ��� ������ ����, �޼ҵ常 �ִ� Ŭ����
	public int add(int x, int y) {  // 2���� �Ű� ������ �ִ� ���ϱ� �޼ҵ�
		return x + y;  // �޼ҵ带 ȣ���� ������ ���� ������(����).
	}
}

public class MathTest02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Math02 obj = new Math02();  // Math Ŭ�����κ��� ��ü ����.
		
		System.out.print("ù ��° ���� �Է� : ");
		int x = stdIn.nextInt();   
		System.out.print("�� ��° ���� �Է� : ");
		int y = stdIn.nextInt();  
		
		// �Է� ���� ���� Math Ŭ������ add() �޼ҵ�� ���޵�(�޼ҵ� ȣ��).
		int sum = obj.add(x, y);  
		System.out.println(x + " + " + y + " = " + sum);
	}
}
