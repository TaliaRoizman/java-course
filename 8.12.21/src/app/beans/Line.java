package app.beans;

public class Line {
	private int length;

	public Line() {
	}

	public Line(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String draw() {
		String a = "";
		System.out.println("Length: " + length);
		for(int i = 1; i <= length; i++) {
			a = a + "*";
		}
		return a;
	}
}
