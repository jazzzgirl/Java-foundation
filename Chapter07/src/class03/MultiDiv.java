package class03;
/*
 * 작성일 : 2021년 4월 29일
 * 작성자 : 학과 학번 이름
 * 설명 : MultiDiv 클래스 생성.
 * 		곱하기, 나누기 기능이 있는 클래스.
 * 		더하기, 빼기 기능이 추가된 클래스.
 */
public class MultiDiv extends PlusMinus {
	// 속성 정의
	int multi;
	double div;
	
	
	// 곱하기 기능(메소드) 정의
	public String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	
	// 나누기 메소드 정의
	private String div(int x, int y) {
		div = x / y;
		return "두 수의 나눗셈은  " + div;
	}
}
