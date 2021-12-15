package a;

public class Point {
	
	private int x;
	private int y;
	
	void print() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int newX) {
		if (newX >= -100 && newX <= 100) {
			x = newX;
		}
		else {
			System.out.println("Invalid value");
			System.out.println("Please enter value between -100 to 100");
		}
	}
	public void setY(int newY) {
		if (newY >= -100 && newY <= 100) {
			y = newY;
		}
		else {
			System.out.println("Invalid value");
			System.out.println("Please enter value between -100 to 100");
		}
	}
	
	void moveRight() {
		x++;
	}
	void moveLeft() {
		x--;
	}
	void moveUp() {
		y++;
	}
	void moveDown() {
		y--;
	}
	
	
	

}
