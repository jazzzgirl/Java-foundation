public class C_Main {
	int count = 10;   // 객체 변수
	static int num = 20;  // 클래스 변수
	
	public int sum(int x, int y) {   // 메소드 선언.
		return x + y;
	}
	
	static int mul(int x, int y) {  // 클래스 메소드 선언.
		return x * y;
	}

	public static void main(String[] args) {  // 메인 메소드.(클래스 메소드)
		
		int same;   // 메인 메소드에서 선언한 지역 변수.
		same = count;   		// 클래스 변수가 아님.  일반 객체 변수라 사용 불가능.
		//same = num;
		System.out.println("num : " +same);
		
		same = sum(5,5);  	// 클래스 메소드가 아니라서 호출 불가능.
		//same = mul(5,5);
		System.out.println("mul : " +same);
	}
}
