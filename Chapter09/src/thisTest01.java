/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 예약에 this 예제 1
 */
class Box1 {
	int width;   // 멤버 변수, 객체변수
	int height;
	int depth;
	
	// 생성자.
	public Box1(int w, int h, int d)
	{
		width = w;
		height = h;
		depth = d;
	}
}

public class thisTest01 {
	public static void main(String[] args) {
		Box1 mybox = new Box1(10,20,30);
	    System.out.println(mybox.width);
	}
}
