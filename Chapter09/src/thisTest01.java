/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���࿡ this ���� 1
 */
class Box1 {
	int width;   // ��� ����, ��ü����
	int height;
	int depth;
	
	// ������.
	public Box1(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
}

public class thisTest01 {
	public static void main(String[] args) {
		Box1 mybox = new Box1(10,20,30);
	    System.out.println(mybox.width);
	}
}
