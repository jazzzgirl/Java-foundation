/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���࿡ this ���� 3 - this ���.
 */
class Box3 {
	int width;   // ��� ����, ��ü ����
	int height;
	int depth;
	
	// ������.
	// �Ű� ���� ��� ��ü ���� ���� ���� ���, ��ü������ �ǹ��ϴ� this�� ����Ѵ�.
	public Box3(int width, int height, int depth)
	{
		this.width = width;  // this.width = ��ü ���� �ǹ�. 
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest03 {
	public static void main(String[] args) {
		Box3 mybox = new Box3(10,20,30);
	    System.out.println(mybox.width);
	}
}
