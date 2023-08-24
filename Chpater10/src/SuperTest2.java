/*
 * 작성일 : 
 * 작성자 :
 * 설명 : 예제 10.10 super 예제 
 */
class D1 {
	int x = 1000;
	void display() {
		System.out.println("상위 클래스 D1의 display() 메소드입니다");
	}
}
class D2 extends D1 {
	int x = 2000;
	void display() {   // 메소드 오버라이딩.
		System.out.println("하위 클래스 D2의 display() 메소드입니다");
	}
	void write() {
		display();        // 같은 클래스 내의 display() 메소드 호출
		super.display();  // 상의 클래스의 display() 메소드 호출
		System.out.println("D2 클래스 객체의 x 값은 : " + x);  // 이 클래스의 맴버 변수 출력
												// 상위 클래스의 맴버 변수 출력
		System.out.println("D1 클래스 객체의 x 값은 : " + super.x); 
	}
}
class SuperTest2 {
	public static void main(String args[]) {
		D2 d = new D2();
		d.write();
	}
}

