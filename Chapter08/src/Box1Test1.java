class Box1 {
	// 속성 - 맴버 변수 / 초기값 없다. 묵시적 값이 자동 설정.
	int width;
	int height;
	int depth;
}
public class Box1Test1 {
	public static void main(String args[]) {
		// 객체 생성.
		Box1 mybox1 = new Box1();
		Box1 mybox2 = new Box1();
		// 일반 변수
		int vol1, vol2;

		// 속성값 지정.
		mybox1.width = 78;
		mybox1.height = 145;
		mybox1.depth = 87;

		mybox2.width = 48;
		mybox2.height = 45;
		mybox2.depth = 137;

		// 계산하여 출력.
		vol1 = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("첫 번째 박스의 부피는 " + vol1 + "입니다");

		vol2 = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("두 번째 박스의 부피는 " + vol2 + "입니다");
  }
}