/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 예약에 this 예제 4 - this의 다른 용도 : 다른 생성자 호출 시 사용.
 */
class Box4 {
	int width;
	int height;
	int depth;
	
	public Box4() { // 생성자 - 오버로딩
		// 생성자 내에서 단독으로 사용. 반드시 첫 번째 라인에 위치해야 한다.
		// 클래스 내의 다른 생성자 호출을 위해서 사용.
		this(1,1,1);   // 매개변수가 3개인 생성자를 호출하시오.
		System.out.println("매개 변수 없는 생성자 수행");
	}
	
	public Box4(int width, int height, int depth) { // 생성자 - 오버로딩	
		System.out.println("매개 변수(3개) 생성자 수행");
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}

public class thisTest04 {
	public static void main(String[] args) {
		Box4 mybox1 = new Box4();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 없음) : " + vol +"\n");
	    
	    mybox1 = new Box4(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 3개) : " + vol);
	}
}
