/*
 * �ۼ��� :
 * �ۼ��� :
 * ���� : �������̵� ����
 */
class Animal {
	// �޼ҵ� ����.
	public void eat() {
		System.out.println("������ �԰� �ִ�.");
	}
}

//Animal Ŭ�����κ��� ���.
class Dog extends Animal {
	// �޼ҵ� ����. �������̵�(������)
	@Override
	public void eat() {
		super.eat();
		System.out.println("�������� �԰� �ִ�.");
	}
}

public class DogTest {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();  // �����ǵ� ���� Ŭ������ �޼ҵ尡 ȣ��.
	}
}
