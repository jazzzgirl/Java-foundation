/*
 * �ۼ��� : 
 * �ۼ��� :
 * ���� : ���� 10.18 
 */
import java.util.Scanner;

class Ramyon2 {
	String ramyon="���";
	String water="��";
	String onion="��";
	void boilwater() {
		System.out.println(water+"�� ���δ�");
	}
	void cooking() {
		System.out.println(ramyon+"�� "+onion+"�� �ְ� ���� �丮�ϼ�. ���ְ� �弼��!!!");		
	}
}

class RiceRamyon2 {
	Ramyon2 rm = new Ramyon2();  // ��ü �����Ͽ� ���԰��� ����.
	String rice="��";
	void topping() {
		System.out.println(rice+"�� �ִ´�");			
	}
}	

class CheeseRamyon2 {
	Ramyon2 rm = new Ramyon2();  // ��ü �����Ͽ� ���԰��� ����.
	String cheese = "ġ��";
	void topping() {
		System.out.println(cheese+"�� �ִ´�");		
	}
}

public class CompositeRamyonTest2 {
	public static void main(String args[]) {
		int s;
		do {
			System.out.print("����� ���� �丮�� �Է��ϼ���(1:�Ϲݶ��,2:�����,3:ġ����,99:����) : ");
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
		System.out.print("�����մϴ�");	
	}
}

