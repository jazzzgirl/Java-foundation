import java.util.Scanner;

class Box {   // Ŭ����
	int width; // ���������. Ŭ���� �������� ��� ����.
	int height;
	int depth;

	// ������. - �Ű� ������ 3���� ������.
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// �Ű� ������ ���� ������.
	public Box() {
		width = 1;
		height = 2;
		depth = 3;
	}
}

public class Volume {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int w = stdIn.nextInt();   
		System.out.print("���� �Է� : ");
		int h = stdIn.nextInt(); 
		System.out.print("���� �Է� : ");
		int d = stdIn.nextInt(); 
		
		// ��ü �����
		Box mybox1 = new Box(w, h, d);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("�Է� ���� ���� �ڽ� ���� : " + vol);
		
		Box mybox2 = new Box();
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("������ ���� �ڽ� ���� : " + vol);
	}
}