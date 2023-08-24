/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 예제 9.3 - 생성자 오버로딩 - 매개변수의 형이 달라야 한다.
 */
class Box6 {
	int width;  // 멤버변수들. 클래스 전역에서 사용 가능.
	int height;
	int depth;
	
	double dwidth;
	double dheight;
	double ddepth;
	
	// 생성자 오버로딩 - 매개변수의 개수는 같으나 매개변수의 형이 각각 다르다.
	public Box6(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	public Box6(double w, double h, double d) {
		dwidth = w;
		dheight = h;
		ddepth = d;
	}
}

public class Box6Test1 {
	public static void main(String args[]) {
		// 매개변수가 정수형인 생성자 호출.
		Box6 mybox1 = new Box6(10,20,30);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("박스의 부피(정수 매개 변수) : " + vol);
		
		// 매개 변수가 실수형인 생성자 호출.
		mybox1 = new Box6(10.5, 20.5, 30.5);
		double dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(실수 매개 변수) : " + dvol);
		
		// 인수 값이 정수, 실수로 혼합되어 있는 경우 자동으로 확대형으로 변환되어 생성자 호출.
		mybox1 = new Box6(10,20,30.5);
		dvol = mybox1.dwidth * mybox1.dheight * mybox1.ddepth;
		System.out.println("박스의 부피(정수와 실수 혼합) : " + dvol);
	}
}
