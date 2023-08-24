class Box7 {
	int width;
	int height;
	int depth;
	public Box7()  // 생성자 - 오버로딩
	{	// 생성자 내에서 단독으로 사용.
		// 반드시 첫 번째 라인에 위치!!!'
		// 클래스 내의 다른 생성자 호출할 때 사용.
		this(1,1,1);  // this 이용하여 3개의 매개변수 가진 생성자 호출
		System.out.println("매개 변수 없는 생성자 수행");
	}
	public Box7(int width, int height, int depth)  // 생성자 - 오버로딩
	{
		System.out.println("매개 변수(3개) 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class Box7Test1 {
	public static void main(String args[]) {
		Box7 mybox1 = new Box7();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 없음) : " + vol +"\n");

		mybox1 = new Box7(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 3개) : " + vol);
	}
}