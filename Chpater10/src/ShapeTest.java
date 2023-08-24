public class ShapeTest {

	public static void main(String[] args) {
		// 사각형의 넓이
		Shape area = new Shape();
		System.out.println("사각형의 넓이 : " + area.width() * area.height());
		
		// 직육면체의 부피
		Cube volume = new Cube();
		System.out.println("직육면체 부피 : " + volume.width() * volume.height() * volume.depth);
	}
}