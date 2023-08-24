/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 메소드 오버로딩 - 예제 9.9
 */
class Box11 {
	private int ivol;     // 객체 변수(속성)
	private double dvol;  // 객체 변수
	
	public Box11(int w, int h, int d)   // 생성자 오버로딩
	{
		volume(w,h,d);   // 3개의 정수형 매개변수 값을 가지고 volume 메소드 호출
	}
	public Box11(double w, double h, double d)   // 생성자 오버로딩
	{
		volume(w,h,d);   // 3개의 실수형 매개변수 값을 가지고 volume 메소드 호출
	}
	
	// 메소드 오버로딩 - 돌려주는 값이 없다.  외부에서 접근 불가능.
	private void volume(int w, int h, int d)  // 같은 클래스 내에서 생성자나 메소드가 호출해서 사용 가능.
	{
		ivol = w * h * d;	  // 3개의 정수 값을 전달 받아 부피를 계산한다.	
	}
	private void volume(double w, double h, double d)  // 메소드 오버로딩
	{
		dvol = w * h * d;	  // 3개의 실수 값을 전달 받아 부피를 계산한다.
	}
	
	public int get_ivol() {   // 메소드
		return ivol;    // 정수형 값으로 계산된 부피의 결과를 돌려준다.
	}
	public double get_dvol() {   // 메소드
		return dvol;    // 실수형 값으로 계산된 부피의 결과를 돌려준다.
	}
}

// 메인 메소드가 있는 클래스.
public class Box11Test1 {
	public static void main(String args[]) {
		Box11 mybox1 = new Box11(10,20,30);  // 객체 생성. - 매개변수가 정수형 3개인 생성자 호출. 
		System.out.println("박스의 부피(정수 매개 변수) : " + mybox1.get_ivol());
		
		mybox1 = new Box11(10.5, 20.5, 30.5);  // 객체 생성. - 매개변수가 실수형 3개인 생성자 호출. 
		System.out.println("박스의 부피(실수 매개 변수) : " + mybox1.get_dvol());
		
		mybox1 = new Box11(10,20,30.5);   // 자동 확대 - 실수형 생성자 호출.
		System.out.println("박스의 부피(정수와 실수 혼합) : " + mybox1.get_dvol());
	}
}