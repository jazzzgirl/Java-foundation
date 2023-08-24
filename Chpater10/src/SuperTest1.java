/*
 * 작성일 : 
 * 작성자 :
 * 설명 : 예제 10.9 super 예제
 */
class SB1 {
	public int x = 500;
	public int y = 1000;
}
class SB2 extends SB1 {
	public String x = "처음 시작하는 자바";
	public String xx = x + super.x;  // 상위 클래스의 맴버번수 x에 접근
	public String yy = ""+ y + " "+ super.y;   // 상위 클래그의 맴버변수 y에 접근
							// y == super.y
	}
public class SuperTest1 {
	public static void main(String args[]) {
		SB2 sb2 = new SB2();
		System.out.println("객체 sb2에 들어 있는 x,y 값 : " + sb2.x + sb2.y);
		//sb2.super.x 이와 같은 사용은 허용 안 됨
		System.out.println("객체 sb2에 들어 있는 xx 값 : " + sb2.xx);
		System.out.println("객체 sb2에 들어 있는 yy 값 : " + sb2.yy);
	}
}

