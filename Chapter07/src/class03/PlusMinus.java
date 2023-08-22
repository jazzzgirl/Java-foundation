package class03;
/*
 * 작성일 : 2021년 4월 27일
 * 작성자 : 학과 학번 이름
 * 설명 : PlusMinus 클래스 생성.
 * 		더하기, 빼기 계산하는 기능이 있다.
 */
public class PlusMinus {
	// 속성 정의 - 변수 생성(선언)
	int plus, minus;
	
	// plus 기능 정의(메소드)
	// 2개의 정수형 값을 전달 받아 합계를 구한 값을 돌려준다.
	// 돌려준다 -> 메소드를 호출한 곳으로 리턴한다.
	public String plus(int x, int y) {
		plus = x + y;
		return "두 수의 합은 " + plus;
	}
	
	// minus 메소드 정의
	// 2개의 정수형 값을 전달 받아 차를 구하여 값을 돌려준다.
	public String minus(int x, int y) {
		minus = x - y;
		return "두 수의 차는 " + minus;
	}
}
