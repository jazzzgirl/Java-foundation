/*
 * �ۼ��� : 
 * �ۼ��� : 
 * ���� : �޼ҵ� �����ε� - ���� 9.9
 */
class Box11 {
	private int ivol;     // ��ü ����(�Ӽ�)
	private double dvol;  // ��ü ����
	
	public Box11(int w, int h, int d)   // ������ �����ε�
	{
		volume(w,h,d);   // 3���� ������ �Ű����� ���� ������ volume �޼ҵ� ȣ��
	}
	public Box11(double w, double h, double d)   // ������ �����ε�
	{
		volume(w,h,d);   // 3���� �Ǽ��� �Ű����� ���� ������ volume �޼ҵ� ȣ��
	}
	
	// �޼ҵ� �����ε� - �����ִ� ���� ����.  �ܺο��� ���� �Ұ���.
	private void volume(int w, int h, int d)  // ���� Ŭ���� ������ �����ڳ� �޼ҵ尡 ȣ���ؼ� ��� ����.
	{
		ivol = w * h * d;	  // 3���� ���� ���� ���� �޾� ���Ǹ� ����Ѵ�.	
	}
	private void volume(double w, double h, double d)  // �޼ҵ� �����ε�
	{
		dvol = w * h * d;	  // 3���� �Ǽ� ���� ���� �޾� ���Ǹ� ����Ѵ�.
	}
	
	public int get_ivol() {   // �޼ҵ�
		return ivol;    // ������ ������ ���� ������ ����� �����ش�.
	}
	public double get_dvol() {   // �޼ҵ�
		return dvol;    // �Ǽ��� ������ ���� ������ ����� �����ش�.
	}
}

// ���� �޼ҵ尡 �ִ� Ŭ����.
public class Box11Test1 {
	public static void main(String args[]) {
		Box11 mybox1 = new Box11(10,20,30);  // ��ü ����. - �Ű������� ������ 3���� ������ ȣ��. 
		System.out.println("�ڽ��� ����(���� �Ű� ����) : " + mybox1.get_ivol());
		
		mybox1 = new Box11(10.5, 20.5, 30.5);  // ��ü ����. - �Ű������� �Ǽ��� 3���� ������ ȣ��. 
		System.out.println("�ڽ��� ����(�Ǽ� �Ű� ����) : " + mybox1.get_dvol());
		
		mybox1 = new Box11(10,20,30.5);   // �ڵ� Ȯ�� - �Ǽ��� ������ ȣ��.
		System.out.println("�ڽ��� ����(������ �Ǽ� ȥ��) : " + mybox1.get_dvol());
	}
}