/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���࿡ this ���� 4 - this�� �ٸ� �뵵 : �ٸ� ������ ȣ�� �� ���.
 */
class Box4 {
	int width;
	int height;
	int depth;
	
	public Box4() { // ������ - �����ε�
		// ������ ������ �ܵ����� ���. �ݵ�� ù ��° ���ο� ��ġ�ؾ� �Ѵ�.
		// Ŭ���� ���� �ٸ� ������ ȣ���� ���ؼ� ���.
		this(1,1,1);   // �Ű������� 3���� �����ڸ� ȣ���Ͻÿ�.
		System.out.println("�Ű� ���� ���� ������ ����");
	}
	
	public Box4(int width, int height, int depth) { // ������ - �����ε�	
		System.out.println("�Ű� ����(3��) ������ ����");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest04 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� ����) : " + vol +"\n");
	    
	    mybox1 = new Box4(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 3��) : " + vol);
	}
}
