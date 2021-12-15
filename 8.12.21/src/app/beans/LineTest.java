package app.beans;

public class LineTest {
	public static void main(String[] args) {
		Line l1 = new Line();
		System.out.println(l1.draw());
		l1.setLength(10);
		System.out.println(l1.draw());
	}
}
