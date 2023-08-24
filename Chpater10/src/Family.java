/*
 * 작성일 :
 * 작성자 :
 * 설명 : 오버라이딩 예제
 */
class Parent {
	// 메소드 생성
	public void print() {
		System.out.println("부모 클래스 print()메소드");
	}
}
				  // 상속
class Child extends Parent {
	//  상위 클래스의 print() 메소드 오버라이딩
	@Override
	public void print() {
		super.print();    // 상위 클래스 메소드 호출.
		// 재정의할 내용 작성.
		System.out.println("자식 클래스 print()메소드");
	}
}

public class Family {
	public static void main(String[] args) {
		Child result = new Child();
		result.print();   // 자식 클래스의 메소드 호출.
	}
}
