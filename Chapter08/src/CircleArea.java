import java.util.Scanner;

class SimpleCircle {
	// Ŭ���� ���� / ���� ���� : ��� ����.
	static final double PI = 3.14159;  
}

public class CircleArea {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print( "���� �������� �Է��ϼ��� : ");
		int radius = stdIn.nextInt();
		
		System.out.println("���� �������� : " + radius );
		
		// Ŭ�������� ���� Ŭ����  ������ �̿�.
		double area = radius * radius*SimpleCircle.PI;  
		System.out.println("���� ���̴� : " + area);
	}
}