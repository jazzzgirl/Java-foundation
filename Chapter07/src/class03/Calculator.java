package class03;
/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : PlusMinus 클래스로부터 객체 생성.
 * 		 결과 출력.
 */
public class Calculator {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus();
		// MultiDiv 클래스로부터 객체 생성.
		MultiDiv md = new MultiDiv();

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
		
		// md 객체를 통해 plus 메소드 호출.
		result = md.plus(3, 5);
		System.out.println(result);
		
		result = md.div(2,3);
	}
}
