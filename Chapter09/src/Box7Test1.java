class Box7 {
	int width;
	int height;
	int depth;
	public Box7()  // ������ - �����ε�
	{	// ������ ������ �ܵ����� ���.
		// �ݵ�� ù ��° ���ο� ��ġ!!!'
		// Ŭ���� ���� �ٸ� ������ ȣ���� �� ���.
		this(1,1,1);  // this �̿��Ͽ� 3���� �Ű����� ���� ������ ȣ��
		System.out.println("�Ű� ���� ���� ������ ����");
	}
	public Box7(int width, int height, int depth)  // ������ - �����ε�
	{
		System.out.println("�Ű� ����(3��) ������ ����");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class Box7Test1 {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� ����) : " + vol +"\n");

		mybox1 = new Box7(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 3��) : " + vol);
	}
}