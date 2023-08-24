public class Shape {
	private int width = 10;  // private로 선언.
	private int height= 20;  // 메소드를 통해서 접근 가능.
	
	public int width() {
		return width;  // 이 메소드로 멤버변수 접근
	}
	
	public int height() {
		return height;
	}
}
