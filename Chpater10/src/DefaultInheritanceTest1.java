/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� 10.5
 */

class DA1 {
	public DA1() {  // Ŭ���� DA1�� ������ ������
		System.out.println("Ŭ���� DA1�� ������ ������ ����");
	}
}
class DA2 extends DA1 {
	public DA2() {  // Ŭ���� DA2�� ������ ������
		System.out.println("Ŭ���� DA2�� ������ ������ ����");
	}
}
class DA3 extends DA2 {
	public DA3() {	  // Ŭ���� DA3�� ������ ������
		System.out.println("Ŭ���� DA3�� ������ ������ ����");
	}
}
public class DefaultInheritanceTest1 {
	  public static void main(String args[]) {
		  DA3 super1 = new DA3();
		  System.out.println("-----");
		  DA2 super2 = new DA2();  
	  }
}