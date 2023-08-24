/*
 * 작성일 :
 * 작성자 :
 * 설명 : 예제 10.5
 */

class DA1 {
	public DA1() {  // 클래스 DA1의 묵시적 생성자
		System.out.println("클래스 DA1의 묵시적 생성자 수행");
	}
}
class DA2 extends DA1 {
	public DA2() {  // 클래스 DA2의 묵시적 생성자
		System.out.println("클래스 DA2의 묵시적 생성자 수행");
	}
}
class DA3 extends DA2 {
	public DA3() {	  // 클래스 DA3의 묵시적 생성자
		System.out.println("클래스 DA3의 묵시적 생성자 수행");
	}
}
public class DefaultInheritanceTest1 {
	  public static void main(String args[]) {
		  DA3 super1 = new DA3();
		  System.out.println("-----");
		  DA2 super2 = new DA2();  
	  }
}