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
		volume();   // private �̾ ���� Ŭ���� ������ �����ڰ� ȣ�� ����.
	}
	
	private void volume()  // private ���� �޼ҵ� ����.
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
		//mybox1.width = 20;  // width ��ü ������ private �� ����Ǿ� ���� �Ұ���
		//int vol1 = mybox1.volume();  // private �� ����� �޼ҵ�� ��ü�� �ٷ� ���� �Ұ����Ͽ� ���� �߻�.
		System.out.println("���� �ڽ��� ���� : " + mybox1.getvolume());
	}
}