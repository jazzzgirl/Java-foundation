import java.util.Scanner;

class Ramyon1 {   // 일반 라면 클래스
	String ramyon="라면";  // 속성
	String water="물";
	String onion="파";
	
	void boilwater() {  // 물을 끓이는 메소드
		System.out.println(water+"을 끓인다");
	}
	void cooking() {  // 요리를 완성하는 메소드
		System.out.println(ramyon+"과 "+onion+"를 넣고 끓여 요리완성. 맛있게 드세요!!!\n");		
	}
}

class RiceRamyon1 extends Ramyon1 {  // 떡 라면 클래스
	String rice="떡";   // 추가되는 속성
	void topping() {  // 떡 토핑 메소드  기능 추가
		System.out.println(rice+"을 넣는다");			
	}
}	

class CheeseRamyon1 extends Ramyon1 {  // 치즈 라면 클래스
	String cheese = "치즈";
	void topping() {  // 치즈 토핑 메소드
		System.out.println(cheese+"를 넣는다");		
	}
}

public class CompositeRamyonTest {
	public static void main(String args[]) {
		int cook;
		do {
			System.out.print("만들고 싶은 요리를 입력하세요(1:일반라면,2:떡라면,3:치즈라면,99:종료) : ");
			Scanner stdin = new Scanner(System.in);
			cook = stdin.nextInt();
			if (cook == 1) {
				Ramyon1 r = new Ramyon1();
				r.boilwater();
				r.cooking();
			} else if (cook == 2) {
				RiceRamyon1 rr = new RiceRamyon1();
				rr.boilwater();
				rr.topping();
				rr.cooking();
			} else if (cook == 3) {
				CheeseRamyon1 cr = new CheeseRamyon1();
				cr.boilwater();
				cr.topping();
				cr.cooking();
			}
		} while (cook != 99);
		System.out.print("감사합니다");	
	}
}

