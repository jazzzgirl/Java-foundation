class Box9 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	public Box9(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		volume();   // private 이어도 같은 클래스 내에서 생성자가 호출 가능.
	}
	
	private void volume()  // private 으로 메소드 선언.
	{
		vol = width * height * depth;		
	}
	
	public int getvolume() {
		return vol;
	}
}

public class Box9Test1 {
	public static void main(String args[]) {
		Box9 mybox1 = new Box9(10,20,30);
		//mybox1.width = 20;  // width 객체 변수가 private 로 선언되어 변경 불가능
		//int vol1 = mybox1.volume();  // private 로 선언된 메소드는 객체로 바로 접근 불가능하여 오류 발생.
		System.out.println("정수 박스의 부피 : " + mybox1.getvolume());
	}
}