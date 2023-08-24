class Date{
	private int year;
	private String month;
	private int day;

	public Date() {  // �⺻ ������ 
		this(1900, "1�� ", 1);
	}
	
	public Date(int year) {  // ������ �����ε�
		this(year, "5�� ", 18);
	}
	
	public Date(int year, String month, int day) {
		this.year = year;  // this�� ���� ��ü = ���� ��ü ���� year
		this.month = month;
		this.day = day;
	}
	
	// �������̵��Ͽ� ���.
	// �ֻ��� Ŭ������ Object�� �ִ� �޼ҵ���.
	// �ڵ����� ȣ��Ǵ� �޼ҵ�
	public String toString() {
		return year + "��  " + month + day + "��";
	}
}

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(2023, "5��", 1);
		Date date2 = new Date(2023);
		Date date3 = new Date();
		System.out.println(date1);   // 2023�� 5��1�� 
		System.out.println(date2);   // 
		System.out.println(date3);   // 
	}
}
