/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���࿡ this ���� 2 - �ǹ� �ִ� �ܾ�� �Ű� ���� ����.
 */
class Box2 {
	int width;   // ��� ����
	int height;
	int depth;
	
	// ������.
	public Box2(int width, int height, int depth)
	{
		width = width;   // �ǹ��ִ� �Ű� ������ ��� ���� ��, ��� �޼���.
		height = height; // �� �ڽſ��� �� �ڽ��� ���� �����϶�� �ǹ�....
		depth = depth;
	}
}

public class thisTest02 {
	public static void main(String[] args) {
		Box2 mybox = new Box2(10,20,30);
	    System.out.println(mybox.width);
	    // ����� �ǹ� ���� 0�� ��µȴ�.
	}
}
