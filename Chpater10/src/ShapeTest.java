public class ShapeTest {

	public static void main(String[] args) {
		// �簢���� ����
		Shape area = new Shape();
		System.out.println("�簢���� ���� : " + area.width() * area.height());
		
		// ������ü�� ����
		Cube volume = new Cube();
		System.out.println("������ü ���� : " + volume.width() * volume.height() * volume.depth);
	}
}