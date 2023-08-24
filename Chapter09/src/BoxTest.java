class Box21 {
	int width;
	int height;
	int depth;
	
	public Box21(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}
public class BoxTest {

	public static void main(String[] args) {
		Box21 mybox = new Box21(10,20,30);
	    System.out.println(mybox.width);
	}
}