import java.util.Scanner;

class Box {   // 클래스
	int width; // 멤버변수들. 클래스 전역에서 사용 가능.
	int height;
	int depth;

	// 생성자. - 매개 변수가 3개인 생성자.
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
	
	// 매개 변수가 없는 생성자.
	public Box() {
		width = 1;
		height = 2;
		depth = 3;
	}
}

public class Volume {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		int w = stdIn.nextInt();   
		System.out.print("높이 입력 : ");
		int h = stdIn.nextInt(); 
		System.out.print("깊이 입력 : ");
		int d = stdIn.nextInt(); 
		
		// 객체 만들기
		Box mybox1 = new Box(w, h, d);
		int vol = mybox1.width * mybox1.height * mybox1.depth;
		System.out.println("입력 받은 값의 박스 부피 : " + vol);
		
		Box mybox2 = new Box();
		vol = mybox2.width * mybox2.height * mybox2.depth;
		System.out.println("정해진 값의 박스 부피 : " + vol);
	}
}