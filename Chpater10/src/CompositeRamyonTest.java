import java.util.Scanner;

class Ramyon1 {   // �Ϲ� ��� Ŭ����
	String ramyon="���";  // �Ӽ�
	String water="��";
	String onion="��";
	
	void boilwater() {  // ���� ���̴� �޼ҵ�
		System.out.println(water+"�� ���δ�");
	}
	void cooking() {  // �丮�� �ϼ��ϴ� �޼ҵ�
		System.out.println(ramyon+"�� "+onion+"�� �ְ� ���� �丮�ϼ�. ���ְ� �弼��!!!\n");		
	}
}

class RiceRamyon1 extends Ramyon1 {  // �� ��� Ŭ����
	String rice="��";   // �߰��Ǵ� �Ӽ�
	void topping() {  // �� ���� �޼ҵ�  ��� �߰�
		System.out.println(rice+"�� �ִ´�");			
	}
}	

class CheeseRamyon1 extends Ramyon1 {  // ġ�� ��� Ŭ����
	String cheese = "ġ��";
	void topping() {  // ġ�� ���� �޼ҵ�
		System.out.println(cheese+"�� �ִ´�");		
	}
}

public class CompositeRamyonTest {
	public static void main(String args[]) {
		int cook;
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���(1:�Ϲݶ��,2:�����,3:ġ����,99:����) : ");
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
		System.out.print("�����մϴ�");	
	}
}

