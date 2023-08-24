/*
 * 작성일 :
 * 작성자 :
 * 설명 : 예제 10.2
 */

class A {
	public int aa = 1;   // 멤버 변수. 모두 접근 가능.
}

class B extends A {   // A를 상속 받음.
	private int bb = 2;   // 멤버 변수. 이 클래스 내에서만 접근 가능
	public int bb() {     // 메소드. 모두 접근 가능.
		return bb;     // 이 메소드를 이용하여 외부에서는 접근이 불가능한 bb멤버변수를 사용 할 수 있다.
	}
}

class C extends B {   // B를 상속.
	int cc = 3;    // 멤버 변수. 힌정자 없음.  같은 패키지 내에서만 접근 가능.
}

public class InheritanceTest1  {
	public static void main(String[] args) {
		C objc = new C();
		System.out.println("objc객체의 객체 속성 변수 aa의 값은 " + objc.aa);  // 1
		 									// 오류 발생. private로 선언되어서.. 
		//System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb);
		                       
										                 // 메소드로 접근하면 된다.
		System.out.println("objc객체의 객체 속성 변수 bb의 값은 " + objc.bb());	  // 2
		
		System.out.println("objc객체의 객체 속성 변수 cc의 값은 " + objc.cc);  // 3
	}
}

/*
private로 선언된 맴버변수나 메소드는 사용 불가능.
하지만 메소드를 이용하여 간접적으로 값을 가져다 사용 가능.
*/