/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : ���� 10.6
 */
class DB1 {
	public DB1() {  
		System.out.println("Ŭ���� DB1�� ������ ������ ����");
	}
}
class DB2 extends DB1 {
	public DB2() {
		System.out.println("Ŭ���� DB2�� ������ ������ ����");
	}
	public DB2(int a) {	
		System.out.println("Ŭ���� DB2�� ����� ������ ����");
	}
}
class DB3 extends DB2 {
	public DB3() {
		System.out.println("Ŭ���� DB3�� ������ ������ ����");
	}
	public DB3(int a) {    // ���� Ŭ������ ������ ������ ȣ��
		System.out.println("Ŭ���� DB3�� �����(�Ű�����1��) ������ ����");
	}
}
public class DefaultInheritanceTest2 {
	  public static void main(String args[]) {
		  DB3 super1 = new DB3(5);
		  System.out.println("---------");
		  DB2 super2 = new DB2();
	  }
}