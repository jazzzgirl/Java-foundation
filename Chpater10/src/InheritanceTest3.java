/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� 10.4
 */
class C1 {
	private static int x = 100;
	public static int y = x;
	static int z = x;       // Ŭ���� ����
 	public static int cc() {    // Ŭ���� �޼ҵ�
 		return x;
 	}
}

class C2 extends C1 {
	public static String x;  // ���� Ŭ������ Ŭ���� ������ �̸� ����
	static int y;  // ���� Ŭ������ Ŭ���� ������ �̸� ����
}

class InheritanceTest3 {
	public static void main(String args[]) {
		System.out.println("Ŭ���� �޼ҵ� C1.cc() �� : " + C1.cc());  // 100
		System.out.println("Ŭ���� ���� C1.y �� : " + C1.y);   // 100
	    System.out.println("Ŭ���� ���� C1.z �� : " + C1.z);   // 100
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.x);   // null
	    System.out.println("Ŭ��1�� ���� C2.y �� : " + C2.y);  // 0
	    System.out.println("Ŭ���� ���� C2.z �� : " + C2.z);   // 100
	    System.out.println("Ŭ���� �޼ҵ� C2.cc() �� : " + C2.cc());  // 100
	    C2.x = "ó�� �����ϴ� �ڹ�";
	    C2.y = 200; 
	    C1.z = 300;   //C2.z = 300;�� ����
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.x);  // ó�� �����ϴ� �ڹ�
	    System.out.println("Ŭ���� ���� C2.y �� : " + C2.y);  // 200
	    System.out.println("Ŭ���� ���� C2.x �� : " + C2.z);  // 300
  }
}
/* 
	���� �̸����� ����� Ŭ���� ������ Ŭ���� �޼ҵ��� ���
	���� Ŭ������ Ŭ���� ������ Ŭ���� �޼ҵ�� ������.
	���� Ŭ���� �켱 ����.  
*/