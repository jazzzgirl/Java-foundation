/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : ���� 9.2 - ������ �����ε� - �Ű������� ������ �޶�� �Ѵ�.
 */
class Box5 {
	int width;  // �Ӽ� ���� , ��ü���� ����.
	int height;
	int depth;
	
	public Box5() {  // �Ű������� ���� ������	
		width = 1;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w) {  // �Ű������� 1���� ������	
		width = w;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w, int h) {  // �Ű������� 2���� ������	
		width = w;
		height = h;
		depth = 1;
	}

	public Box5(int w, int h, int d) {  // �Ű������� 3���� ������	
		width = w;
		height = h;
		depth = d;
	}
}

public class Box5Test1 {
	public static void main(String args[]) {
		// �Ű� ������ ���� ������ ȣ��
		Box5 mybox1 = new Box5();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� ����) : " + vol);    
	    
	    // �Ű� ������ 1���� ������ ȣ��.
	    mybox1 = new Box5(10);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 1��) : " + vol);
	    
	    // �Ű� ������ 2���� ������ ȣ��.
	    mybox1 = new Box5(10,20);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 2��) : " + vol);
	    
	    // �Ű� ������ 3���� ������ ȣ�� - �ڽ��� ���� ���.
	    mybox1 = new Box5(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("�ڽ��� ����(�Ű� ���� 3��) : " + vol);
	}
}