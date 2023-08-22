public class PlusMinusTest1 {

	public static void main(String[] args) {
		// PlusMinus 클래스로부터 객체 생성.
		PlusMinus pm = new PlusMinus();
		
		// 변수 선언.
		String sum, cha;
		
		// 객체를 통해 PlusMinus클래스에 있는 메소드 호출
		sum = pm.plus(10, 20);
		System.out.println(sum);
		
		// 객체를 통해서 minus 메소드 호출
		cha = pm.minus(10, 20);
		System.out.println(cha);
	}
}