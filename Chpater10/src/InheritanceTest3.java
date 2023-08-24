/*
 * 작성일 :
 * 작성자 :
 * 설명 : 예제 10.4
 */
class C1 {
	private static int x = 100;
	public static int y = x;
	static int z = x;       // 클래스 변수
 	public static int cc() {    // 클래스 메소드
 		return x;
 	}
}

class C2 extends C1 {
	public static String x;  // 상위 클래스의 클래스 변수와 이름 동일
	static int y;  // 상위 클래스의 클래스 변수와 이름 동일
}

class InheritanceTest3 {
	public static void main(String args[]) {
		System.out.println("클래스 메소드 C1.cc() 값 : " + C1.cc());  // 100
		System.out.println("클래스 변수 C1.y 값 : " + C1.y);   // 100
	    System.out.println("클래스 변수 C1.z 값 : " + C1.z);   // 100
	    System.out.println("클래스 변수 C2.x 값 : " + C2.x);   // null
	    System.out.println("클래1스 변수 C2.y 값 : " + C2.y);  // 0
	    System.out.println("클래스 변수 C2.z 값 : " + C2.z);   // 100
	    System.out.println("클래스 메소드 C2.cc() 값 : " + C2.cc());  // 100
	    C2.x = "처음 시작하는 자바";
	    C2.y = 200; 
	    C1.z = 300;   //C2.z = 300;도 가능
	    System.out.println("클래스 변수 C2.x 값 : " + C2.x);  // 처음 시작하는 자바
	    System.out.println("클래스 변수 C2.y 값 : " + C2.y);  // 200
	    System.out.println("클래스 변수 C2.x 값 : " + C2.z);  // 300
  }
}
/* 
	같은 이름으로 선언된 클래스 변수와 클래스 메소드의 경우
	상위 클래스의 클래스 변수와 클래스 메소드는 가려짐.
	하위 클래스 우선 순위.  
*/