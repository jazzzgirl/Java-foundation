/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���� 9.3 - ������ �����ε� - �Ű������� ���� �޶�� �Ѵ�.
 */
class Box6 {
	int width;  // ���������. Ŭ���� �������� ��� ����.
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	// ������ �����ε� - �Ű������� ������ ������ �Ű������� ���� ���� �ٸ���.
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}

public class Box6Test1 {
	public static void main(String args[]) {
		// �Ű������� �������� ������ ȣ��.
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("�ڽ��� ����(���� �Ű� ����) : " + vol);
		
		// �Ű� ������ �Ǽ����� ������ ȣ��.
		mybox1 = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("�ڽ��� ����(�Ǽ� �Ű� ����) : " + dvol);
		
		// �μ� ���� ����, �Ǽ��� ȥ�յǾ� �ִ� ��� �ڵ����� Ȯ�������� ��ȯ�Ǿ� ������ ȣ��.
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("�ڽ��� ����(������ �Ǽ� ȥ��) : " + dvol);
	}
}
