/*
 * 작성일 : 
 * 작성자 : 
 * 설명 : 상속의 개요 - 예제 10.1
 */
import java.util.Scanner;

// 기본 라면 클래스
class Ramyon {
	String ramyon = "라면";   // 클래스 속성, 객체 변수
	String water = "곰탕";
	String onion = "파";
	String garlic = "마늘";
	
	void boilwater() {   // 물을 끓이는 메소드 선언
		System.out.println(water+"을 끓인다");
	}
	void cooking() {     // 요리를 완성하는 메소드
		System.out.println(ramyon + "과 " + onion + "와 " + garlic + "을 넣고 끓여 요리완성. 맛있게 드세요!!!");		
	}
}

// 떡라면 클래스
class RiceRamyon extends Ramyon {    // 기본 라면 클래스로 부터 상속(속성과 기능) 받음.
	String topp="떡";   // 객체 변수
	
	void topping() {   // 떡 토핑을 추가하는 메소드
		System.out.println(topp+"을 넣는다");			
	}
}	

// 치즈 라면 클래스
class CheeseRamyon extends Ramyon {   // 기본 라면 클래스로부터 상속 받음.
	String topp = "치즈";   // 객체 변수
	
	void topping() {    // 치즈 추가하는 메소드.
		System.out.println("아차~! 깜빡했네.." + topp+"를 라면에 올려서 맛있게 먹어요~");		
	}
}

// 만두 라면 클래스 



public class RamyonTest {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("만들고 싶은 요리를 입력하세요(1:일반라면,2:떡라면,3:치즈라면,4:만두라면,99:종료) : ");
			Scanner stdin = new Scanner(System.in);
			s = stdin.nextInt();
			
			if (s == 1) {
				Ramyon r = new Ramyon();
				r.boilwater();
				r.cooking();
			} else if (s == 2) {
				RiceRamyon rr = new RiceRamyon();
				rr.boilwater();  // 상위 클래스에서 상속된 기능 사용.
				rr.topping();    // 떡라면 클래스의 토핑 메소드 호출.
				rr.cooking();    // 상위 클래스에서 상속된 기능 사용.
			} else if (s == 3) {
				CheeseRamyon cr = new CheeseRamyon();
				cr.boilwater();  // 상위 클래스에서 상속된 기능 사용.		
				cr.cooking();    // 상위 클래스에서 상속된 기능 사용.
				cr.topping();    // 치즈 클래스의 토핑 메소드 호출.
			}
		} while ( s != 99);
		System.out.print("감사합니다");	
	}
}