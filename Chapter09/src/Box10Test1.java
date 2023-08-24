class Box10 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNum;		// private 으로 선언
	private static long boxID = 0;  // 클래스 변수. static 으로 정의 
	
	public Box10(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		idNum = ++boxID;
		volume();   // 메소드 호출.
	}
	
	private void volume()
	{
		vol = width * height * depth;		
	}
	
	public String getvolume() {
		return idNum +"번 박스의 부피 : "+ vol;
	}
	
	public static long getCurrentID() {   // 클래스 메소드. static 으로 정의 
		int i;
		//return idNum;    // 객체 변수 사용하면 오류 발생.
		return boxID;       // 클래스 변수 사용.
		// 클래스 메소드에서는 반드시 클래스 변수와 여기서 만든 지역 변수만 사용 가능하다.
	}   
}

public class Box10Test1 {
	public static void main(String args[]) {
		Box10 mybox1;
		for(int i=1 ; i <= 5 ; i++) {
			mybox1 = new Box10(i,i+1,i+2);
			System.out.println(mybox1.getvolume());
		}
		System.out.println("마지막 생성된 박스 번호는 "+ Box10.getCurrentID() + "번입니다");
												// 클래스 명으로 클래스 메소드 호출
		//System.out.println(Box10.boxID);
						// boxID가 클래스 변수이지만 private 으로 선언되어 있어서 접근 불가능.
	}
}