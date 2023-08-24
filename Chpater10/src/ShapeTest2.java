/*
 * 작성일 : 
 * 작성자 :
 * 설명 : super 예제 
 */
class Shape2{
	private int x;
	private int y;
	
	public Shape2(int x, int y) {  // 
		System.out.println("Shape");
		this.x = x;  //
		this.y = y;  //
	}
}

class Rectangle2 extends Shape2{
	private int width;
	private int height;
	
	public Rectangle2(int x, int y, int width, int height) {  //
		super(x, y);    // 
		System.out.println("Rectangle");
		this.width = width;
		this.height = height;
	}
}

class  ColorRectangle extends Rectangle2{
	private String color;
	
	public ColorRectangle(int x, int y, int width, int height, String color) {
		super(x, y, width, height);   // 
		System.out.println("ColorRectangle");
		this.color = color;
	}
}

public class ShapeTest2 {
	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(10, 10, 20, 20, "red");
	}
}

/*
 * 결과
 */
