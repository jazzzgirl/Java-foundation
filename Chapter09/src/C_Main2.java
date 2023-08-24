public class C_Main2 {
	int count = 10;		   // 객체 변수
	static int num = 20;   // 클래스 변수.
	
	public int sum(int x, int y) {   // 일반 메소드
		return x + y;
	}
	
	static int mul(int x, int y) {   // 클래스 메소드
		return x * y;
	}
	
	public static void main(String[] args) {
		// 객체 만들어서 접근 하면 됨.
		C_Main2 s = new C_Main2();
		
		int same;  // 지역변수
		same = s.count;   // 객체를 통해서 객체 변수 사용.
		System.out.println("count : " + same);

		same = C_Main2.num;   // 클래스 변수이니까 클래스 명으로 접근 가능.
		System.out.println("num : " + same);
		
		// sum 메소드 호출. sum(5,5)
		same = s.sum(5, 5);
		System.out.println("sum : " + same);
		
		same = C_Main2.mul(5, 5);
		System.out.println("mul : " + same);
	}
}
