package app.core;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		int getArea = length * width;
		return getArea;
	}
	
	public int getParimeter() {
		int getParimeter = length*2 + width*2;
		return getParimeter;
	}
}
