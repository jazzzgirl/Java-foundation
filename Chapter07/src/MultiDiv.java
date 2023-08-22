/*
 * 작성일 : 2021년 4월 29일
 * 작성자 : 학과 학번 이름
 * 설명 : MultiDiv 클래스 생성.
 * 		곱하기, 나누기 계산하는 기능이 있다.
 * 		그리고 더하기 빼기 기능도 있다.(추가)
 */
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
