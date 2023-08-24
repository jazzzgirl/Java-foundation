/*
 * 작성일 :
 * 작성자 :
 * 설명 : 예제 10.6
 */
class DB1 {
	public DB1() {  
		System.out.println("클래스 DB1의 묵시적 생성자 수행");
	}
}
class DB2 extends DB1 {
	public DB2() {
		System.out.println("클래스 DB2의 묵시적 생성자 수행");
	}
	public DB2(int a) {	
		System.out.println("클래스 DB2의 명시적 생성자 수행");
	}
}
class DB3 extends DB2 {
	public DB3() {
		System.out.println("클래스 DB3의 묵시적 생성자 수행");
	}
	public DB3(int a) {    // 상위 클래스의 묵시정 생성자 호출
		System.out.println("클래스 DB3의 명시적(매개변수1개) 생성자 수행");
	}
}
public class DefaultInheritanceTest2 {
	  public static void main(String args[]) {
		  DB3 super1 = new DB3(5);
		  System.out.println("---------");
		  DB2 super2 = new DB2();
	  }
}