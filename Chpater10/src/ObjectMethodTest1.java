/*
 * 작성일 : 
 * 작성자 :
 * 설명 : 예제 10.12 
 */
class AAA {
	public int a;
	public int b;
	public double c;
}

public class ObjectMethodTest1 {
	public static void main(String args[]) {
		AAA aa = new AAA();
		System.out.println(aa);  // toString()메소드 자동 호출.  
		System.out.println(aa.toString()); // toString()메소드 명시적 호출.
		
		AAA bb = new AAA();
		System.out.println(bb);
		System.out.println(bb.toString());
		
		AAA cc = new AAA();
		System.out.println(cc);
		System.out.println(cc.toString());
		
		Integer ii = new Integer(99);  // Integer 클래스에는 toString 메소드 오버라이딩하여 사용.
		System.out.println(ii);   // 가진 정수값 출력.
		System.out.println(ii.toString());
	}
}
