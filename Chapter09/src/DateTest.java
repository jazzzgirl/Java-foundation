class Date{
	private int year;
	private String month;
	private int day;

	public Date() {  // 기본 생성자 
		this(1900, "1월 ", 1);
	}
	
	public Date(int year) {  // 생성자 오버로딩
		this(year, "5월 ", 18);
	}
	
	public Date(int year, String month, int day) {
		this.year = year;  // this는 현재 객체 = 현재 객체 변수 year
		this.month = month;
		this.day = day;
	}
	
	// 오버라이딩하여 사용.
	// 최상위 클래스인 Object에 있는 메소드임.
	// 자동으로 호출되는 메소드
	public String toString() {
		return year + "년  " + month + day + "일";
	}
}

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(2023, "5월", 1);
		Date date2 = new Date(2023);
		Date date3 = new Date();
		System.out.println(date1);   // 2023년 5월1일 
		System.out.println(date2);   // 
		System.out.println(date3);   // 
	}
}
