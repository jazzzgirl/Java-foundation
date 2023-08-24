/*
 * 작성일 : 
 * 작성자 :
 * 설명 : 예제 10.18 
 */
import java.util.Scanner;

class Ramyon2 {
	String ramyon="라면";
	String water="물";
	String onion="파";
	void boilwater() {
		System.out.println(water+"을 끓인다");
	}
	void cooking() {
		System.out.println(ramyon+"과 "+onion+"를 넣고 끓여 요리완성. 맛있게 드세요!!!");		
	}
}

class RiceRamyon2 {
	Ramyon2 rm = new Ramyon2();  // 객체 선언하여 포함관계 선언.
	String rice="떡";
	void topping() {
		System.out.println(rice+"을 넣는다");			
	}
}	

class CheeseRamyon2 {
	Ramyon2 rm = new Ramyon2();  // 객체 선언하여 포함관계 선언.
	String cheese = "치즈";
	void topping() {
		System.out.println(cheese+"를 넣는다");		
	}
}

public class CompositeRamyonTest2 {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("만들고 싶은 요리를 입력하세요(1:일반라면,2:떡라면,3:치즈라면,99:종료) : ");
			Scanner stdin = new Scanner(System.in);
			s = stdin.nextInt();
			if (s == 1) {
				Ramyon2 r = new Ramyon2();
				r.boilwater();
				r.cooking();
			} else if (s == 2) {
				RiceRamyon2 rr = new RiceRamyon2();
				rr.rm.boilwater();
				rr.topping();
				rr.rm.cooking();
			} else if (s == 3) {
				CheeseRamyon2 cr = new CheeseRamyon2();
				cr.rm.boilwater();
				cr.topping();
				cr.rm.cooking();
			}
		} while ( s != 99);
		System.out.print("감사합니다");	
	}
}

