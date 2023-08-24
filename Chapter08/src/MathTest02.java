/*
 * 2개의 정수를 입력 받아 합을 출력하시오.
 * 클래스와 메소드 사용.
 */

import java.util.Scanner;

class Math02{  // 계산해 주는 클래스
	// 멤버 변수는 없고, 메소드만 있는 클래스
	public int add(int x, int y) {  // 2개의 매개 변수가 있는 더하기 메소드
		return x + y;  // 메소드를 호출한 곳으로 값을 돌려줌(리턴).
	}
}

public class MathTest02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Math02 obj = new Math02();  // Math 클래스로부터 객체 생성.
		
		System.out.print("첫 번째 정수 입력 : ");
		int x = stdIn.nextInt();   
		System.out.print("두 번째 정수 입력 : ");
		int y = stdIn.nextInt();  
		
		// 입력 받은 값이 Math 클래스의 add() 메소드로 전달됨(메소드 호출).
		int sum = obj.add(x, y);  
		System.out.println(x + " + " + y + " = " + sum);
	}
}
