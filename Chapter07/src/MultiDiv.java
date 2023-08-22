public class MultiDiv extends PlusMinus {
	// 속성 정의
	int multi;
	double div;
	
	// multi 메소드(기능) 정의
	public String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	// div 메소드(기능) 정의
	private String div(int x, int y) {
		div = x / y;
		return "두 수의 나눈 값은 " + div;
	}
}
