/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 예약에 this 예제 3 - this 사용.
 */
class Box3 {
	int width;   // 멤버 변수, 객체 변수
	int height;
	int depth;
	
	// 생성자.
	// 매개 변수 명과 객체 변수 명이 같은 경우, 객체변수를 의미하는 this를 사용한다.
	public Box3(int width, int height, int depth)
	{
		this.width = width;  // this.width = 객체 변수 의미. 
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest03 {
	public static void main(String[] args) {
		Box3 mybox = new Box3(10,20,30);
	    System.out.println(mybox.width);
	}
}
