class Box8 {
	int width;
	int height;
	int depth;
	
	public Box8(int width, int height, int depth)  // 생성자
	{
		this.width = width;    // 현재 객체 변수에  매개 변수의 width 값 저장.
		this.height = height;
		this.depth = depth;
	}
	
	int volume()  // 메소드
	{
		int vol = width * height * depth;
		return vol;
	}
}

public class Box8Test1 {
	public static void main(String args[]) {
		Box8 mybox1 = new Box8(10,20,30);
		mybox1.width = 20;   
		int vol1 = mybox1.volume();  
		System.out.println("정수 박스의 부피 : " + vol1);
	}
}