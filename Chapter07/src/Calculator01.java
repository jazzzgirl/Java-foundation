// 클래스 생성. - 접근 한정자 사용하지 않음.
class PlusMinus01 {
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


class MultiDiv01 extends PlusMinus01 {
	// 속성 정의
	int multi;
	double div;
	
	// multi 메소드(기능) 정의
	public String multi(int x, int y) {
		multi = x * y;
		return "두 수의 곱은 " + multi;
	}
	// div 메소드(기능) 정의
	public String div(int x, int y) {
		div = x / y;
		return "두 수의 나눈 값은 " + div;
	}
}

public class Calculator01 {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus01 pm = new PlusMinus01();
		// MultiDiv 클래스로부터 객체 생성.
		MultiDiv01 md = new MultiDiv01();

		// 변수 선언.
		String sum, cha, multi, result;
		
		// 객체를 통해 PlusMinus클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출
		cha = pm.minus(10, 20);
		System.out.println(cha);
		
		// 객체를 통해서 multi 메소드 호출.
		multi = md.multi(10, 20);
		System.out.println(multi);
		
		// md 객체를 통해서 더하기 결과 출력
		result = md.plus(3, 5);
		System.out.println(result);

	}

}
