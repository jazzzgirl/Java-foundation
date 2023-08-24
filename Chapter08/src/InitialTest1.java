class Initial{
	// 멤버 변수. 묵시적 값 설정. 클래스 전체에서 사용.
	// 클래스 내 메소드 밖에 선언.
	int number;
	double rate;
	String name;
	int[] score;
	
	// 메소드 선언(소문자로 시작)
	public void aMethod() {
		int count;    // 메소드 지역 변수. 
		System.out.println(number);  // 0
		//System.out.println(count);  // 오류 -> 초기값이 없다.
	}
}
public class InitialTest1 {
	public static void main(String args[]) {
		// main()메소드 지역 변수. 초기값 없으면 오류
		int var1;
		double var2;
		
		// 객체 생성.
		Initial ob1 = new Initial();
		
		System.out.println("지역 변수 var1의 값은 : " + var1);  // 오류
		System.out.println("지역 변수 var2의 값은 : " + var2);  // 오류
 		System.out.println("객체 변수 number의 값은 : " + ob1.number);  // 0 출력
		System.out.println("객체 변수 rate의 값은 : " + ob1.rate);  // 0.0 출력
		System.out.println("객체 변수 name의 값은 : " + ob1.name);  // null 출력
													// 묵시적 값 null 출력
		System.out.println("객체 변수 score의 값은 : " + ob1.score);
		// 객체의 메소드 호출 
		ob1.aMethod();  // 0 출력
	}
}