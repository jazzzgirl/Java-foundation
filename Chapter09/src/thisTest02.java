/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 예약에 this 예제 2 - 의미 있는 단어로 매개 변수 선언.
 */
class Box2 {
	int width;   // 멤버 변수
	int height;
	int depth;
	
	// 생성자.
	public Box2(int width, int height, int depth)
	{
		width = width;   // 의미있는 매개 변수를 사용 했을 때, 경고 메세지.
		height = height; // 나 자신에게 나 자신의 값을 배정하라는 의미....
		depth = depth;
	}
}

public class thisTest02 {
	public static void main(String[] args) {
		Box2 mybox = new Box2(10,20,30);
	    System.out.println(mybox.width);
	    // 결과는 의미 없는 0이 출력된다.
	}
}
