/*
 * 작성일 :
 * 작성자 :
 * 설명 : 오버라이딩 예제
 */
class Animal {
	// 메소드 생성.
	public void eat() {
		System.out.println("동물이 먹고 있다.");
	}
}

//Animal 클래스로부터 상속.
class Dog extends Animal {
	// 메소드 생성. 오버라이딩(재정의)
	@Override
	public void eat() {
		super.eat();
		System.out.println("강아지가 먹고 있다.");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();  // 재정의된 하위 클래스의 메소드가 호출.
	}
}
